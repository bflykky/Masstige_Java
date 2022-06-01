package chap15;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner s = new Scanner(System.in);

		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다......");
			socket = listener.accept();
			System.out.println("연결되었습니다 :)");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				String inputMessage = in.readLine();
				if (inputMessage.equalsIgnoreCase("bye")) { //equals함수와 달리, equalsIgnoreCase 함수는 대소문자 구분 없이 문자열을 비교함.
					System.out.println("클라이언트에서 연결을 종료하였습니다.");
					break;
				}
				System.out.println("클라이언트: " + inputMessage);
				System.out.print("보내기 >>");
				String outputMessage = s.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			return;
		}
		finally {
			try {
				s.close();
				socket.close();
				listener.close();
			}
			catch(IOException e) {
				System.out.println("<close 오류> !! 채팅 종료 중 오류가 발생하였습니다.");
			}

		}

	}
}

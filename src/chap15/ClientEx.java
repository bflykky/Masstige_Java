package chap15;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner s = new Scanner(System.in);
		Socket socket = null;

		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.print("보내기 >>");
				String outputMessage = s.nextLine();
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();

				String inputMessage = in.readLine();
				System.out.println("서버: " + inputMessage);
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				s.close();
				if (socket != null) {
					socket.close();
				}
			}
			catch (IOException e) {
				System.out.println("<close 오류> !! 채팅 종료 중 오류가 발생하였습니다.");
			}

		}
	}
}

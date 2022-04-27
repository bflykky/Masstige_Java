import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println(Integer.parseInt("A3", 16));
//        Vector<Integer> v = new Vector<Integer>(3);
//        for (int i = 0; i < 10; i++) {
//            v.add(i);
//            System.out.println("현재 벡터 v의 용량: " + v.capacity());
//        }
//        System.out.println(v.capacity());

/*        FileOutputStream fout = new FileOutputStream("C:\\Users\\kkyxw\\Desktop\\video\\test.out");
        byte[] b = {1, 3, 5, 7, 9 , 11};
        for (byte num: b) {
            fout.write(num);
        }
*/

        FileInputStream fin = new FileInputStream("C:\\Users\\kkyxw\\Desktop\\video\\test.out");
        byte[] b = new byte[6];
        int n = 0, c;
        while ((c = fin.read()) != -1) {
            b[n] = (byte) c;
            n++;
        }

        for (byte num : b) {
            System.out.print(num + " ");
        }
    }
}
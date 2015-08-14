package lecture13;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Date;

/**
 * Class {@link lecture13.Main}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 12.08.2015
 */
public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("/home/tony/test.txt");
        System.out.println("Exists: " + file.exists()); // Проверка на наличие файла\директории.
        System.out.println("Is dir: " + file.isDirectory()); // Проверка на то директория ли это
        System.out.println("Canonical path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Parent dir: " + file.getParent());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can execute: " + file.canExecute());
        System.out.println("Last modified: " + new Date(file.lastModified()));
        System.out.println("List: " + Arrays.toString(file.list()));
        ioTest1(file);
        ioTest2(file);
        rwTest1(file);
        rwTest2(file);
    }

    private static void ioTest1(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        OutputStream os = new FileOutputStream("out-test.txt", true);
        int b;
        while((b = is.read()) != -1) {
            os.write(b);
        }
        is.close();
        os.flush();
        os.close();
    }

    private static void ioTest2(File file) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(file));
        OutputStream os = new BufferedOutputStream(new FileOutputStream("out-test.txt", true));
        int b;
        while((b = is.read()) != -1) {
            os.write(b);
        }
        is.close();
        os.flush();
        os.close();
    }

    private static void rwTest1(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        PrintWriter writer = new PrintWriter("out-test.txt");
        String b;
        while ((b = reader.readLine()) != null) {
            writer.printf("line: %s\n", b);
        }
        reader.close();
        writer.flush();
        writer.close();
    }

    private static void rwTest2(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b;
        while (!(b = reader.readLine()).equals("exit")) {
            System.out.println("your line: " + b);
        }
    }


}

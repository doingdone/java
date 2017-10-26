package io;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by zwd on 2017/10/26.
 */
public class ShowStream {

    public static void main(String[] args) {
//        showByteStream();
//        showCharStream();
        showBufferStream();
    }

    private static void showByteStream() {
        try {
            InputStream in = new FileInputStream("a.txt");
            byte[] content = new byte[1024];
            in.read(content);
            System.out.println(new String(content));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            OutputStream out = new FileOutputStream("a.txt");
            out.write("hello world\n中国好".getBytes());

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showCharStream() {
        try {
            Reader reader = new FileReader("a.txt");
            char[] content = new char[1024];
            reader.read(content);
            System.out.println(new String(content));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Writer writer = new FileWriter("a.txt");
            writer.write("hello world\n中国好".toCharArray());

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showBufferStream() {
        InputStream in;
        try {
            in = new FileInputStream("a.txt");
            BufferedInputStream bis = new BufferedInputStream(in);
            byte[] content = new byte[1024];
            bis.read(content);
            System.out.println(new String(content));
            bis.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OutputStream out;
        try {
            out = new FileOutputStream("a.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out);
            bos.write("hello world\n中国好".getBytes());
            bos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

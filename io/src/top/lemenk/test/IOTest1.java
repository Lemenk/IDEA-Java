package top.lemenk.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//字节流
public class IOTest1 {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();
    }

    //字节输入流FileInputStream
    public static void test1() {
        try {
            String path = "D:/IDEA-workspace/test/a.java";
            FileInputStream fis = new FileInputStream(path);
            byte[] b = new byte[5];//创建一个字节长度为5的字符数组，用于临时存放读出的字符。
            int len = 0;
            //从流中读取b的长度个字节的数据存储到b中，返回结果是读取的字节个数（当再次读时，如果返回-1说明到了结尾，没有了数据）
            while ((len = fis.read(b)) != -1) {
                System.out.print(new String(b, 0, len));//参数：字符数组；开始位置；分割长度即数组长度；
            }
            System.out.println();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节输入流BufferedInputStream
    public static void test2() {
        try {
            String path = "D:/IDEA-workspace/test/a.java";
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);//参数为其他流
            byte[] b = new byte[5];//创建一个字节长度为5的字符数组，用于临时存放读出的字符。
            int len = 0;
            //从流中读取b的长度个字节的数据存储到b中，返回结果是读取的字节个数（当再次读时，如果返回-1说明到了结尾，没有了数据）
            while ((len = bis.read(b)) != -1) {
                System.out.print(new String(b, 0, len));//参数：字符数组；开始位置；分割长度即数组长度；
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节输出流FileOutputStream
    public static void test3() {
        try {
            String path = "D:/IDEA-workspace/test/b.java";
            FileOutputStream fos = new FileOutputStream(path,true);//路径+是否追加
            String str = "I Like China!";
            fos.write(str.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节输出流BufferedOutputStream
    public static void test4() {
        try {
            String path = "D:/IDEA-workspace/test/b.java";
            FileOutputStream fos = new FileOutputStream(path,true);//路径+是否追加
            BufferedOutputStream bos = new BufferedOutputStream(fos);//参数为其他流对象
            String str = "I Like China!";
            bos.write(str.getBytes());
            bos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

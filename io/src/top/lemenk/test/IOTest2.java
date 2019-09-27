package top.lemenk.test;

import java.io.*;
//字符流
public class IOTest2 {
    static String filepathin = "D:/IDEA-workspace/test/src/top/lemenk/DoWhile.java";
    static String filepathout = "D:/IDEA-workspace/test/c.java";
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        test6();
    }

    //字节转换输入流InputStreamReader 字节流--->字符流
    private static void test1(){
        try {
            //参数1：字节输入流对象作为实例化参数。参数2（可选）：是字符编码方式，可以是编码方式的字符串形式，也可以是一个字符集对象
            InputStreamReader isr = new InputStreamReader(new FileInputStream(filepathin));
            int ch;
            while ((ch = isr.read())!=-1){
                System.out.print((char) ch);
            }
            isr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //字符输入流FileReader
    private static void test2() {
        try {
            FileReader fr = new FileReader(filepathin);
            char[] cbuf = new char[1024];
            int len;
            while ((len = fr.read(cbuf))!=-1){
                System.out.println(new String(cbuf,0,len));
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字符缓冲输入流
    private static void test3(){
        try {
            FileReader fr = new FileReader(filepathin);
            BufferedReader bf = new BufferedReader(fr);//将字符文件输入流作为对象
            String line;
            while ((line=bf.readLine())!=null){
                System.out.println(line);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //字符转换输出流OutputStreamWriter，字符流--->字节流
    private static void test4(){
        try {
            //两个参数，路径+是否追加
            FileOutputStream out = new FileOutputStream(filepathout,true);//创建一个字节文件输出流
            OutputStreamWriter osw = new OutputStreamWriter(out);
            osw.write("abcdefg");
            osw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字符输出流
    private static void test5(){
        try {
            FileWriter fw = new FileWriter(filepathout,true);
            fw.write("ABCDEFG");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字符缓冲输出流
    private static void test6(){
        try {
            FileWriter fw = new FileWriter(filepathout,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("我爱中国");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

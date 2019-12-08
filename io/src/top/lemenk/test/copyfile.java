package top.lemenk.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @Author: Lemenk
 * @Blog: blog.lemenk.top
 * @software: IDEA
 * @Date: Create in 16:43 2019/11/28
 * @filename: copyfile.java
 * @Desc: 文件复制，字符流
 */
public class copyfile {
    private static String filepathin = "D:/Java_lean/IDEA-Java/io/testfile/input.txt"; //文件位置
    private static String filepathout = "D:/Java_lean/IDEA-Java/io/testfile/output.txt";  //目标文件位置

    public static void main(String[] args) {
        copyfile();
    }

    private static void copyfile(){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filepathin));

            BufferedWriter bw = new BufferedWriter(new FileWriter(filepathout,true));

            int count = 1;  //行号
            String line;
            while ((line=bf.readLine())!=null){
                bw.write(count++ + ": " + line);  //格式：行号+内容
                bw.newLine();
            }
            bf.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("done");
        }
    }
}

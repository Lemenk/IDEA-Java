package top.lemenk.findrepeatchar;

import java.util.HashMap;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //stringRLE(s);
        //findChar(s);
    }
    //对字符串进行RLE压缩，将相邻的相同字符，用计数值和字符值来代替。
    public static void stringRLE(String s){
        s+="@";//加上@可避免数组越界，可得到最后一个字符
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for(int i=1;i<s.length();i++){
            if (s.charAt(i) == s.charAt(i - 1)) {//判断字符相邻是否相同
                count++;
            } else {
                sb.append(count + "" + s.charAt(i - 1));
                count = 1;
            }
        }
        System.out.println(sb.toString());
    }
    //计算一个字符串里面每个字符出现的次数
    public static void findChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                //获取集合中c的value，重新存入++count
                Integer count = map.get(c);
                map.put(c, ++count);
            } else {
                //如果集合中还没有，直接存入
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
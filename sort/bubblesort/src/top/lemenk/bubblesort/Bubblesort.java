package top.lemenk.bubblesort;

import java.util.Arrays;
//普通冒泡排序
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println("排序前："+Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("排序0后："+Arrays.toString(arr));
        bubblesort1(arr);
        System.out.println("排序1后："+Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr){
        //控制比较轮数
        for (int i=0 ; i<arr.length-1 ; i++){
            //控制比较的次数
             for(int j = 0 ; j < arr.length-1-i;j++){
                 if (arr[j] > arr[j+1]){
                     int tmp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1]= tmp;
                 }
             }
        }
    }
//优化算法
    public static void bubblesort1(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= tmp;
                    flag = true;//交换后将flag置为ture
                }
            }
            if (!flag){
                break;//已经没有交换了,则表明已经有序了，跳出循环
            }
        }
    }
}

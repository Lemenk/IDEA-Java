package top.lemenk.radixsort;

import java.sql.SQLOutput;
import java.util.Arrays;

//基数排序
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[] {23,6,189,46,2,365,4421,98,72,11,625};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void radixSort(int[] arr){
        //将数组中最大数字存放在max中
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //计算最大的数字是几位数
        int maxLength = (max+"").length();
        //定义一个二维数组，用来临时存储数据
        int[][] tmp = new int[10][arr.length];
        //定义一个数组，用来记录在tmp中相应的数组中存放数字的数量
        int[] counts = new int[10];
        //根据最大数字的位数决定比较的次数
        for (int i = 0,n=1; i<maxLength;i++,n*=10){//定义一个新变量，使其每次*=10
            for (int j = 0;j<arr.length;j++){
                int ys = (arr[j]/n)%10;//分别得到余数，即数每位上的数字
                tmp[ys][counts[ys]] = arr[j];//把当前遍历得到的数字放入指定的数组中
                counts[ys]++;
            }
            //记录取出的元素要放进原数组中的位置
            int index = 0;
            for (int k = 0;k<counts.length;k++){
                //记录数量的数组中当前玉树记录的数量部位0时
                if(counts[k]!=0){
                    //循环取出元素
                    for(int l =0;l<counts[k];l++){
                        //取出元素
                        arr[index] = tmp[k][l];
                        //记录下一个位置
                        index++;
                    }
                    //把记录数量的数组相应位置置为0
                    counts[k] = 0;
                }
            }
        }

    }

}

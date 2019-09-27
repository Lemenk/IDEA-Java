package top.lemenk.selectsort;

import java.util.Arrays;
//选择排序
public class SelectSort {
    public static void main(String[] args) {
        int[] data = {9,2,7,19,100,97,63,208,55,78};
        System.out.println("排序前："+Arrays.toString(data));
        selectSort(data);
        System.out.println("排序后："+Arrays.toString(data));
    }

    public static void selectSort(int[] data){
        int k = 0 , tmp = 0;   //k用来存放目前最小数字的下标
        for(int i = 0 ; i < data.length ; i++){
            k= i;
            for (int j = i+1;j<data.length;j++){
                if (data[j] < data[k]) { //找到最小的数字
                    k = j;
                }
            }
            tmp = data[k];
            data[k] = data[i];
            data[i] = tmp;
        }
    }
}

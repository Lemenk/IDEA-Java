package top.lemenk.quicksort;
//快速排序
public class QuickSort {
    public static void main(String[] args){
        int[] arr = {25,13,48,52,6,31,20};
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后：");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void quickSort(int[] arr,int left,int right){
        if (left < right){
            int index = getIndex(arr, left, right);
            //迭代，分别对index前和后的数组进行排序
            quickSort(arr,0,index-1);
            quickSort(arr,index+1,right);
        }
    }

    private static int getIndex(int[] arr,int left,int right){
        int tmp = arr[left];
        while(left < right){
            //从后往前遍历，若比tmp大，则right索引前移
            while(left < right && arr[right] >= tmp){
                right--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给left
            arr[left] = arr[right];
            // 当队首元素小于等于tmp时,向前挪动left指针
            while(left < right && arr[left] <= tmp){
                left++;
            }
            // 当队首元素大于tmp时,需要将其赋值给right
            arr[right] = arr[left];
        }
        //当left = right时跳出循环，此时left=right的位置就是基准数tmp的正确位置
        arr[left] = tmp;//将tmp赋值到正确位置
        //System.out.println(left);
        return left;//返回tmp的位置
    }
}

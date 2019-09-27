package top.lemenk.insertsort;
//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int[] data = {9,2,7,19,100,97,63,208,55,78};
        System.out.print("排序前:");
        for(int i = 0 ;i<data.length;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        insertsort(data);
        System.out.print("排序后:");
        for(int i = 0 ;i<data.length;i++){
            System.out.print(data[i] + " ");
        }
    }

    public static int[] insertsort(int[] data){
        int tmp = 0 ,j = 0;
        for (int i = 1; i < data.length ; i++){
            tmp = data[i];
            for (j = i - 1;j>=0;j--){
                if(data[j]>tmp){
                    data[j+1] = data[j];
                }else {
                    break;
                }
            }
            data[j+1] = tmp;
        }
        return data;
    }
}

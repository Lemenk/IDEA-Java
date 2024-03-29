package top.lemenk.mergesort;
//归并排序
public class MergeSort {
    public static void main(String[] args) {
        int i=0;
        int a[] = {5,4,9,8,7,6,0,1,3,2};
        int len = a.length;
        MergeSort(a,0,len-1);
        for(i=0; i<len; i++){
            System.err.print(a[i]+" ");
        }
    }
//通过递归方式，将数组分割成小块
    private static void MergeSort(int[] a, int p, int r) {
        if(p<r){
            int q = (p+r)/2;
//			p表示从子序列的哪个索引开始，q表示子序列中间的位置
            MergeSort(a,p,q);
            MergeSort(a,q+1,r);
            Merge(a,p,q,r);
        }
    }

    private static void Merge(int[] a, int p, int q, int r) {
//		n1和n2分别表示左边序列和右边序列的长度。左边从p开始包括q，右边从q+1开始
        int n1 = q-p+1;
        int n2 = r-q;
        int L[] = new int[n1];
        int R[] = new int[n2];
//		k用来表示当前遍历的数组a的索引
        int i=0,j=0,k=0;
//		分别给L和R赋值
        for(i=0,k=p; i<n1; i++,k++){
            L[i] = a[k];
        }
//		从右边开始
        for(j=0,k=q+1; j<n2; j++,k++){
            R[j] = a[k];
        }
//		比较大小,从小到大排列
        for(i=0,j=0,k=p; i<n1 && j<n2; k++){
            if(L[i] > R[j]){
                a[k] = R[j];
                j++;
            }else{
                a[k] = L[i];
                i++;
            }
        }//for
//		将两个数组中剩下的数放到a中
        if(i<n1){
            for(j=i; j<n1; j++,k++){
                a[k] = L[j];
            }
        }
        if(j<n2){
            for(i=j; i<n2; i++,k++){
                a[k] = R[i];
            }
        }
    }
}

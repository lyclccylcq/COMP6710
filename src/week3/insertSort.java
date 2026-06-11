package week3;

public class insertSort {
    public static void main(){
        int[] arr=new int[]{12,34,5,17,29};
        insertSorts(arr);
        for(int x:arr){
            IO.println(x);
        }
    }

    public static void insertSorts(int[] arr){
        int current=0;
        for(int i=1;i<arr.length;i++){
            current=arr[i];
            int j=i-1;

            while (j>=0&&arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=current;
        }
    }
}

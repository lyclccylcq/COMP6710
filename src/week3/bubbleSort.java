package week3;

public class bubbleSort {
    public static void main(String[] argus) {
        int[] arr = new int[]{34, 64, 25, 9, 16};
        bubbleSorts(arr);
        for(int x:arr){
            IO.println(x);
        }
    }

    public static void bubbleSorts(int[] arr) {
        int end = arr.length;
       while(end>1){
            for (int i = 0; i < end-1; i++) {
                if (arr[i] >arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            end--;
        }
    }
}

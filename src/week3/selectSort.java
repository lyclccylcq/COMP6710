package week3;

public class selectSort {
        public static void main(String[] argus){
            int[] arr={5,3,8,1,2};
            selectSorts(arr);
            for(int x:arr) {
                IO.println(x);
            }
    }
        static void selectSorts(int[] arr){
            int start=0;
            while(start<arr.length){
                for(int i=start;i<arr.length;i++){
                    if(arr[i]<arr[start]){
                        int temp=arr[i];
                       arr[i]=arr[start];
                       arr[start]=temp;
                    }
                }
                start++;
            }
        }
}


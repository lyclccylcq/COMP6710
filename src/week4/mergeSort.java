package week4;

public class mergeSort {
    public static void main(){
        int[] arr=new int[]{1,7,3,12,10,43,25,2,57};
        sorts(arr,0,arr.length-1);

        for(int x:arr){
            IO.println(x);
        }
    }
    public static void sorts(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        sorts(arr,left,mid);
        sorts(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int n = 0; n < temp.length; n++) {
            arr[left + n] = temp[n];
        }
}
}

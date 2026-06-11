package week4;

public class recursionBS {
    public static void main() {
        int[] arr = new int[]{1, 7, 9, 12, 19, 24, 37, 49, 68, 98, 99};
        int needle = 9;
        int ans=resBs(arr, needle, 0, 10);
        IO.println(ans);
    }

    public static int resBs(int[] arr, int needle, int left, int right) {
        // int left=0;
        //int right=arr.length-1;
        if(left>=right){
            return left;
        }
            int mid = (left + right) / 2;
            if (arr[mid] == needle) {
                return mid;
            } else if (arr[mid] < needle) {
                return resBs(arr, needle, mid + 1, right);
            } else {
                return resBs(arr, needle, left, mid - 1);
            }
        }
        //return left;
    }

    /*int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] output = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                output[k] = left[i];
                i = i + 1;
            } else {
                output[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i < left.length) {
            output[k] = left[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < right.length) {
            output[k] = right[j];
            j = j + 1;
            k = k + 1;
        }
        return output;
    }
}*/

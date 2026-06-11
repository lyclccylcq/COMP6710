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

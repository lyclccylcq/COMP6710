package week2;

public class binSearch {
    static boolean binSearch(int[] array,int guess){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(array[mid]==guess){
                return true;
            }else if(array[mid]>guess){
                right = mid-1;
            }else if(array[mid]<guess){
                left = mid+1;
            }
        }
        return false;
    }
}

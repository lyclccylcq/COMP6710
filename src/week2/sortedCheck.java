package week2;

public class sortedCheck {
    boolean isSorted(int[] array){
        int i=0;
        for(i=0; i<array.length-1; i++){
            if(array[i]<=array[i+1]){
                return true;
            }
        }
        return false;
    }
}

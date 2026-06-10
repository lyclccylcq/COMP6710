package week2;

public class cliDrive {
    public static void main(String[] args) {
        String inputlength = args[0];
        int stringlength = Integer.parseInt(inputlength);
        int[] arr = new int[stringlength];
        for (int i = 0; i < stringlength; i++) {
            int input = Integer.parseInt(IO.readln());
            arr[i] = input;
        }
        int goal = Integer.parseInt(args[1]);
        if (sortedCheck.isSorted(arr) && binSearch.binSearch(arr, goal) || testAssert.contains(arr, goal)){
            IO.println("found it!");
        }else {
            IO.println("can't found it");
        }
    }
}
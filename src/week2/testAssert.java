package week2;

public class testAssert {
    void main() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        assert (!contains(arr1, 6));
        assert (contains(arr1, 2));
        //assert (!contains(arr1,3));
        assert (contains(arr1, 4));

    }

    static boolean contains(int[] array, int guess) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == guess) {
                return true;
            }
        }
        return false;
    }
}
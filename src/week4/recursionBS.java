package week4;

public class recursionBS {
    int[] merge(int[] left, int[] right) {
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
}


public class SortArray {

    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {             // begin with the second character
            char cur = data[k];
            int j = k;
            while (j > 0 && data[j - 1] > cur) {  // find the correct index for cur
                data[j] = data[j - 1];
                j--;
            }
            data[j] = cur;
        }
    }
}
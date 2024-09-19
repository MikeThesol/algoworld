package algorithms.binarySearch;

public class BinarySearch {

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == key) return mid;
            if (guess < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

}

public class BinaryInsertionSort {

    public static int binarySearch(int[] arr, int val, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < val) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void binaryInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int pos = binarySearch(arr, val, 0, i);

            int j = i;
            while (j > pos) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[pos] = val;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 5, 6};

        System.out.print("Sebelum: ");
        printArray(data);

        binaryInsertionSort(data);

        System.out.print("Sesudah: ");
        printArray(data);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
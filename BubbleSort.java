public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // tukar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // optimasi: berhenti kalau sudah urut
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 5, 6};

        System.out.print("Sebelum: ");
        printArray(data);

        bubbleSort(data);

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
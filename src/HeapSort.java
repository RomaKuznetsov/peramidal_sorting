public class HeapSort {

    public static void main(String[] args) {
        int[] numbers = {12, 2, 15, 56, 23, 78, 45, 34, 16, 91, 53, 27};
        heapSort(numbers);
        for (int h = 0; h <= numbers.length; h++) {
            System.out.println(numbers[h] + " ");
        }
    }

    public static void heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            shiftDown(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i); /*deleteMax*/
            shiftDown(a, 0, i);
        }
    }

    public static void shiftDown(int[] a, int i, int n) {
        int child;
        int tmp;
        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && (a[child] < a[child + 1]))
                child++;
            if (tmp < a[child])
                a[i] = a[child];
            else break;
        }
        a[i] = tmp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

    }
}



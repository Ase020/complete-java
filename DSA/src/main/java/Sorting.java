
public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {6, 4, 8, 2, 9, 1, 5, 10, 7, 3};
        int length = numbers.length;
        int temp = 0;
        int minIndex = -1;

        System.out.print("Before sorting ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Bubble Sort
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length - i - 1; j++){
//                if (numbers[j] > numbers[j + 1]){
//                    temp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }

        // Selection Sort
//        for (int i = 0; i < length - 1; i++) {
//            minIndex = i;
//            for (int j = i + 1; j < length; j++) {
//                if (numbers[minIndex] > numbers[j]) {
//                    minIndex = j;
//                }
//            }
//
//            temp = numbers[minIndex];
//            numbers[minIndex] = numbers[i];
//            numbers[i] = temp;
//        }

        // Insertion Sort
//        for (int i = 0; i < length ; i++) {
//            int key = numbers[i];
//            int j = i - 1;
//
//            while (j >=0 && numbers[j] > key){
//                numbers[j+1] = numbers[j];
//                j--;
//            }
//            numbers[j+1] = key;
//        }

        // Quick Sort
//        quickSort(numbers, 0, numbers.length-1);

        // Merge Sort
        mergeSort(numbers, 0, length-1);


        System.out.println();
        System.out.print("After sorting ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

    private static void mergeSort(int[] numbers, int left, int right) {
        if (left < right){
            int mid = (left + right)/2;
            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);

            merge(numbers, left, mid, right);
        }
    }

    private static void merge(int[] numbers, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = numbers[left+i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = numbers[mid+1+i];
        }

        int x = 0;
        int y = 0;
        int k = left;

        while (x<n1 && y< n2){
            if (leftArray[x] <= rightArray[y]){
                numbers[k] = leftArray[x];
                x++;
            } else {
                numbers[k] = rightArray[y];
                y++;
            }
            k++;
        }

        while (x < n1){
            numbers[k] = leftArray[x];
            x++;
            k++;
        }
    }

    public static void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pivot = partition(numbers, low, high);

         quickSort(numbers, low, pivot - 1);
         quickSort(numbers, pivot + 1, high);
        }
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i+1];
        numbers[i+1] = numbers[high];
        numbers[high] = temp;

        return i + 1;
    }
}

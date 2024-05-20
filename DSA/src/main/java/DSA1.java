public class DSA1 {
    public static void main(String[] args){
        int[] numbers = {5,7,9,11,13};
        int target = 13;

        int result = binarySearch2(numbers, target, 0, numbers.length);

        if (result != -1)
            System.out.println("Element found at Index: " + result);
        else
            System.out.println("Element not found!");


    }

    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (numbers[mid] == target){
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] numbers, int target, int left, int right){
        if (left <= right){
            int mid = (left + right)/2;

            if (numbers[mid] == target){
                return mid;
            } else if (numbers[mid] < target) {
                return binarySearch2(numbers, target, mid + 1, right);
            } else {
                return binarySearch2(numbers, target, left, mid - 1);
            }
        }
        return -1;
    }
}


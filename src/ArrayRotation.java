import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
//        initial array
        int [] array = {1,2,3,4,5,6,7};
//        number of elements to rotate
        int d = 2;

        rotateArray(array, d);
        System.out.println("Rotated array: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] arr, int d) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;
//     reverse the first 2 elements
        reverse (arr, 0, d -1);
//     reverse the rest of the elements
        reverse(arr, d, n - 1);
//       reverse the whole array
        reverse(arr, 0, n -1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}

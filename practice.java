import java.util.Arrays;
public class practice{
   public static void reverseArray(int[] arr) {
       int start = 0, end = arr.length - 1;
       while (start < end) {
           // Swap elements
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
   }
   public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5};
       System.out.println("Original Array: " + Arrays.toString(array));
       reverseArray(array);
       System.out.println("Reversed Array: " + Arrays.toString(array));
   }
}

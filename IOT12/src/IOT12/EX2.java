package IOT12;
import java.util.*;
public class EX2 {
	public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int j = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Number of unique elements: " + j);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;

class array_processing {
    Scanner scanner = new Scanner(System.in);

    public int get_size() {
        System.out.print("n = ");
        int size = scanner.nextInt();
        return size;
    }

    public int[] create_array(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter number in array: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int SortDescending_array(int[] nums) {
        System.out.println("\nStart array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("array[" + i + "] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("\nSorted array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("array[" + i + "] = " + nums[i]);
        }
        System.out.println("\nReversed sorted array: ");
        for (int i = 0, j = nums.length - 1, tmp; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        // dump the array (for Java 4/5/6/7/8/9)
        for (int i = 0; i < nums.length; i++) {
            System.out.println("array[" + i + "] = " + nums[i]);
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        array_processing array = new array_processing();
        int size = array.get_size();
        int[] arr = array.create_array(size);
        array.SortDescending_array(arr);
    }
}

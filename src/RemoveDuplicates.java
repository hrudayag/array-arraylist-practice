import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        //start with array
        Integer[] arr = {10, 20, 10, 30, 20};

        //convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        //convert ArrayList back to array
        Integer[] resultArray = uniqueList.toArray(new Integer[0]);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After Removing Duplicates: " + Arrays.toString(resultArray));
    }
}
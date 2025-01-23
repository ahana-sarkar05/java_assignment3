import java.util.Arrays;

public class Return {
    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; 
        }
        return Arrays.copyOfRange(array, 1, array.length - 1);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        int[] result = middle(myArray);
        System.out.println(Arrays.toString(result));
    }
}

public class DiagonalSum 
{
    public static int sumDiagonalElements(int[][] array) 
	{
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i]; 
        }
        return sum;
    }

    public static void main(String[] args) 
	{
        int[] myArray1D = {1, 2, 3, 4, 5, 6};
        int size = (int) Math.sqrt(myArray1D.length); 
        if (size * size != myArray1D.length) {
            System.out.println("Input is not a square matrix.");
            return;
        }

        int[][] myArray2D = new int[size][size];
        for (int i = 0; i < myArray1D.length; i++)
		{
            myArray2D[i / size][i % size] = myArray1D[i];
        }
        int sum = sumDiagonalElements(myArray2D);
        System.out.println("Sum of diagonal elements: " + sum); 
    }
}

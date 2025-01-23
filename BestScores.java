import java.util.Arrays;

public class BestScores
 {
    public static int[] firstSecond(int[] array) 
	{
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int score : array) 
		{
            if (score > first)
			{
                second = first;
                first = score;
            } 
			else if (score > second && score < first)
			{
                second = score;
            }
        }

       
        return new int[] {first, second};
    }

    public static void main(String[] args) 
	{
        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        int[] result = firstSecond(myArray);

        System.out.println("First and second best scores: " + Arrays.toString(result)); 
    }
}

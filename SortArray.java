public class SortArray{

    public static void main(String[] args)
    {
        // sorting an array in ascending order
        int[] numbers = {100,2,30,80,45,76,63};
        // System.out.println(numbers[1]);
        // numbers[1] = 200;
        // System.out.println(numbers[1]);
        for(int i = 0; i < numbers.length - 1; i++)
        {
            
            if(numbers[i] > numbers[i + 1])
            {
                int temp = numbers[i];
                numbers[i] =  numbers[i + 1];;
                numbers[i + 1] = temp;
               
            }
        }
        System.out.print("Sorted Array: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

    }
}
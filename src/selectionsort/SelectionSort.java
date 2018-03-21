
package selectionsort;


public class SelectionSort 
{
    public static int [] ssort(int[] numbers)
    {
        int i,j;
        for(i=0; i<numbers.length-1; i++)
        {
            int min = i;
            
            for(j=i+1; j<numbers.length; j++)
            {
                if (numbers[j] < numbers[min])
                {
                    min = j;
                }
            }
            numbers = swap(numbers,i,min);
        }
        
        
        return numbers;
    } 
    
    public static int[] swap(int[] numbers,int i,int min)
    {
        int temp = numbers[i];
        numbers[i] = numbers[min];
        numbers[min] = temp;
        return numbers;
    }
            

    public static void main(String[] args) 
    {
       int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
       int[] sortedNumbers;
       sortedNumbers = ssort(randomNumbers);
       for(int i=0;i<sortedNumbers.length-1;i++)
       {
           System.out.print(" "+sortedNumbers[i]+",");
       }
       System.out.print(" "+sortedNumbers[sortedNumbers.length-1]);
    }
    
}

import java.util.Random;
import java.util.*;
import java.util.Arrays;
class sorted
{
   public static boolean isSorted(int[] arr)
   {
    for(int value=1;value<arr.length;value++)
    {

      if(arr[value]<arr[value-1])
      {
          return false;
      }
    
    }
    return true;
   }
   public static void main(String[] args)
   {
     Random rand=new Random();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number of Elements:");
     int numOfEle=sc.nextInt();
     int[] arr=new int[numOfEle];
     //int[] arr={10,20,30,40};
    for(int value=0;value<arr.length;value++)
     {
      arr[value]=rand.nextInt(100);
     }
     boolean result=isSorted(arr);
     if(result)
     {
      System.out.println(Arrays.toString(arr));
      System.out.println("The Array is Sorted");
     }
     else
     {
      System.out.println(Arrays.toString(arr));
      System.out.println("The Array is not Sorted");
     }

   }
}
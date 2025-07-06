import java.util.*;
import java.util.Arrays;
import java.util.Random;
class distinctElements
{
  public static int noOfDistinctElements(int[] arr)
  {
    int count=1,a=0;
    for(int current=0;current<arr.length;current++)
    {
     for(int previous=current-1;previous>=0;previous--)
     {
      if(arr[current]!=arr[previous])
      {
        a=1;
      }
     }
     count+=a;
    }
    return count;
  }
  public static void main(String[] args)
  {
     Random rand = new Random();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number of Elements:");
     int numOfEle=sc.nextInt();
     int[] arr=new int[numOfEle];
     for(int value=0;value<arr.length;value++)
     {
      arr[value]=rand.nextInt(100);
     }
     int result=noOfDistinctElements(arr);
     System.out.println(Arrays.toString(arr));
     System.out.print("The Total Number of Distinct Elements are:"+result);

  }
}
import java.util.*;
class maximum
{
  public static void main(String[] args)
  {
    Random rand=new Random();
    int[] arr=new int[5];
    int max1=0,max2=0;
    for(int value=0;value<arr.length;value++)
    {
      arr[value]=rand.nextInt(10);
    }
    for(int begin=1;begin<arr.length;begin++)
    {
      if(arr[max1]<arr[begin])
      {
        max1=begin;
      }
    }
    for(int begin=1;begin<arr.length;begin++)
    {
      if(begin!=max1&&arr[max2]<arr[begin]&&arr[max2]!=arr[max1])
      {
        max2=begin;
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("The 1st Maximum Element out of Above Array :"+arr[max1]);
    System.out.println("The 2nd Maximum Element out of Above Array :"+arr[max2]);
  }
}
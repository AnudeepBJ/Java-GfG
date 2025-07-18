import java.util.*;
class equlibrium
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     Random rnd=new Random();
     System.out.println("Enter the Number of Elements:");
     int n=sc.nextInt();
     int[] 
     int[] arr=new int[n];
     
     for(int i=0;i<n;i++)
     {
      arr[i]=rnd.nextInt();
     }
     
     int leftSum=0;
     int rightSum=0;
     int count=0;
     for(int i=0,j=arr.length-1;i<n && j>i;i++,j--)
     {
       if(j<i)
       {
        break;
       }
       leftSum+=arr[i];
       rightSum+=arr[j];
       count++;
       if(leftSum==rightSum)
       {

       }
     }
  }
}
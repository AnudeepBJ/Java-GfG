import java.util.*;
class rangeSum
{
  static int prefixSum(int l,int r,int[] arr)
  {
    int sum=0;
    for(int i=l;i<r;i++)
    {
      sum+=arr[i];
    }
    return sum;
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Random rnd=new Random();
    System.out.print("Enter the Number of Elements:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int value=0;value<n;value++)
    {
      arr[value]=rnd.nextInt(20);
    }
    System.out.println("Enter the No of Queries:");
    int queries=sc.nextInt();
    int[] prefix=new int[queries];
    System.out.println(Arrays.toString(arr));
    System.out.println("Enter l and r for each iteration:");
    for(int value=0;value<queries;value++)
    {
       int l=sc.nextInt();
       int r=sc.nextInt();
       if(l>n-1 || r>n-1)
       {  System.out.print("Re enter the Elements with the range:");
          l=sc.nextInt();
          r=sc.nextInt();
       }
       
       int res=prefixSum(l,r,arr);
       prefix[value]=res;
      
    } 
    for(int i=0;i<queries;i++)
    {
    System.out.printf("%d ",prefix[i]);
    }
  }
}
import java.util.*;
class prefix
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    System.out.println("Enter the Number of Elements:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] prefix=new int[n];
    int[] result=new int[n];
    for(int value=0;value<n;value++)
    {
      arr[value]=rand.nextInt(20);
    }
    prefix[0]=arr[0];
    for(int value=1;value<n;value++)
    {
      prefix[value]=prefix[value-1]+arr[value];
    }
    System.out.println("Enter the Number of   Queries :");
    int q=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      int l=sc.nextInt();
      int r=sc.nextInt();
      if(l==0)
      {
        result[i]=prefix[r];
      }
      else
      {
        result[i]=prefix[r]-prefix[l-1];
      }
    }
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<q;i++)
    {
      System.out.print(result[i]+" ");
    }

  }
}


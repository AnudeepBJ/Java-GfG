import java.util.*;
public class multiDim
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of rows:");
      int rows=sc.nextInt(); 
      int arr[][]=new int[rows][];
      int len=arr.length;
      for(int i=0;i<len;i++)
      {
        arr[i]=new int[i+1];
        System.out.println("i-->"+i+"Arr length->"+arr[i].length);
        for(int j=0;j<arr[i].length;j++)
        {
           arr[i][j]=j;

           System.out.printf("arr[%d][%d]->%d",i,j,j);
        }
        System.out.println();
      }

  }
}
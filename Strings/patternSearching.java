import java.util.*;
class patternSearching 
{
  public static void findOccurence(String text,String target)
  {
    int pos=text.indexOf(target);
    long start = System.nanoTime();
    while(pos>=0)
    {
      System.out.print(pos+" ");
      pos=text.indexOf(target,pos+1);
    }
    long end = System.nanoTime();
    System.out.println("Time taken (ns): " + (end - start));
  }
  public static void printDecimal(String text)
  {
    int pos=text.indexOf(".");
    String remainingText=text.substring(pos+1);
    System.out.print(remainingText);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the text:");
    String text=sc.nextLine();
    System.out.println("Enter the Pattern to Search:");
    String searchText=sc.nextLine();
    findOccurence(text,searchText);
    //printDecimal(text); 
    //?Print Decimal is used print all the numbers after decimal points.
  }
}
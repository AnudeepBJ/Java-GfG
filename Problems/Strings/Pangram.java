import java.util.*;
class Pangram
{
  static void checkForAlphabets(String input)
  {
    int len=input.length();
    boolean[] arr=new boolean[len];
    for(int i=0;i<len;i++)
    {
      if(input.indexOf(input.charAt(i),i+1)!=-1)
      {
        int size=input.codePointAt(i)-97;
        arr[i]=true;
      }
    }
    if(arr.length==26)
    {
      System.out.println("Is panagram");
    }
    else
    {
      System.out.println("Not a panagram");
    }

  }
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      String input=sc.nextLine();
      input=input.toLowerCase();
      checkForAlphabets(input);
  }
}
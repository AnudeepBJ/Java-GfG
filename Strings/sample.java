import java.util.*;
class sample
{
  public static void main(String[] args)
  {
    char x='a';
    char y='b';
    int a=x+y;
    System.out.println(a);

    // ?find the frequency of the elements in the text
    
    Scanner sc=new Scanner(System.in);
    String text=sc.nextLine();
    int[] count=new int[122];
    for(int i=0;i<text.length();i++)
    {
      count[text.charAt(i)-'a']++;
    }
    
    for(int i=0;i<26;i++)
    {
      char letter=(char)(i+'a');
      
      System.out.println(letter+"->"+count[i]);
    }

  }
}
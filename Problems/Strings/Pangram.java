import java.util.*;
class Pangram
{
  static boolean checkForAlphabets(String input)
  {
    int n=input.length();
    if(n<26)
    {
      return false;
    }
    boolean[] visited=new boolean[26];
    for(int i=0;i<n;i++)
    {
      char x=input.charAt(i);
      if(x>='a'&&x<='z')
      {
        visited[x - 'a']=true;
      }
      if(x>='A'&&x<='Z')
      {
        visited[x-'A']=true;
      }
    }
     for(int i=0;i<26;i++)
     {
      if(visited[i]==false)
      {
          return false;
      }
     } 
    return true;
  }
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      String input=sc.nextLine();
      input=input.toLowerCase();
      boolean result=checkForAlphabets(input);
      if(result)
      {
        System.out.println("The Entered String is a Panagram");
      }
      else
      {
        System.out.println("The Entered String is not a Panagram");
      }
  }
}
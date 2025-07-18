import java.util.*;
public class main{
  public static String removeDuplicates(String str)
  {
    char[] copy=str.toCharArray();
    boolean[] ref=new boolean[26];
    int len=copy.length;
    int res_ind=0;
    for(int ind=0;ind<len;ind++)
    {
        if(ref[(copy[ind]-97)]==false)
        {
          ref[(copy[ind])]=true;
          copy[res_ind]=copy[ind];
          res_ind++;
        }
      
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
  }
}
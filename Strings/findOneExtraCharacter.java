import java.util.*;

class findOneExtraCharacter
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int sum1=0,sum2=0,sum3=0;
    String text1=sc.nextLine();
    String text2=sc.nextLine();
    int len1=text1.length();
    int len2=text2.length();
    for(int i=0;i<len1;i++)
    {
      char x=text1.charAt(i);
      sum1=sum1+x;
    }
    for(int i=0;i<len2;i++)
    {
      char y=text2.charAt(i);
      sum2=sum2+y;
    }


    sum3=sum1-sum2;
      if(sum3<0)
      {
        sum3=-1*sum3;
      }
      char missing=(char)sum3;
      System.out.print(missing);
  }
}
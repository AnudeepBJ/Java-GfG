//Fuinding the factorial of numbers from range 100 to 500.
import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
  }
}

public class Main{
  public static void display(Node res)
  {
    if(res!=null)
    {
      display(res.next);
      System.out.print(res.data);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Node res=new Node(1);
    for(int mul=1;mul<=n;mul++)
    {
      Node tptr=res;
      int carry=0;
      while(tptr!=null)
      {
        int pro=tptr.data*mul+carry;
        carry=pro/10;
        tptr.data=pro%10;
        tptr=tptr.next;
      }
      while(carry!=0)
      {
        int dig=carry%10;
        Node newNode=new Node(dig);
        tptr=res;
        while(tptr.next!=null)
        {
          tptr=tptr.next;
        }
        tptr.next=newNode;
        carry/=10;
      }
    }
    display(res);
  }
}


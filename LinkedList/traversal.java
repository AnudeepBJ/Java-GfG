import java.util.*;
class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
    this.next=null;
  }
}

class List
{
  Node head=null;
 
  void create(int num)
  {
    Node newNode= new Node(num);
    if(head==null)
    {
      head=newNode;
    }
    else{
      Node tptr=head;
      while(tptr.next!=null)
      {
        tptr=tptr.next;
      }
      tptr.next=newNode;
    }
  }
  
  void display()
  {
    Node tptr=head;
    while(tptr!=null)
    {
      System.out.print(tptr.data+"->");
      tptr=tptr.next;
    }
    System.out.print("End");
  }
  
}
class traversal
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the data for Nodes");
    List list1=new List();
    List list2=new List();
    while(true)
    {
      int num=sc.nextInt();
      if(num==-1)
         break;
      list1.create(num);
    }
    list1.display();


  }
}
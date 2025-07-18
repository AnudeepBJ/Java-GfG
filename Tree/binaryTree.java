import java.util.*;
class Node
{
  int data;
  Node left;
  Node right;
  Node(int data)
  {
    this.data=data;
  }

}

class BT
{
   Node root=null;
   int front=0;
   int rear=0;
   ArrayList<Node> ref=new ArrayList<>();
   void create(int num)
   {
      Node newNode=new Node(num); 
      if(root==null)
      {
        root=newNode;
        ref.add(newNode);
      } 
      else
      {

          if(ref.get(front).left==null)
          {
            if(num!=-1)
                   ref.get(front).left=newNode;
                   ref.add(newNode);
            flag=1;
          }
          else
          {
            if(num!=-1)
               ref.get(front).right=newNode;
               ref.add(newNode);
            flag=0;
            front++;
          }
         
      }
   }

   void inorder(Node root)
   {
    if(root!=null)
    {
      inorder(root.left);
      System.out.print(" "+root.data);
      inorder(root.right);
    }
   }

   void display()
   {
    inorder(root);
   }

}
class binaryTree
{
  public static void main(String[] args)
  {
      Scanner input =new Scanner(System.in);
      BT tree=new BT();
      while(true)
      {
        int num=input.nextInt();
        if(num==-1) break;
        tree.create(num);
      }
      tree.display();
      input.close();
  }
}
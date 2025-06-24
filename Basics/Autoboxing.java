import java.util.*;
import java.lang.System;
class Autoboxing
{
  public static void main(String[] args)
  {//Autoboxing
    Integer x1=500;
    Integer x2=500;
    System.out.println("System Reference->"+System.identityHashCode(x1));
    System.out.println("System Reference->"+System.identityHashCode(x2));
    System.out.println(x1);

    //Unboxing
    System.out.println("Unboxing");
    int x3=x1;
    int x4=x2;
    System.out.println(x3+"--"+x4);
  }
}
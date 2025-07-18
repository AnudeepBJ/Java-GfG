class basics
{
  public static void main(String[] args)
  {

    //!char array can be used to store strings.
    //!String class can be used to store strings that are immutable.
    //

    //Non primitive Datatype
    String str="Welcome to Bangalore";
    String str2="Bangalore";
    String str3="Bangalore";
    String str4=new String("Bangalore");
    
    //string methods
    /*
    System.out.println(str2==str3);
    System.out.println(str2==str4);
    str4=str2.intern();
    System.out.println(str2==str4);
    */

    //String class methods
    String input="Karnataka";
    System.out.println(input.length());
    //?charAt() method is used to return the character at that particular index.

    /*
    for(int i=0;i<input.length();i++)
    {
      System.out.print(input.charAt(i));
    }
    System.out.println();
    ! substring() method returns the substring 
    System.out.println(input.substring(0,4));
    */

    //!some other functions of String class are
    //!1.contains()
    //!2.equals()
    //!3.compareTo()
    //!4.indexOf()
    
    String input1="GeeksForGeeks";
    String input2="Geeks";
    String input3="DSU";
/*
    ?System.out.println(input1.contains(input2));
    ?System.out.println(input1.contains(input3));

    ?System.out.println(input1.equals(input2));
    ?System.out.println(input1.equals(input3));
    
    ?System.out.println(input1.compareTo(input2));

    ?System.out.println(input1.indexOf(input2,1));
    ?System.out.println(input1.indexOf("hello"));
    */
    
    //!equalIgnoreCase-> helps use to check the content of string ignoring uppercase and lowercase letters
    //!capitalize -> it capitalizes all the elements of the string.

    //!toUpperCase-> it converts all the string to uppercase

    String inp1="Welcome To Bengaluru";
    String inp2="Bengaluru";
    String inp3="bengaluru";
    System.out.println(inp3.equalsIgnoreCase(inp2));





  }
}
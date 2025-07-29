import java.util.Random;
class generateString 
{
   public static String generateRandomString(int length)
   {
    String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    StringBuilder sb=new StringBuilder();
    Random random=new Random();
    for(int i=0;i<length;i++)
    {
      sb.append(chars.charAt(random.nextInt(chars.length())));
    }
    return sb.toString();
   }
   public static void main(String[] args)
   {
     String randomString=generateRandomString(10);
     System.out.println("The generated Random String is:"+randomString);

   }
}
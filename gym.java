import java.util.Scanner;
public class gym
{
    public static void main(String args[])
    {
      
      
      System.out.println("\t\t\t\t\t\t\t\t|GYM MEMBERSHIP| \t\t\t\t\t\t\t\t");
      
      Scanner in = new Scanner(System.in);
      float fee= 125.50f;
      System.out.println("Enter name: ");
      String n=in.nextLine();
      System.out.println("Enter age: ");
      int a=in.nextInt();
      System.out.println("Do you have an existing membership? enter true or false");
      boolean m=in.nextBoolean();
      if (m==true)
      {
          System.out.println("Enter duration in days to know membership fee(125.50rs per session)");
          int d=in.nextInt();
          float t=(d*fee);
          System.out.println("Your total fee = "+t);
      }
      else
      {
          System.out.println("No existing membership, get your membership now at just 125.50rs per session");
      }
     
    }
}
import java.util.Scanner;
public class String02 {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        StringBuffer sb1= new StringBuffer();
        System.out.println("Default capacity of the string buffer created="+sb1.capacity());
        System.out.println("Enter a string to get the reverse of it:");
        String s1= in.nextLine();
        sb1.append(s1);
        StringBuffer rsb= new StringBuffer(s1);
         rsb.reverse();
         String revUC = rsb.toString().toUpperCase();
         System.out.println("Reversed string in uppercase: " + revUC);
         System.out.print("Enter a string to append: ");
         String appendString = in.nextLine();
         rsb.append(appendString);
         System.out.println("String after appending: " + rsb);
    }   
}


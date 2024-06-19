
public class String01 
{
    public static boolean compS(String str1, String str2) 
    {
        return str1.equals(str2);
    }

    public static String cS(String str1, String str2)
    {
        return str1 + str2;
    }

    public static String createCopies(String str)
    {
        return new String(str);
    }

    public static void main(String[] args) 
    {
        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = "World";
        
        System.out.println("Are text1 and text2 equal? " + compS(text1, text2));
        System.out.println("Are text1 and text3 equal? " + compS(text1, text3));

        String concatText = cS(text1, text3);
        System.out.println("Concatenated text: " + concatText);
        String copy=createCopies(text1);
        System.out.println("Original string: "+ text1);
        System.out.println("Copied string:" + copy);
    }
}

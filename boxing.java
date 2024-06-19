public class boxing 
{
    public static void main(String[] args)
    {
        int intValue=42;
        Integer integerval=Integer.valueOf(intValue);
        double doubleValue=3.14;
        Double A=Double.valueOf(doubleValue);
        char c='A';
        Character C=Character.valueOf(c);
        int ub=integerval.intValue();
        double ua=A.doubleValue();
        char uc=C.charValue();
        System.out.println("Boxed integer:"+integerval);
        System.out.println("Unboxed integer:"+ub);
        System.out.println("Boxed double:"+A);
        System.out.println("Unboxed double:"+ua);
        System.out.println("Boxed character:"+C);
        System.out.println("Unboxed character:"+uc);
    }
}

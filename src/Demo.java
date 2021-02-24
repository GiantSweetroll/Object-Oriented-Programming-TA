public class Demo 
{
    public static void main (String args[]) {
        double d = 25.2;
        String doubleString = Double.toString(d);
        double d2 = Double.parseDouble(doubleString);
        System.out.println(d2);
    }    
}

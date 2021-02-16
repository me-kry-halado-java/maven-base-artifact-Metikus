package hu.meiit.haladojava.calculator;

public class Checker
{
    public static Double stringToDouble(String s)
    {
        try
        {
            return Double.parseDouble(s);
        }catch(NumberFormatException e)
        {
            return null;
        }
    }
}

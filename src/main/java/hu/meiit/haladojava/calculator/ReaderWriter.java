package hu.meiit.haladojava.calculator;

import java.util.Scanner;

public class ReaderWriter
{
    public static final String ErrorSomewhere = "-";

    public String ReadFromConsole()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void Write(String s)
    {
        System.out.print(s);
    }
}

package hu.meiit.haladojava.calculator;

import java.util.Scanner;

public class ReaderWriter
{
    public static final String ERROR_SOMEWHERE = "-";

    public String readFromConsole()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void writeItDown(String s)
    {
        System.out.print(s);
    }
}

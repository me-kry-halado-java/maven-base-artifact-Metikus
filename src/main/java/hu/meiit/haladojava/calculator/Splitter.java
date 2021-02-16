package hu.meiit.haladojava.calculator;

import java.util.regex.Pattern;

public class Splitter
{
    private final String input;
    public Splitter(ReaderWriter readerWriter)
    {
        this.input = readerWriter.ReadFromConsole();
    }

    public String[] spliting()
    {
        if(input.contains(" "))
        {
            String[] splited = input.split(" ");
            if((splited.length==3)&&(Operator.IsOperator(splited[1])))
            {
                return splited;
            }else
                return null;
        }else if(input.contains(Operator.ADDITION.getSymbol()))
        {
            return splitingWithoutSpace(Operator.ADDITION);
        }else if (input.contains(Operator.SUBTRACTION.getSymbol()))
        {
            return splitingWithoutSpace(Operator.SUBTRACTION);
        }else if (input.contains(Operator.MULTIPLICATION.getSymbol()))
        {
            return splitingWithoutSpace(Operator.MULTIPLICATION);
        }else if (input.contains(Operator.DIVISION.getSymbol()))
        {
            return splitingWithoutSpace(Operator.DIVISION);
        }else
            return null;
    }

    private String[] splitingWithoutSpace(Operator operator)
    {
        String[] splited;
        splited = input.split(Pattern.quote(operator.getSymbol()));
        if(splited.length==2){
            return new String[]{splited[0],operator.getSymbol(),splited[1]};
        }else
            return null;
    }
}

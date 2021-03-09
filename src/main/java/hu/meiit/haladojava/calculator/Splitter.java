package hu.meiit.haladojava.calculator;

import java.util.regex.Pattern;

public class Splitter
{
    private final String input;

    public Splitter(ReaderWriter readerWriter)
    {
        this.input = readerWriter.readFromConsole();
    }

    public String[] splitWithSpace() throws Exception {
        if(input.contains(" "))
        {
            String[] splitString = input.split(" ");
            if((splitString.length==3)&&(Operator.isOperator(splitString[1])))
            {
                return splitString;
            }else
                throw new Exception("It's too long");
        }

        if(input.contains(Operator.ADDITION.getSymbol()))
        {
            return splitWithoutSpace(Operator.ADDITION);
        }

        if (input.contains(Operator.SUBTRACTION.getSymbol()))
        {
            return splitWithoutSpace(Operator.SUBTRACTION);
        }

        if (input.contains(Operator.MULTIPLICATION.getSymbol()))
        {
            return splitWithoutSpace(Operator.MULTIPLICATION);
        }

        if (input.contains(Operator.DIVISION.getSymbol()))
        {
            return splitWithoutSpace(Operator.DIVISION);
        }

        throw new Exception("It's just a string");
    }

    private String[] splitWithoutSpace(Operator operator) throws Exception {
        String[] splitString;
        splitString = input.split(Pattern.quote(operator.getSymbol()));
        if(splitString.length==2){
            return new String[]{splitString[0],operator.getSymbol(),splitString[1]};
        }else
            throw new Exception("It's too long");
    }
}

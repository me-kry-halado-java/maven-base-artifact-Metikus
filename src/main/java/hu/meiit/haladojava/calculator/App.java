package hu.meiit.haladojava.calculator;

public class App 
{
    public static void main( String[] args )
    {
        ReaderWriter readerWriter = new ReaderWriter();
        try
        {
        Splitter splitter = new Splitter(readerWriter);
        String[] values = splitter.splitWithSpace();
        Expression expression = new Expression(Double.parseDouble(values[0]) ,Double.parseDouble(values[2]) ,values[1]);
        readerWriter.writeItDown(expression.calculate());
        }catch (Exception e){
            readerWriter.writeItDown(ReaderWriter.ERROR_SOMEWHERE);
        }
    }
}

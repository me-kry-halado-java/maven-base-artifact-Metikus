package hu.meiit.haladojava.calculator;

public class App 
{
    public static void main( String[] args )
    {
        ReaderWriter readerWriter = new ReaderWriter();
        Splitter splitter = new Splitter(readerWriter);
        String[] values = splitter.spliting();
        if(values!=null){
            Double op1=Checker.stringToDouble(values[0]);
            Double op2=Checker.stringToDouble(values[2]);
            if((op1!=null)&&(op2!=null))
            {
                Expression expression = new Expression(op1,op2,values[1]);
                readerWriter.Write(expression.calculate());
            }else
                readerWriter.Write(ReaderWriter.ErrorSomewhere);
        }else
            readerWriter.Write(ReaderWriter.ErrorSomewhere);
    }
}

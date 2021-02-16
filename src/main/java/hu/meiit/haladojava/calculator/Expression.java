package hu.meiit.haladojava.calculator;

public class Expression
{
    private final double op1;
    private final double op2;
    private final String operator;

    public Expression(double op1, double op2, String operator)
    {
        this.op1 = op1;
        this.op2 = op2;
        this.operator = operator;
    }

    public String calculate()
    {
        switch (Operator.getOperationName(operator))
        {
            case ADDITION:
                return String.valueOf(op1+op2);

            case SUBTRACTION:
                return String.valueOf(op1-op2);

            case MULTIPLICATION:
                return String.valueOf(op1*op2);

            case DIVISION:
                if(op2==0){
                    return ReaderWriter.ErrorSomewhere;
                }else{
                    return String.valueOf(op1/op2);
                }
            default:
                return ReaderWriter.ErrorSomewhere;
        }
    }
}

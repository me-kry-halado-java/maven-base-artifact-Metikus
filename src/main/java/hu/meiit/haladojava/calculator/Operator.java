package hu.meiit.haladojava.calculator;

public enum Operator {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private final String symbol;

    Operator(String symbol)
    {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public static boolean IsOperator(String s)
    {
        for (Operator operator : Operator.values()) {
            if (s.equals(operator.getSymbol())) {
                return true;
            }
        }
        return false;
    }

    public static Operator getOperationName(String s) {

        for (Operator operator : Operator.values()) {
            if (s.equals(operator.getSymbol())) {
                return operator;
            }
        }
        return null;
    }
}

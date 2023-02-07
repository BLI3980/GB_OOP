package DecoratorFactory.calculator;

public class LogFactory implements ICalculableFactory{
    @Override
    public Calculable create(int primaryArg) {
        return new CalcLogger(new Calculator(primaryArg), new LoggerConsole());
    }
}

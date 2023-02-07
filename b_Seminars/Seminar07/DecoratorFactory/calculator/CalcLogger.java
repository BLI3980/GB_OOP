package DecoratorFactory.calculator;

public class CalcLogger implements Calculable{
    private Calculable calc;
    private Loggable log;

    public CalcLogger(Calculable calculable, Loggable loggable){
        this.calc = calculable;
        this.log = loggable;
    }
    @Override
    public Calculable sum(int arg) {
        log.logger(String.format("Logger message: summing %d with %d",
                calc.getResult(), arg));
        Calculable result = calc.sum(arg);
        log.logger((String.format("Logger message: getting %d",result.getResult())));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        log.logger(String.format("Logger message: multiplying %d to %d",
                calc.getResult(), arg));
        Calculable result = calc.multi(arg);
        log.logger((String.format("Logger message: getting %d",result.getResult())));
        return this;
    }

    @Override
    public int getResult() {
        return calc.getResult();
    }
}

package DecoratorFactory.calculator;

public class LoggerConsole implements Loggable{
    @Override
    public void logger(String message) {
        System.out.println(message);
    }
}

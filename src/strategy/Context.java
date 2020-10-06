package strategy;

/**
 * 策略类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

package strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        context.executeOperation(1,2);
    }
}

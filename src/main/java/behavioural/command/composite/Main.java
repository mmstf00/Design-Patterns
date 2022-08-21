package behavioural.command.composite;

public class Main {
    public static void main(String[] args) {
        CompositeCommand composite = new CompositeCommand();
        // Let's say the user is going to press resize button and then will apply B&W filter,
        // so we will record these actions in composite object
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}

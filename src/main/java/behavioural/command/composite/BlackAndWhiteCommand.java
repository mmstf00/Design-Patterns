package behavioural.command.composite;

import behavioural.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Applying black and white filter");
    }
}

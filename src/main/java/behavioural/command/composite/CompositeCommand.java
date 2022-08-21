package behavioural.command.composite;

import behavioural.command.framework.Command;

import java.util.ArrayList;
import java.util.List;

// Container for executing all the commands
public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}

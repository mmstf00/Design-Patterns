package behavioural.command.editor;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.getCommandsSize() > 0) {
            history.pop().unexecute();
        }
    }
}

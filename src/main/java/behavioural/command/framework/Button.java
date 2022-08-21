package behavioural.command.framework;

public class Button {
    private String label;
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        /*
            ... The code that should be executed here will be dependent on where we use this button.
            For example on one dialog box when user click the button perhaps you want to save something in database.
            Somewhere else when user clicks that button perhaps we want to delete a record.
            At the time of implementing this button class we don't know what code should be executed when we click a button.
         */
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

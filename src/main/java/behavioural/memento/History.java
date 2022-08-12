package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    // This can be Stack data structure to represent real push/pop
    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}

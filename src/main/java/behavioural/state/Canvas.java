package behavioural.state;

public class Canvas {
    private Tool currentTool;

    public void mouseDown() {
        /*
            if (currentTool == ToolType.SELECTION) {
                System.out.println("Selection icon");
            } else if (currentTool == ToolType.BRUSH) {
                System.out.println("Brush icon");
            } else if (currentTool == ToolType.ERASER) {
                System.out.println("Eraser icon");
            }
            //  If we need to add new tool we should add new "else if" and this is now scalable,
            //  also violates the Open-Closed Principle.
        */
        currentTool.mouseDown();
    }

    public void mouseUp() {
        /*
            if (currentTool == ToolType.SELECTION) {
                System.out.println("Draw a dashed rectangle");
            } else if (currentTool == ToolType.BRUSH) {
                System.out.println("Draw a line");
            } else if (currentTool == ToolType.ERASER) {
                System.out.println("Erase something");
            }
            //  If we need to add new tool we should add new "else if" and this is now scalable,
            //  also violates the Open-Closed Principle.
        */
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}

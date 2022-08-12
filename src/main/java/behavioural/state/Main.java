package behavioural.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
         /*
            Here we can pass whatever tool we need, and to extend we only need to create
            new class and implement Tool interface.
            This is a good example for Open-Closed Principle from SOLID principles.
         */
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

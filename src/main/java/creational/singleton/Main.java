package creational.singleton;

public class Main {
    public static void main(String[] args) {

        String message = """
                If you see the same value, then singleton was reused.
                If you see different values, then 2 singletons were created.
                                
                RESULT:
                """;

        System.out.println(message);

        SingletonClass singleton = SingletonClass.getInstance("FOO");
        SingletonClass anotherSingleton = SingletonClass.getInstance("BAR");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }
}

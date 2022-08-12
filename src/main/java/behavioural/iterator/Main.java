package behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

        /*
            for (int i = 0; i < history.getUrls().size(); i++) {
                String url = history.getUrls().get(i);
                System.out.println(url);
            }
        */
    }
}

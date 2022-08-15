package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        // Here we can pass different Compressors and Filters.
        ImageStorage imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("example");
    }
}

package behavioural.strategy;

public class ImageStorage {
    //private String compressor;
    //private String filter;
    private final Compressor compressor;
    private final Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        /*
            // JPEG, PNG
            if (compressor.equals("JPEG")) {
                System.out.println("Compressing using JPEG");
            } else if (compressor.equals("PNG")) {
                System.out.println("Compressing using PNG");
            }
        */
        compressor.compress(fileName);

        /*
            // B&W (Black and White), High Contrast
            if (filter.equals("b&w")) {
                System.out.println("Applying B&W filter");
            } else if (filter.equals("high-contrast")) {
                System.out.println("Applying High Contrast filter");
            }
        */
        filter.apply(fileName);
    }
}

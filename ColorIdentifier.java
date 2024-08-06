// ColorIdentifier.java

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ColorIdentifier {

    public static String toHex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }

    public static Color getMostDominantColor(BufferedImage image) {
        Map<Integer, Integer> colorCountMap = new HashMap<>();
        int width = image.getWidth();
        int height = image.getHeight();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int rgb = image.getRGB(x, y);
                colorCountMap.put(rgb, colorCountMap.getOrDefault(rgb, 0) + 1);
            }
        }

        int mostFrequentColor = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : colorCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentColor = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return new Color(mostFrequentColor);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java ColorIdentifier <image-file-path>");
            return;
        }

        String imagePath = args[0];
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            Color dominantColor = getMostDominantColor(image);
            String hexColor = toHex(dominantColor);

            System.out.println("Dominant Color in RGB: " + dominantColor);
            System.out.println("Hexadecimal Code: " + hexColor);
        } catch (IOException e) {
            System.out.println("Error reading image file: " + e.getMessage());
        }
    }
}

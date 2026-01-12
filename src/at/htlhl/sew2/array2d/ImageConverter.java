package at.htlhl.sew2.array2d;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageConverter {
    private static int[][] convertImageToArray(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int[][] imageArray = new int[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                imageArray[y][x] = image.getRGB(x, y);
            }
        }

        return imageArray;
    }

    private static BufferedImage convertArrayToImage(int[][] imageArray) {
        int width = imageArray[0].length;
        int height = imageArray.length;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, imageArray[y][x]);
            }
        }

        return image;
    }

    private static BufferedImage readImageFromFile(String filePath) throws IOException {
        return ImageIO.read(new File(filePath));
    }

    private static void writeImageToFile(BufferedImage image, String format, String filePath) throws IOException {
        ImageIO.write(image, format, new File(filePath));
    }

    public static int[][] readImageArrayFromFile(String filePath) throws IOException {
        return convertImageToArray(readImageFromFile(filePath));
    }

    public static void writeImageArrayToFile(int[][] imageArray, String format, String filePath) throws IOException {
        writeImageToFile(convertArrayToImage(imageArray), format, filePath);
    }

    public static void writeImageArrayToFile(int[][] imageArray, String filePath) throws IOException {
        writeImageArrayToFile(imageArray, "png", filePath);
    }
}
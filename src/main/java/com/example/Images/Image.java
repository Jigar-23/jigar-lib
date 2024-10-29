package com.example.Images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;

public class Image {

    File file;

    private int[][][] getImageData(String path) {
        file = new File(path);
        Byte[][] bytes = new Byte[(int) file.length()][3];
        int[][][] imageData;
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            Raster raster = bufferedImage.getRaster();
            int width = raster.getWidth();
            int height = raster.getHeight();
            imageData = new int[width][height][4];
            int[] temp = new int[4];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    raster.getPixel(i, j, temp);
                    imageData[i][j][0] = temp[0];
                    imageData[i][j][1] = temp[1];
                    imageData[i][j][2] = temp[2];
                    imageData[i][j][3] = temp[3];
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return imageData;
    }

























}

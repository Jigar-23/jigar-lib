package com.example.Zip;

import java.io.*;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Zip {

    public static boolean extract(String source, String target) {


        try {
            File file = new File(source);
            ZipInputStream zis = new ZipInputStream(new FileInputStream(file));
            extractFile(zis, target);
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    private static void extractFile(ZipInputStream zis, String target) {
        try {
            ZipEntry ze;
            while ((ze = zis.getNextEntry()) != null) {
                String path = target + File.separator + ze.getName();
                if (ze.isDirectory()) {
                    new File(path).mkdirs();
                } else {
                    writeFile(zis, path);
                }
                zis.closeEntry();
            }

        } catch (Exception e) {
        }
    }

    private static void writeFile(ZipInputStream zis, String path) {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
            byte[] buffer = new byte[16328];
            int len;
            while ((len = zis.read(buffer)) > 0) {
                bos.write(buffer, 0, len);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean createZip(String source, String target) {

        try {
            File file = new File(source);
            File dest = new File(target);
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

            zipHelper(file, zos, file.getName());

            return true;
        } catch (Exception e) {
            return false;
        }


    }

    private static void zipHelper(File file, ZipOutputStream zos, String parentFolder) {

        try {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        zipHelper(f, zos, parentFolder + File.separator + f.getName());
                    } else {
                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                        byte[] buffer = new byte[16328];
                        zos.putNextEntry(new ZipEntry(parentFolder + File.separator + f.getName()));
                        int len;
                        while ((len = bis.read(buffer)) > 0) {
                            zos.write(buffer, 0, len);
                        }
                        zos.closeEntry();
                    }
                }

            }
        } catch (Exception e) {

        }


    }


}



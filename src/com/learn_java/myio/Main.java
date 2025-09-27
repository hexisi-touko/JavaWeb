package com.learn_java.myio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\tu\\赵颖x王艺涵.png");
        FileOutputStream fos = new FileOutputStream("picture.png");
        byte[] bytes = new byte[1024 * 1024 ];
        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

    }
}

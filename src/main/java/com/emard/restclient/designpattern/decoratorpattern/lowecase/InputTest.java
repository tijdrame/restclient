package com.emard.restclient.designpattern.decoratorpattern.lowecase;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import org.springframework.util.ResourceUtils;

public class InputTest {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        int c;
        File f = ResourceUtils.getFile("classpath:test.txt");

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(f)));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

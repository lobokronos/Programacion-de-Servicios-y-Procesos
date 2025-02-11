package org.example;

import java.io.IOException;
import java.io.InterruptedIOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(3000);
        ProcessBuilder pb=new ProcessBuilder("calc.exe");
        pb.start();


    }
}
package com.kluke.examples.tree;

import java.io.InputStream;
import java.util.Scanner;

public class TreeImpl {

    private static final String PATH_SEPARATOR = "/";

    private final InputStream inputStream;

    public TreeImpl(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void tree() {
        final Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            scanner.next();
        }


    }

    private void processLine(String line) {
        line.split(PATH_SEPARATOR);

    }
}

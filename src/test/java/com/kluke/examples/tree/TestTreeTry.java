package com.kluke.examples.tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class TestTreeTry {

    private final Scanner scanner = new Scanner(
            TestTreeTry
            .class
            .getClassLoader()
            .getResourceAsStream("testPaths.txt")
    );

    @Test
    public void test() {
        while (scanner.hasNext()) {
            final String line = scanner.nextLine();
            final String key = line.substring(line.lastIndexOf("/") + 1);
            final String path = line.substring(0, line.lastIndexOf("/"));
            final String[] splitPath = splitPath(path);

            System.out.println(Arrays.toString(splitPath));
            System.out.println(key);

            /*
            This gives "nodes" and leaf.
            Now we need to take this list of "nodes" and generate each real node, along with it's corresponding leaf.

            To do this, maybe:
            Push items onto a queue,
            Iterate over queue until empty,
            Each iteration creates a node

            Or:
            Make a map of all possible nodes with their leaf, seems not so good since only one map entry would actually
            contain a leaf per path.
             */
        }
    }

    private String[] splitPath(String path) {
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        return path.split("/");
    }
}

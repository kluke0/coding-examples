package com.kluke.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PathBuilder {

  private static final String PATH_SEPARATOR = "/";

  public static void main(String[] args) {
    final String testPath = "/a/b/c/d/e/f/g";

    System.out.println(pathBuilder(testPath));
  }


  /**
   * Hierarchy Project/Location/Environment/Product/Component.
   * <p>----</p>
   * This method will build all paths that need to be queried to attain all variables for a job. It
   * does this by returning a list of all fully qualified paths that exist in the string query.
   *
   * @param path Path to be split into a list of sub-paths.
   * @return list of sub-paths to iterate over.
   */
  static List<String> pathBuilder(String path) {
    final StringBuilder finalPath    = new StringBuilder();
    final List<String>  finalStrings = new ArrayList<>();
    Stream
        .of(path.split(PATH_SEPARATOR))
        .filter(string -> !string.isEmpty())
        .forEach((string) -> {
          finalPath
              .append(PATH_SEPARATOR)
              .append(string);
          finalStrings.add(finalPath.toString());
        });
    return finalStrings;
  }
}

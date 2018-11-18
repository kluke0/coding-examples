package com.kluke.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Name of the class has to be "Main" only if the class is public. */
class Regex {

  public static void main(String[] args) throws java.lang.Exception {
    String  s       = "abcde\n		fghij<FooBar>";
    Pattern pattern = Pattern.compile("(.*)<FooBar>", Pattern.DOTALL);
    Matcher matcher = pattern.matcher(s);
    while (matcher.find()) {
      System.out.println(matcher.group(1));
    }
  }
}
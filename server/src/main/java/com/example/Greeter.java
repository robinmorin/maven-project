package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /***
 * Method
 * @param someone cadena 2345
 * @return una cadena
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

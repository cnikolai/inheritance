package edu.cnm.deepdive;

// Dog is a subclass of GrayWolf; GrayWolf is a superclass of dog
public class Dog extends GrayWolf {

  @Override
  public void vocalize() {
    System.out.println("Bark!");
  }

}

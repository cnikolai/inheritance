package edu.cnm.deepdive;

public class Test {

  public static void main(String[] args) {
    //Dog dog = new Dog();
    //GrayWolf buck = new Dog(); //polymorphism
    GrayWolf buck;
    buck = new Dog();
    buck.vocalize();
    buck = new GrayWolf();
    buck.vocalize();
  }

}

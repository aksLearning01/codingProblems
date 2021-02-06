package edu.akki.practice;

public class MethodReference {
  public static void sayAdditional(){
    //  System.out.println("Say something additionally");
      X obj= System.out::println;
      obj.say();
  }

    public static void main(String[] args) {
        MethodReference.sayAdditional();

     //   X obj = MethodReference::sayAdditional;
     //   obj.say();
    }
}

interface X{
    void say();
}

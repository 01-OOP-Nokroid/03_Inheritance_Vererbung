package com.cc.java;

public class Cat extends Supercat // extends --> Erweitert Supercat
{


  private int counter;

  public Cat(String name, String furColor, int age)
  {
    super(name, furColor, age); // Leitet die übermittelden Daten weiter
  }

  public String getAge()
  {
    return checkCompliance();
  }

  private String checkCompliance()
    {

    counter++;

    switch (counter) {
      case 1:
        return "This is an inappropriate question!";
      case 2:
        return "I've told you once!";
      case 3:
        return "Talk to the hand!";
      default:
        return "1#!?&&%";
    }
    
  }

}
  

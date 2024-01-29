package com.cc.java;

public class Tomcat extends Supercat{

  public Tomcat(String name, String furColor, int age)
  {
    super(name, furColor, age); // Leitet die übermittelden Daten weiter
  }

  public String getAge()
  {
    return String.valueOf(age);
  }

}
  

package com.cc3002.auxiliar.design.pattern.strategy.example05;

import java.io.PrintStream;

public interface IDuck {

  void swim();

  void setStream(PrintStream stream);

  PrintStream getStream();

  void display();

  void quack();

  void fly();

}

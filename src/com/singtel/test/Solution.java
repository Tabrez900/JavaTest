package com.singtel.test;

class Animal implements WalkInterface, SoundInterface {
  public void walk(){
    System.out.println("I am walking");
  }

  public void sound() {
    System.out.println("Cluck, cluck");
  }
 }

 class Rooster extends Animal {
  public void sound() {
    System.out.println("Cock-a-doodle-doo");
  }
 }

 class Bird extends Animal implements FlyInterface, SingInterface, SwimInterface {
  public void fly() {
    System.out.println("I am flying");
  }

  public void sing() {
    System.out.println("I am singing");
  }

  @Override
  public void walk() {
    System.out.println("I am walking..");
  }

  @Override
  public void sound() {
    System.out.println("Quack, quack");
  }
  
  public void swim() {
    System.out.println("Duck: I am swimming");
  }
 }
 
 class Parrot implements ParrotInterface {

  public void parrotSoundWithDifferentAnimals(String action) {
    switch(action) {
    
    case "dog": 
      System.out.println("Woof, woof");
      break;
    case "cat": 
      System.out.println("Meow");
      break;
    case "duck": 
      System.out.println("Quack, quack");
      break;
      
    default:
      System.out.println("Default action");
    }
  }
 }
 
 class Fish implements SwimInterface, FishInterface {

  public void swim() {
    System.out.println("Fish: I can swim");
    System.out.println("I can be a Dolphin also");
  }

  public void fishActivity(String fishType) {
    switch(fishType) {
    
      case "Shark": 
        System.out.println("Sharks are large and grey");
        System.out.println("Sharks eat other fish");
        break;
      case "ClownFish": 
        System.out.println("Clownfish are small and colourful");
        System.out.println("Clownfish make jokes");
        break;
        
      default:
        System.out.println("Default action");
    }
  }
 }
 
 class Butterfly implements FlyInterface {

  public void fly() {
    System.out.println("I am flying");
  }
 }
 
 class Caterpillar implements WalkInterface {

  public void walk() {
    System.out.println("I am crawling");
  }
 }
 
 public class Solution {
  public static void main(String[] args) {
    Bird bird = new Bird();
    bird.walk();
    bird.fly();
    bird.sing();
    
    Animal animal = new Animal();
    animal.walk();
    animal.sound();
    
    Rooster rooster = new Rooster();
    rooster.sound();

  }
 }
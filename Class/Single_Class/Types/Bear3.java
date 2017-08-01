// Bear3.java
class Bear3 {
  // Instance variables.
  private String name;
  private int age;
  private double weight;
  private double height;
  private double bmi;
  // Constructor function.
  public Bear3(String name, int age, double weight, double height){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }
  // Getters. cal
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public double getWeight(){
    return this.weight;
  }
  public boolean readyToHibernate(){
    return getBMI() >= 20;
  }
  public double getBMI(){
    bmi = (this.weight / this.height) / this.height;
    return bmi;
  }
}
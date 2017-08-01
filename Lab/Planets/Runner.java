//Runner.java
class Runner{
  public static void main(String[] args){
    Planet planet = new Planet("Uranus", 1825);
    String name = planet.getName();
    int size = planet.getSize();
    String output = String.format("%s is %d thousand miles wide...", name,
      size);
    System.out.println(output);
    output = planet.explode();
    System.out.println(output);
  }
}
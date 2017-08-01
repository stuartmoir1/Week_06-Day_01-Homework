//Runnner.java
class Runner{
  public static void main(String[] args){
    Bear bear = new Bear("Balu");
    bear.setName("Baloo");
    // String name = bear.getName();
    // System.out.println(name);
    // Get name directly (public variable). Now prevented by setting
    // instance variable name in class Bear to private.
    System.out.println(bear.name);
    // Set name directly (public variable). Now prevented by setting
    // instance variable name in class Bear to private.
    bear.name = "Bagheera";
    System.out.println(bear.name);
  }
}
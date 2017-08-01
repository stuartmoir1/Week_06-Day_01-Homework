public class Bear {
  // Instance variables.
  private String name;
  private Salmon[] stomach;
  // Cosntructor.
  public Bear(String name){
    this.name = name;
    this.stomach = new Salmon[5];
  }
  // Getters.
  public String getName(){
    return this.name;
  }
  public int foodCount(){
    int count = 0;
    for(Salmon salmon : stomach){
      if(salmon != null) {
        count++;
      }
    }
    return count;
  }
  public void eat(Salmon salmon){
    if (isStomachFull()) {
      return;
    }
    int foodCount = foodCount();
    stomach[foodCount] = salmon;
  }
  public boolean isStomachFull(){
    return foodCount() == stomach.length;
  }
  // TODO: change from enhanced for loop or get working.
  public void sleep(){
    for(Salmon salmon : stomach){
      salmon = null;
    }
  }
}

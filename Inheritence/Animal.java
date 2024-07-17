package Inheritence;

public class Animal {
  public static void main(String[] args){
    Dog data = new Dog("All animals are independent\nThey reproduce, and adapt to their environments.\nThey exhibit a range of behaviors such as seeking food, nurturing offspring, and establishing social hierarchies, which are common traits among various species.\n");
    data.myDoginfo("Bruno");
    data.info();
    

  }
}
class Animals {
  protected String characters;
  Animals(String characters){
    this.characters=characters;
  }
  public void info(){
    System.out.println(characters);
  }
}
class Dog extends Animals{
  public String name;
  Dog(String characters){
    super(characters);
  }
  public void myDoginfo(String name){
    System.out.println("My dog name is: "+name);
  }
}

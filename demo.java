public class demo {
  private String name;
  private int age;

  // Constructor with parameters
  public demo(String name, int age) {
      this.name = name; // 'this.name' refers to the instance variable 'name'
      this.age = age;   // 'this.age' refers to the instance variable 'age'
  }

  // Method to set name
  public void setName(String name) {
      this.name = name; // 'this.name' refers to the instance variable 'name'
  }

  // Method to set age
  public void setAge(int age) {
      this.age = age; // 'this.age' refers to the instance variable 'age'
  }

  // Method to display demo details
  public void display() {
      this.setName("Hemanth");
      this.setAge(20);
      System.out.println("\nUpdated demo Details:");
      System.out.println(age);
      System.out.println(name);
  }

  public static void main(String[] args) {
      // Create a demo object
      demo demo1 = new demo("Alice", 20);

      // Display initial demo details
      System.out.println("Initial demo Details:");
      System.out.println("Name: "+demo1.name);
      System.out.println("Age: "+demo1.age);
      demo1.display();


      // Change demo details
      

      // Display updated demo details
      
  }
}

class Car {

  String color;

  public Car(String CarColor) {
      color = CarColor;
  }

  public static void main(String[] args){
      Car myCar = new Car("red");
      System.out.println(myCar);
  }

 public String toString(){
     return "This is a " + color + " Car!";
 }
}
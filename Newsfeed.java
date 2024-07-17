import java.util.Arrays;
public class Newsfeed{
  public String[] arrays(){
    String[] arrays1={"Hemanth","Java","Python","C++"};
    return arrays1;
  }
public static void main(String[] args){
    Newsfeed access=new Newsfeed();
    String[] get=access.arrays();
    String mainData=Arrays.toString(get);
    System.out.println(mainData);

         
  }
}
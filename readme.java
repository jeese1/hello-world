class readme{
  private int num ;
  private String person ;
  public void String tell(String person,int num){
  this.person = person;
  this.num = num;
  System.out.println("Hello World,"+person+"you are the "+num+"th vister!")
 }
}
public class letter{
 public static void main(String args[]){
 readme myread = new readme("Arthur",42);
 }
} 

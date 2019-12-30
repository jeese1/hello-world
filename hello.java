class readme{
  private int num ;
  private String person ;
  public void tell(String.person,int num){
  System.out.println("Hello World , "+person+" . you are the "+num+"th vister !");
 }
  public void setNum(int num){
	  this.num = num ;
  }
  public int getNum(){
	  return num;
  }
  public void setPerson(String person){
	  this.person = person ; 
  }
  public String getPerson(){
	  return person;
  }
}
public class hello{
 public static void main(String args[]){
 readme myread = new readme();
 myread.setNum(2);
 myread.setPerson("Arthur");
 myread.tell(myread.getPerson(),myread.getNum());
 }
}
 //print result:"Hello World , Arthur . you are the 2th vister !"

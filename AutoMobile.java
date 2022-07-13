package Ob.op.pr;

public class AutoMobile {
  private String color;
  private int speed;
  private String make;
  public static  final int NUM_OF_GEAR=4; ;
  
  
  
  
  public void brkApply(int i){
	  speed =i-1;
  System.out.println(" spped is slow"+" "+speed);
  }
  public void changeGear(int i)
  {
	  i=i-2;
	  System.out.println(i);
  }
  
  
  
  public void setColor (String color) {
	  this.color = color;
	  
  }
  
  public String getColor() {
	  return color;
	  
  }
  public void setSpeed (int speed) {
	  this .speed = speed;
  }
  public int getspeed() {
	  return speed;
  }
  public void setMake( String make) {
	  this.make = make;
  }
  public String getMake() {
	  return make;
  }
  
  
}

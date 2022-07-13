package Ob.op.pr;

public class TestAutoMobile {
	public static void main(String[]args) {
AutoMobile m = new AutoMobile();


    m.setColor("black");
        
         System.out.println("Color of car   "+m.getColor());
           

    m.setSpeed(60);
          System.out.println("speed of car   "+m.getspeed());
          
     m.setMake("Honda");
     
           System.out.println("make car   "+m.getMake());
           m.changeGear(4);
           m.brkApply(6);
    
    
}

}

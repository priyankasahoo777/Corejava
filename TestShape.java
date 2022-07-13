package Ob.op.pr;

public class TestShape {
	public static void main(String[] args) {
		Shape a = new Shape();
		a.setBorderWidth(9);
		a.setColor("green");
		System.out.println(a.getBorderWidth() + "hii" + a.getColor());

		Shape a2 = new Shape();
	      a2.setBorderWidth(5);
	      a2.setColor("red");
	      System.out.println(a2.getBorderWidth() + "hello" +  a2.getColor());
	}
}
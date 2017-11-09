
import javax.swing.*;


public class mainTest{
	public static void main(String[] args) {
		Graphics g = new Graphics();
		RetangleModel a =  new RetangleModel();
		Rectangle ab = new Rectangle();
		a.addRectangle(ab);
		a.draw(g);
	}
	

}
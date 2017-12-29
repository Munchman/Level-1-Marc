import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot qaz = new Robot("mini");
	
public static void main(String[] args) {
	qaz.moveTo(100, 900);
	qaz.penDown();
	qaz.setSpeed(100000000);
	 Random r1= new Random();
	for (int i = 0; i < 47; i++) {
		int qwe=r1.nextInt(3);
		if (qwe==0) {
			house("small");
		}
		else if () {
			
		}
		int r2=new Random().nextInt(200);
	house(r2);
}}
static void house(String height) {
	
		
		
qaz.setPenColor(66,167,244);
qaz.move(height);
qaz.turn(45);
qaz.move(15);
qaz.turn(90);
qaz.move(15);
qaz.turn(45);
qaz.move(height);
qaz.turn(-90);
qaz.setPenColor(37,119,14);
qaz.move(15);
qaz.turn(-90);
	
}
}

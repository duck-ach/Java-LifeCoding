import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class Ok_javaGoinHomeInput {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a id");
		
		// Elevator call
		//Elevator = datatype, myElevator = 변
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id +" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id +" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(0);
		moodLamp.on();
				
	}

}

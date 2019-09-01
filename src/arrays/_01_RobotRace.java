package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) {
		boolean value= true;
		Random rand= new Random();
		Robot[] robot= new Robot[5];
		
		
		
		for(int i=0; i<5; i++) {
			robot[i] = new Robot();
			robot[i].setSpeed(10);
			robot[i].setX(50);
			robot[i].setY(550);
			
			
		}
	 while(value) {
		for(int j=0; j<5; j++) {
			
			int x= rand.nextInt(50);
			robot[j].move(x);
			
			
			if(robot[j].getY()<50) {
				System.out.println("Robot f" + j+" won the race");
				value=false;
				break;
				
			}
			
		}
		
		
	}
	 
}
	

	//2. create an array of 5 robots.
	
	
	
	
	

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}

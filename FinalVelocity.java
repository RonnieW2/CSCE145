import java.util.Scanner;
 
public class FinalVelocity {
  
	//Ronnie Wells
	public static final double ACCERELATION = 9.8;
	//the value of the acceleration due to gravity 
	
	public static final double xyz = 0.5;
	// m`/s^2
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		//creating a scanner key to get user input 
		
		System.out.println("Enter the initial velocity of the ball(in meters per second) at point A");
		double u = key.nextDouble();
		//let user enter the initial time 
		
		System.out.println("How much time (in seconds) does the ball take to reach point B?");
		//let user enter the initial time 
		double t = key.nextDouble();
		
		double v = u + ACCERELATION * t;
		//calculate the final velocity  (v)
		
		double s = u * t + xyz * ACCERELATION * Math.pow(t, 2);
		//calculate the distance traveled
		
		System.out.println("Final velocityof the ball = "+ v +" m/s");
		
		System.out.println("Distance traveled by the ball = "+ s +" meters");
		
		
	}
	
}

package exercice3;

public class ChargingRobotDemo {
	//methode static
	public static void charge(SimpleRobot r, int maxDist) {
	    // you write this part
		
			if(r.getForward() <= maxDist) {
				System.out.println( " le robot avance");
				return;
				
			}else if(r.getForward() == maxDist){
				System.out.println( "le robot est blocqué");
				return;
				
			}
			
		}
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SimpleRobot re = new SimpleRobot();
		 System.out.println("forward is : " + re.getForward());
		   
		 System.out.println("right is : " + re.getRight());
		  charge(re, 3);

	}

}

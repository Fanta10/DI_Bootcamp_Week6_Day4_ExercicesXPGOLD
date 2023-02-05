package exercice3;

public class SimpleRobot {
	//attributs
	private int forward = 1;
	private int right = 0;
	
	//constructeur sans parametres
	public SimpleRobot() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructeur avec parametres
	public SimpleRobot(int forward, int right) {
		super();
		this.forward = forward;
		this.right = right;
	}
	//getters et setters
	public int getForward() {
		return forward;
	}
	public void setForward(int forward) {
		this.forward = forward;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}

	

}

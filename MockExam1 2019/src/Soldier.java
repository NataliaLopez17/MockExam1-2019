import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;

/*
 * A soldier needs our help!
 * Find the methods below and implement them in order to support him.
 */

public class Soldier {
	private String firstName;
	private String lastName;
	private String tag;
	private String rank;
	private Point position;

	public Soldier(String firstName, String lastName, String tag, String rank, Point position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.tag = tag;
		this.rank = rank;
		this.position = position;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTag() {
		return tag;
	}

	public String getRank() {
		return rank;
	}

	public Point getPosition() {
		return position;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setNumberTag(String tag) {
		this.tag = tag;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void setPosition(Point position) {
		this.position = position;
	}

	/* You must return the distance of the target soldier to the point battle given as a parameter.
	 * the formula of distance of two points P1(X1,Y1) and P2(X2,Y2) is ((Y2 - Y1)^2 + (X2 - X1)^2) ^1/2 
	 * Hint: Look for the Point class in the Java 8 API and observe the predefined methods.
	 */

	public double distanceToBattle(Point battle) {
		// WRITE YOUR CODE HERE
		return Math.sqrt(Math.pow((battle.getY() - position.getY()), 2) + Math.pow(battle.getX() - position.getX(), 2)); 
	}

	/* Using the enemyZone parameter and the soldiers position determine if the soldier is inside
	 * or in the edge of the danger zone.
	 * Hint: Look for the Rectangle class in the Java 8 API and observe the predefined methods.
	 */
	public boolean inDanger(Rectangle enemyZone) {
		// WRITE YOUR CODE HERE
		if (enemyZone.contains(position) || enemyZone.getFrame().contains(position.getX(), position.getY())) {
			return true;
		}
		
		return false; // Dummy return.
	}

	/*
	 * The soldier has setup the radio to communicate with his base, but after a while the
	 * radio stopped working. He suspects that he needs to change the frequency in order to make
	 * it work again. Help him find the right frequency. Remember that the formula for sinusoidal
	 * functions is y(t) = A*sin(2*PI*f*t + theta).
	 * Hint #1: Look for the Math class in the Java 8 API and observe the predefined methods and fields.
	 * Hint #2: Solve for f on the previously mentioned sinusoidal function.
	 * Hint #3: sin(asin(t)) == t
	 */
	public double getRadioFrequency(double yOfT, double A, double t, double theta) {
		// WRITE YOUR CODE HERE
		return (Math.asin(yOfT/A)-theta)/(2*Math.PI*t); // Dummy return.
	}

	/*
	 * The Soldier lost his tag in battle and he needs to get a new one.
	 * All tags are numbers of 6 digits. Generate a new tag changing the last
	 * 3 digits with random numbers.
	 * Hint: Look for the Random class in the Java 8 API and observe the predefined methods.
	 */
	public void newTag(){
		// WRITE YOUR CODE HERE
		String[] newTag = tag.split(tag, tag.length());
	}

	/*
	 * A newly formed squad is looking for a leader. Decide who has more experience
	 * on their hands between the target and parameter soldier, then return their last
	 * name so the new squad know who he is. The name parameter has the following format: S.Rodriguez.
	 * Where S is the initial of the first name and Rodriguez is the last name. Also, for the sake
	 * of this exercise we will assume that there are three ranks: Captain, Major and Sergeant.
	 * Captain is the highest rank, then Major and then Sergeant.
	 * Hint: Ranks are in lexicographical order.
	 */
	public String teamLeader(String rank, String name) {
		if(this.rank.equals("Captain") && ((rank.equals("Major")) || rank.equals("Sergeant"))) {
			return this.lastName;
		}
		if(this.rank.equals("Major") && rank.equals("Sergeant")) {
			return this.lastName;
		}
		//if (rank.equals("Major") && this.rank.equals("Sergeant")) {
			//return name.substring(2);
		//}
		return name.substring(2); // Dummy return.
	}
}
/*
 * The soldier now needs you help in order to build his new Weapon.
 */

public class Weapon {
	private String name;
	private char type;		// 'M' = Manual, 'S' = Semi-Automatic and 'A' = Automatic
	private int damage;
	private int ammo;

	/* In order to construct a new Weapon for the soldier you will need to implement
	 * it's constructor. Make sure to initialize every instance variable.
	 * IMPORTANT: IN ORDER TO TEST THE CONSTRUCTOR YOU NEED TO IMPLEMENT THE GETTERS.
	 */
	public Weapon(String name, char type, int damage, int ammo) {
		// WRITE YOUR CODE HERE
		this.name = name;
		this.type = type;
		this.damage = damage;
		this.ammo = ammo;
	}

	/* 
	 * Implement getters and setters.
	 */
	public String getName() {
		// WRITE YOUR CODE HERE
		return name; // Dummy return.
	}

	public char getType() {
		// WRITE YOUR CODE HERE
		return type; // Dummy return.
	}

	public int getDamage() {
		// WRITE YOUR CODE HERE
		return damage; // Dummy return.
	}

	public int getAmmo() {
		// WRITE YOUR CODE HERE
		return ammo; // Dummy return.
	}

	public void setName(String name) {
		// WRITE YOUR CODE HERE
		this.name = name;
	}

	public void setType(char type) {
		// WRITE YOUR CODE HERE
		this.type = type;
	}

	public void setDamage(int damage) {
		// WRITE YOUR CODE HERE
		this.damage = damage;
	}

	public void setAmmo(int ammo) {
		// WRITE YOUR CODE HERE
		this.ammo = ammo;
	}

	/* Your partner needs a copy of the weapon that you have. Create the new weapon by 
	 * completing the method below.
	 * Hint: You need to create a new Weapon, you cannot edit your own.
	 */

	public Weapon craftACopy() {
		// WRITE YOUR CODE HERE
		return new Weapon(getName(), getType(), getDamage(), getAmmo());
	}

	/* Return true if the target and parameter objects are the same, return false otherwise.
	 * Two objects are considered equal if their instance variables are the same.
	 * Hint #1: Use the variable weapon to compare against the target object.
	 * Hint #2: Compare primitive data types with == and classes with its respective equals method.
	 */
	@Override
	public boolean equals(Object w) {
		if(!(w instanceof Weapon)) {
			return false;
		}
		
		Weapon weapon = (Weapon) w;	// <== Make sure to use this variable.
		// WRITE YOUR CODE HERE
		if(!(weapon.getAmmo() == this.ammo)) {
			return false;
		}
		if(!(weapon.getDamage() == this.damage)) {
			return false;
		}
		if(!(weapon.getName() == this.name)) {
			return false;
		}
		if(!(weapon.getType() == this.type)) {
			return false;
		}
		return true; 
	}

	/* Return the instance variables in a String.
	 * The format should be something like the following:
	 * Name: <name>, Type: <type>, Damage: <damage>, Ammo: <ammo>
	 * IMPORTANT: BE SURE TO TYPE IT EXACTLY AS SHOWN AND ONLY CHANGE WHAT IS INSIDE DE ANGLE BRACKETS.
	 */
	@Override
	public String toString() { 
		return "Name: " + this.name + ", " + "Type: " + this.type + ", " + "Damage: " + this.damage + ", " + "Ammo: " + this.ammo; // Dummy return.
	}


	/* The soldier needs your help to reload his Weapon.
	 * In the following method you will receive an amount of ammo
	 * and a exponent. This amount you will need to elevate it with
	 * the exponent variable provided and assign it to the ammo instance variable.
	 * The formula is: amount ^(exponent).
	 * Hint #1: Look for the Math class in the Java 8 API and observe the predefined methods.
	 * Hint #2: Be sure to add the old ammo too.
	 */ 

	public void reload(int amount, double exponent) {
		// WRITE YOUR CODE HERE
		this.ammo = (int) (getAmmo() + Math.pow(amount, exponent));
	}
}
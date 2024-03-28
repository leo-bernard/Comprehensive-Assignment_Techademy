package com.in28minutes.oops;

public class MotorBike {

	private int speed; // member variable

	MotorBike() {
		this(15);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public void increateSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	void start() {
		System.out.println("Bike Started");
	}

	/*
	 * void setSpeed(int speed) { // local variable
	 *
	 * //this.speed = speed; // System.out.println("Speed: " + speed); //
	 * System.out.println("Expected Speed: " + this.speed);
	 *
	 * }
	 *
	 * int getSpeed() { //return this.speed; }
	 */

}

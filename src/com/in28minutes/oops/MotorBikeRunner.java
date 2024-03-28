package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike honda = new MotorBike(100);
		MotorBike ducati = new MotorBike(200);
		MotorBike kia = new MotorBike();

		honda.start();
		// honda.setSpeed(65);

		ducati.start();
		// ducati.setSpeed(125);

		kia.start();
		kia.increateSpeed(45);

		honda.increateSpeed(45);
		ducati.increateSpeed(65);

		System.out.println("Honda Speed: " + honda.getSpeed());
		System.out.println("Ducati Speed: " + ducati.getSpeed());
		System.out.println("KIA Speed: " + kia.getSpeed());

		honda.decreaseSpeed(35);
		ducati.decreaseSpeed(55);
		kia.decreaseSpeed(25);

		System.out.println("Honda Speed: " + honda.getSpeed());
		System.out.println("Ducati Speed: " + ducati.getSpeed());
		System.out.println("KIA Speed: " + kia.getSpeed());

	}

}

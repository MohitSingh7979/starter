class Juicer{
	// fixed props
	String nameOfJuicer = "Juci"; // name of brand
	int capacity = 1; // capacity in litres
	int factor = 5;
	int minSpeed = 0;
	int maxSpeed = 100;
	
	// states
	boolean isOn = false; // whatever juicer is on/off
	int speed = 0; // speed in rpm
	
	void powerOn(){
		isOn = true;
	}

	void powerOff(){
		isOn = false;
		speed = 0;
	}

	void incSpeed(){
		if(speed + factor <= maxSpeed){
			speed += factor;
		}else{
			System.out.println("speed can't increased further");
		}
	}

	void decSpeed(){
		if(speed - factor >= minSpeed){
			speed -= factor;
		}else{
			System.out.println("speed can't decreased further");
		}
	}
	
	void showStatus(){
		if(isOn){
			System.out.println("Juicer "+ nameOfJuicer +" is on and running at "+ speed +" rpm.");
		}else{
			System.out.println("Juicer "+ nameOfJuicer +" is off");
		}
	}
}

class Test{
	public static void main (String[] args){
		Juicer j1 = new Juicer();
		j1.nameOfJuicer = "ssd";

		Juicer j2 = new Juicer();
		j2.nameOfJuicer = "hdd";

		j1.powerOn();
		j1.decSpeed();
		System.out.println(j1.speed);

		//j1.showStatus();
		//j2.showStatus();
	}
}

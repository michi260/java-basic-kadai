package kadai_015;

		class Car_Chapter15 {
		private int gear =1;
		private int speed =10;
		
		
	
	public Car_Chapter15 (int gear, int speed) {
		
		this.gear = gear;
		this.speed =speed;
		
		
	}
	
//メソッド
	public void gearChange(final int afterGear) {
		this.gear = afterGear;
		this.speed = switch(this.gear){
		
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default ->10;
		
		};
		
	}
		
		
	public void run() {
		System.out.println("ギア1から"+this.gear +"に切り替えられました");
		System.out.println("速度は時速"+this.speed+"kmです");
	}
		
	}

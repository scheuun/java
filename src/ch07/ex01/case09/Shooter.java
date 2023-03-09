package ch07.ex01.case09;

public class Shooter {
	private Gun gun; // dependency시 interface 사용
	
	public void fire() {
		this.gun.fire();
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}

package ch05.ex05.case06;

public class Shooter {
	private Gun gun; // 나중에 작성할 gun객체를 dependency shooter 객체가 gun의존 dependency를 멤버변수로 표형
						// A has B Shooter has a Gun
	public void fire() {
		gun.fire();
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}

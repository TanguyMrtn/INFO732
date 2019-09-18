
public abstract class Character {
	
	private WeaponBehavior weapon;
	
	public void fight() {
		weapon.useWeapon();
		Logger.getInstance().info("Info : " + this.getClass().getName() + " " + weapon.useWeapon());
	}
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w ;
	}
	
}

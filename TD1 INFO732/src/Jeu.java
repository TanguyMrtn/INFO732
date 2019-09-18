public class Jeu {

	public static void main(String[] args) {
		
		Queen q1 = new Queen();
		WeaponBehavior axe = new AxeBehavior();
		q1.setWeapon(axe);
		q1.fight();
		
		Knight kn1 = new Knight();
		WeaponBehavior sword = new SwordBehavior();
		kn1.setWeapon(sword);
		kn1.fight();

	}

}

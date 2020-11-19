package fight;

public class Warrior extends Hero{

	
	@Override
	public void fight(Assailable assa) {
		System.out.println("我是战士" + getName() + "攻击了" + assa.getName());
	}

	@Override
	public boolean canFightByDistanc(Assailable assa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pk(Assailable assa) {
		this.fight(assa);		
	}
	public Warrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Warrior(long id, String name, int level, int x, int y, int maxHp, int hp) {
		super(id, name, level, x, y, maxHp, hp);
		// TODO Auto-generated constructor stub
	}
	

	
}

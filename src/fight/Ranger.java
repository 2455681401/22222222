package fight;

public class Ranger extends LongRangeHero{

	@Override
	public void fight(Assailable assa) {
		if(canFightByDistanc(assa))
			System.out.println("我是射手" + getName() + "攻击了" + assa.getName());
	}

	@Override
	public boolean canFightByDistanc(Assailable assa) {		
		return true;
	}
	public Ranger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ranger(long id, String name, int level, int x, int y, int maxHp, int hp) {
		super(id, name, level, x, y, maxHp, hp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pk(Assailable assa) {
		// TODO Auto-generated method stub
		
	}

	

}

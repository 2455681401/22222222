package fight;

public class Magical extends LongRangeHero{

	
	
	

	public Magical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magical(long id, String name, int level, int x, int y, int maxHp, int hp) {
		super(id, name, level, x, y, maxHp, hp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight(Assailable assa) {
		if(canFightByDistanc(assa))
			System.out.println("我是魔法师 ");
	}

	@Override
	public boolean canFightByDistanc(Assailable assa) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void pk(Assailable assa) {
		// TODO Auto-generated method stub
		
	}
	
}

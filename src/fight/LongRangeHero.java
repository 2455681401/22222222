package fight;

public abstract class LongRangeHero extends Hero{
	private int attackRange;

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	
	
	public LongRangeHero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LongRangeHero(long id, String name, int level, int x, int y, int maxHp, int hp) {
		super(id, name, level, x, y, maxHp, hp);
		// TODO Auto-generated constructor stub
	}

	public abstract void fight(Assailable assa) ;

	
	public abstract boolean canFightByDistanc(Assailable assa) ;
	
}

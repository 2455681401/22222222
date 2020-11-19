package fight;

public abstract class Hero implements Assailable,PK,Comparable<Hero>{
	private long id;
	private String name;
	private int level;
	private int x;
	private int y;
	private int maxHp;
	private int hp;
	
	
	
	public double getDistance(Assailable assa1, Assailable ass2)
	{
		return 0;
	}
	
	
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(long id, String name, int level, int x, int y, int maxHp, int hp) {
		setId(id);
		setName(name);
		setLevel(level);
		setX(x);
		setY(y);
		setMaxHp(maxHp);
		setHp(hp);
	}
	@Override
	public int compareTo(Hero hero) {
		if(null == hero) return 1;
		if(getLevel() == hero.getLevel())
			return 0;
		else if(getLevel() > hero.getLevel())
			return 1;
		else 
			return -1;
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		return str.append(getName()).append("  ").append(getLevel()).toString();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}

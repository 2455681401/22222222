package fight;

public class WatchTower implements Assailable,PK{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "水晶";
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight(Assailable assa) {
		System.out.println(getName() + "正在攻击" + assa.getName());
	}

	@Override
	public boolean canFightByDistanc(Assailable assa) {
		// TODO Auto-generated method stub
		return false;
	}

	public WatchTower() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pk(Assailable assa) {
		fight(assa);
	}

	
	

	

}

package fight;

public interface Assailable {
	public String getName();
	public int getX();
	public int getY();
	public int getHp();
	public void setHp(int hp);
	public void fight(Assailable assa);
	public boolean canFightByDistanc(Assailable assa);
}

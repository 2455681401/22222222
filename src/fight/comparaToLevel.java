package fight;

import java.util.Comparator;

public class comparaToLevel implements Comparator<Hero>{
	@Override
	public int compare(Hero hero1, Hero hero2) {
		if(hero1 == null || hero2 == null)
			return 0;
		if(hero1.getLevel() == hero2.getLevel())
			return 0;
		return hero1.getLevel() > hero2.getLevel() ? 1 :-1;
	}
}

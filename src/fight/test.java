package fight;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;

public class test {
	public static void main(String[] args) {
		Hero 刀妹 = new Warrior(1, "艾瑞莉娅", 30, 0, 0, 300, 200);
		Ranger 寒冰 = new Ranger(2, "艾希", 20, 3, 3, 200, 150);
		WatchTower 水晶 = new WatchTower();
//		刀妹.pk(寒冰);
//		刀妹.pk(水晶);
//		水晶.pk(刀妹);
		Hero[] Heros = {刀妹,寒冰};
		List<Hero> lishero = new ArrayList<>();
		lishero.addAll(Arrays.asList(Heros));
		lishero.add(new Ranger(3, "黄伟", 10, 3, 3, 10, 20));
		System.out.println(lishero);
		for (Hero hero : lishero) {
			System.out.println("| foreach循环 ：" + hero);
		}
		System.out.println(lishero.get(0));
//		lishero.remove(2);
//		System.out.println(lishero);
		System.out.println("排序后");
		Collections.sort(lishero, new comparaToLevel().reversed());
		
		System.out.println(lishero);
		List<Integer> a = new ArrayList<>();
		Collections.sort(a);
//		Collections.sort(Arrays.asList(Heros), Collections.reverseOrder());
//		//排序逆序，公共hero类要重写compareTo方法，定义排序规则
//		for (int i = 0; i < Heros.length; i++) {
//			System.out.println(Heros[i]);
//		}
//		try {
//			
//		} catch (Exception e) {
//			 e.printStackTrace();
//		}
		
	}
}

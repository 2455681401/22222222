package ceshiti;

import java.util.ArrayList;

public class test3 {
	public static void main(String[] args) {
		Character[] a ={'1','2','2'};
		String b ="123";
		int sum = 0;
		char[] c = b.toCharArray();
		for (int i = 0; i < c.length; i++) {
			sum +=(c[i] - '0') * Math.pow(10,c.length-i-1);
		}
		
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i] - '0';
//		}
		System.out.println(sum);
		
		ArrayList<Object> d = new ArrayList<>();
		d.add(a);
		for (Object e : d) {
			System.out.println(e.toString());
		}
	}
}

package ceshiti;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入IP地址：");
		String text = input.nextLine();
		
		if (text.length() < 7 || text.length() > 15)
		{
			System.out.println("长度不合法");
			System.exit(0);
		}
		else{
			String[] str = text.split("\\.");
			if(str.length != 4)
			{
				System.out.print("个数不合法");
				System.exit(0);
			}
			else
			{
				for (int i = 0; i < str.length; i++) {
					char[] copystr = str[i].toCharArray();					
					for (int j = 0; j < copystr.length; j++) {
						if(copystr[j] > '9' || copystr[j] < '0')
						{
							System.out.println("ip地址不是纯数字");
							System.exit(0);
						}
						else
						{
							int sum = 0;
							for (int k = 0; k < copystr.length; k++) {
								sum +=(copystr[i] - '0') * Math.pow(10,copystr.length-i-1);
							}
							if(sum > 255)
							{
								System.out.println("ip地址数值错误");
								System.exit(0);
							}
						}
					}
				}
			}
		}
		System.out.println("ip地址输入正确");
		
		input.close();
	}
}

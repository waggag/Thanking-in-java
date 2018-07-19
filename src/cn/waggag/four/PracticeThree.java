package cn.waggag.four;

import java.util.Random;

/**
 * 循环，使用Ctrl+C中断程序
 * @author waggag
 * 2018年7月5日下午5:59:51
 */
public class PracticeThree 
{
	public static void main(String[] args) {
		test();
	}
	public static void test(){
		int[] b = ProRandom(25);
		while (true) {	//终止条件修改为true
			for (int i = 0; i < b.length; i++) {
				if (i == (b.length - 1)) {
					System.out.println(b[i] + "是最后一个产生的数" );
					break;
				}
				compare(b[i],b[i+1]);
			}
		}
	}
	public static void compare(int m,int n) {
		if (m == n) {
			System.out.println(m + "等于" + n);
		}
		else if (m > n) {
			System.out.println(m + "大于" + n);
		}
		else {
			System.out.println(m + "小于" + n);
		}
	}
	public static int[] ProRandom(int amount){
		Random rnd = new Random();
		int[] b = new int[amount];
		for (int i = 0; i < amount; i++) {
			b[i] = rnd.nextInt();    
		}
		return b;
	}
}

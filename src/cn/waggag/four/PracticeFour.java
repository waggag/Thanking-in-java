package cn.waggag.four;
/**
 * 打印素数
 * @author waggag
 * 2018年7月5日下午6:04:57
 */
public class PracticeFour 
{
	public static void main(String[] args) {
		test();
	}
	
	public static void test()
	{
		for (int i = 0; i < 30; i++) {
			if (isPrimeNum(i)) {
				System.out.println(i+"是素数");
			}
		}
		
	}
	
	public static boolean isPrimeNum(int num)
	{
		//Math.abs取绝对值
		for (int i = 2; i < Math.abs(num); i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}

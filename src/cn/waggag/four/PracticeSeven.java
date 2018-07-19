package cn.waggag.four;
/**
 * 使用break语句
 * @author waggag
 * 2018年7月5日下午6:28:26
 */
public class PracticeSeven {
	
	public static void main(String[] args) {
		int n = 0;
		while(n++ < 100){
			System.out.println(n+" ");
			if(n==99) {
				break;				
			}
		}
	}
}

package cn.waggag.four;
/**
 * 吸血鬼数字
 * @author waggag
 * 2018年7月5日下午6:43:14
 */
public class PracticeTen {
	
	public static void main(String[] args) {
		test();
	}
	public static void test(){
		int[] nums = new int[4];
		for (int i = 1001; i < 9801; i++) {
			getEachNum(i,nums);	
			int firstNumOne,secNumOne,secNumTwo;
			for (int j = 0; j < 4; j++) {
				firstNumOne = nums[0]*10+nums[1];
				secNumOne = nums[2]*10+nums[3];
				secNumTwo = nums[3]*10+nums[2];
				isPass(firstNumOne,secNumOne,i);
				isPass(firstNumOne,secNumTwo,i);
				moveOneStep(nums);
			}
		}
	}
	//获取四位数的每一位数并放入数组
	public static void getEachNum(int i,int[] args){
		String str = Integer.toString(i);
		for (int j = 0; j < 4; j++) {
			args[j]= Integer.parseInt(String.valueOf(str.charAt(j)));
		}
	}
	//判断是否符合题意
	public static void isPass(int num1,int num2,int i){
		if (i == num1 * num2) {
			System.out.println("数字"+ i +"是吸血鬼数");
		}
		
	}
	//将数组中元素向左移动一位，第一个数放到最后
	public static void moveOneStep(int[] args){
		int temp = args[0];
		for (int i = 0; i < args.length; i++) {
			if (i == args.length-1) {
				args[args.length-1] = temp;
				break;
			}
			args[i] = args[i+1];
		}
	}

}

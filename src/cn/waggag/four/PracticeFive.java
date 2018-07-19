package cn.waggag.four;
/**
 * 用三元操作符显示二进制0和1
 * @author waggag
 * 2018年7月5日下午6:09:07
 */
public class PracticeFive {
	
	public static void main(String[] args)
	{
        int a = 0xAAAA;
        int b = 0x5555;
        int c;
        c = a & b;
        outCBit(c);
        c = a | b;
        outCBit(c);
        c = ~a;
        outCBit(c);
        c = a ^ b;
        outCBit(c);
    }
    private static void outCBit(int c) 
    {
        int d = 0x8000;
        for (int i = 0; i < 16; i++) 
        {
            int out = (c | d) == c ? 1 : 0;//循环比较得出每一位
            System.out.print(out);
            d>>>= 1;
        }
        System.out.println();
    }
}

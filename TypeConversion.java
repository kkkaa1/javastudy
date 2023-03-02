package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		double dNum=1.2;
		float fNum = 0.9f;
		
		
		int iNum1 = (int)dNum + (int)fNum; // 1+0
		int iNum2 = (int)(dNum + fNum);// 2.1 (double)-> 2
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int num = 1000;
		byte bNum = (byte)num; // 데이터손실
		System.out.println(bNum);
	}

}

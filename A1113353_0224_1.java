import java.util.*;

public class A1113353_0224_01
{
	public static void main(String[] argv)
	{
		int num;
		System.out.println("請輸入一個整數:");
		Scanner number = new Scanner(System.in);
		num = number.nextInt();
		if(num%2==0)
		{
			System.out.println("為偶數");
		}
		else{
			System.out.println("為奇數");
		}
	}
}

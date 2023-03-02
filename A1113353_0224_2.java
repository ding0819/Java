import java.util.*;
public class A1113353_0224_02
{
	public static void main(String[] argv)
	{
		System.out.println("請輸入一個攝氏溫度:");
		Scanner tempF = new Scanner(System.in);
		int tempC = tempF.nextInt();
		System.out.println("華氏溫度為:" +(tempC * 9/5 + 32));
	}
}

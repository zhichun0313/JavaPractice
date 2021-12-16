/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*  例題
*
* @since jdk16
* Date:2021年12月16日.上午9:15:04
*/

public class Demo04 {
	
	public static void main(String[] args) {
		int n=2;
		
		switch(n) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("不合理");
			break;
		}
	}
}

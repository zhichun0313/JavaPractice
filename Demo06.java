/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
* �T���B���
* �i�H�Mif�y�y���Ĵ���
*
* @since jdk16
* Date:2021�~12��16��.�W��9:51:58
*/

public class Demo06 {
	public static void main(String[] args) {
		int a=10;
		int b=60;
		
		/*
		 * �����ϥΤT���B���
		 * int max = a>b?a:b
		 * 
		 */
		int max;
		if (a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println("�̤j��:" +max);
	}
}

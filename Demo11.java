/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*
*
* @since jdk16
* Date:2021年12月16日.上午11:16:23
*/

public class Demo11 {
	public static void main (String[]args) {
		
		for(int i=1;i<=10;i++) {
			//如果希望第4伺候，就部在執行
			if(i==4) {
				break;
			}
			System.out.println("Hello"+i);
		}
	}
}

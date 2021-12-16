/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
* do-while 循環
* 
* 標準格式
* do{
* 	循環體
* } while(條件判斷);
* 
* 擴展格式
* 
* 初始化語句
* 	do{
* 		循環體
* } while(條件判斷);
*
* @since jdk16
* Date:2021年12月16日.上午10:45:00
*/

public class Demo09 {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			System.out.println("good"+i);
		}
		System.out.println("==========================");
		
		int i=1; //1. 初始化語句
		do {
			System.out.println("good"+i); //3.循環體
			i++;
		}while(i <=10); //2. 條件判斷
	}
}

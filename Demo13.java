/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*  永遠停部下來的循環 叫做死循環
*  
*  死循環標準格式
*  
*  while(true){
*  	循環體
*  }
*
* @since jdk16
* Date:2021年12月16日.上午11:23:54
*/

public class Demo13 {
	public static void main(String[]srgs) {
		/*for(int i=1;i<=10;) {  //i++ 忘記了
			System.out.println("HI"+i);
		}*/
		
		while(true) {
			System.out.println("love");
		}
	}
}

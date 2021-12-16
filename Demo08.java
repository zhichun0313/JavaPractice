/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
* while 循環
* 標準格式
* 
*  while(條件判斷){
*  	循環體
*  }
*  
*  擴展格式
*  
*  初始化語句
*  while(條件判斷){
*  		循環體;
*  		步進語句
*  }
*
* @since jdk16
* Date:2021年12月16日.上午10:33:46
*/

public class Demo08 {
	public static void main(String[] args) {
		int i=1;   //初始化語句
		while(i <=10) { //條件語句
			System.out.println("很棒"+ i);  //循環體
			i++; //步進語句
		}
	}
}

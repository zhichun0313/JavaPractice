/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*
*
* @since jdk16
* Date:2021年12月16日.上午11:30:49
*/

public class Demo14 {
	public static void main(String[]args) {
		for(int hour=0;hour <24 ;hour++) { //控制小時
			
			for(int minute=0;minute<60;minute++) { //控制小時內地分鐘
				//System.out.println(hour+"點"+minute +"分");
				for(int second=0;second < 60;second++) {  //控制分鐘的秒數
					System.out.println(hour+"點"+minute +"分"+second+"秒ˇ");
				}
			}
		}
		
	}
}

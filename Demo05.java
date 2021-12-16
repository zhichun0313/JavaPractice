/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*
*
* @since jdk16
* Date:2021年12月16日.上午9:42:35
*/

public class Demo05 {
	public static void main(String[]args) {
		int score=-100;
		
		if(score >= 90 && score <= 100) {
			System.out.println("優秀");
		}else if(score >= 80 && score <90) {
			System.out.println("好");
		}else if(score >= 70 && score <80) {
			System.out.println("量");
		}else if(score >= 60 && score <70) {
			System.out.println("及格");
		}else if(score >= 0 && score <60){
			System.out.println("不及格");
		}else {
			System.out.println("數據錯誤");
		}
	}
}

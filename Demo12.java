/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
* continue 關鍵字
* 一但執行。立刻跳過當前次循環剩餘內容，馬上開始下一循環
*
*
* @since jdk16
* Date:2021年12月16日.上午11:18:44
*/

public class Demo12 {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i +"樓到了");
		}
		
	}
}

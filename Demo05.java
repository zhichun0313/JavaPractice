/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*
*
* @since jdk16
* Date:2021�~12��16��.�W��9:42:35
*/

public class Demo05 {
	public static void main(String[]args) {
		int score=-100;
		
		if(score >= 90 && score <= 100) {
			System.out.println("�u�q");
		}else if(score >= 80 && score <90) {
			System.out.println("�n");
		}else if(score >= 70 && score <80) {
			System.out.println("�q");
		}else if(score >= 60 && score <70) {
			System.out.println("�ή�");
		}else if(score >= 0 && score <60){
			System.out.println("���ή�");
		}else {
			System.out.println("�ƾڿ��~");
		}
	}
}

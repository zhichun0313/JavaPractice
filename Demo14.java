/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*
*
* @since jdk16
* Date:2021�~12��16��.�W��11:30:49
*/

public class Demo14 {
	public static void main(String[]args) {
		for(int hour=0;hour <24 ;hour++) { //����p��
			
			for(int minute=0;minute<60;minute++) { //����p�ɤ��a����
				//System.out.println(hour+"�I"+minute +"��");
				for(int second=0;second < 60;second++) {  //������������
					System.out.println(hour+"�I"+minute +"��"+second+"��");
				}
			}
		}
		
	}
}

/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
* do-while �`��
* 
* �зǮ榡
* do{
* 	�`����
* } while(����P�_);
* 
* �X�i�榡
* 
* ��l�ƻy�y
* 	do{
* 		�`����
* } while(����P�_);
*
* @since jdk16
* Date:2021�~12��16��.�W��10:45:00
*/

public class Demo09 {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			System.out.println("good"+i);
		}
		System.out.println("==========================");
		
		int i=1; //1. ��l�ƻy�y
		do {
			System.out.println("good"+i); //3.�`����
			i++;
		}while(i <=10); //2. ����P�_
	}
}

/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
* while �`��
* �зǮ榡
* 
*  while(����P�_){
*  	�`����
*  }
*  
*  �X�i�榡
*  
*  ��l�ƻy�y
*  while(����P�_){
*  		�`����;
*  		�B�i�y�y
*  }
*
* @since jdk16
* Date:2021�~12��16��.�W��10:33:46
*/

public class Demo08 {
	public static void main(String[] args) {
		int i=1;   //��l�ƻy�y
		while(i <=10) { //����y�y
			System.out.println("�ܴ�"+ i);  //�`����
			i++; //�B�i�y�y
		}
	}
}

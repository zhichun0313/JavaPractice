/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
* �D�X1-100�������ƩM
* 
*
* @since jdk16
* Date:2021�~12��16��.�W��10:55:06
*/

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 1.�d��T�w1��100�������ƩM �@�ӭ��ˬd
		 * 2.�@��100�ӼơA�ëD�Ҧ��Ʀr���ର���� ��if�y�y ���� num %2 ==0
		 * 3.�ݭn�@���ܶq �i��֥[�ާ@ ��Ϋe�a
		 */
		int sum=0;  //�֥[
		for(int i=1;i <=100;i++) {  //�P�_����
			if(i %2 ==0) {
				sum += i;
			}
		}
		System.out.println("���G�O"+sum);
		
	}
}

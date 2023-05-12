package tw.com.code.demo1;

import java.util.Scanner;

public class Accounting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int balance=0;
		String transaction="";
		int amount=0;
		
		System.out.println("簡易記帳系統:");
		
		while(!transaction.equals("QUIT")) {
			System.out.println("輸入交易類型(INCOME/EXPENSE/QUIT)");
			transaction=input.next();
			
			if(transaction.equals("INCOME")) {
				System.out.println("輸入收入金額:");
				amount=input.nextInt();
				balance += amount;
				System.out.println("成功記錄收入"+amount+"元，目前餘額:"+balance+"元");
			}else if(transaction.equals("EXPENSE")) {
				System.out.println("輸入支出金額:");
				amount=input.nextInt();
				balance -= amount;
				System.out.println("成功記錄支出"+amount+"元，目前餘額:"+balance+"元");
			}else if(transaction.equals("QUIT")){
				System.out.println("輸入錯誤，請重新輸入!");
			}
		}
		System.out.println("感謝使用，已結束");
	}
}

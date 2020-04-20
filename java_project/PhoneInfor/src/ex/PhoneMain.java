package ex;

import java.util.Scanner;

public class PhoneMain {
	
	static Scanner keyboard = new Scanner(System.in);

	 public static PhoneInfor input(){//입력처리
	  System.out.print("이름:");
	  String name = keyboard.nextLine();
	  System.out.print("전화번호:");
	  String phoneNumber = keyboard.nextLine();
	  System.out.print("생년월일:");
	  String birthday = keyboard.nextLine();
	  return new PhoneInfor(name,phoneNumber,birthday);
	 }
	 
	 public static void main(String ar[]){
	  PhoneInfor phone;
	 
	  while(true){//무한루프
	   System.out.println("1:입력 \n2:종료");
	   int input=keyboard.nextInt();
	   keyboard.nextLine();
	   if(input==1)
	    phone=input();
	   else
	    break;
	   phone.showInfor(null, null, null);
	  }
	  
	 }
	}


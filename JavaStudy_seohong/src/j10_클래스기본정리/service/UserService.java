package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {
	
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in); //Userservice 객체가 생성될 때 Scanner 생성
	}
	
	public User insertUser() {
		showInsertView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.print("사용자번호 입력: ");
		usercode = scanner.nextLine();
		System.out.print("이메일: ");
		email = scanner.nextLine();
		System.out.print("이름: " );
		name = scanner.nextLine();
		System.out.print("사용자이름: " );
		username = scanner.nextLine();
		System.out.print("비밀번호: " );
		password = scanner.nextLine();
		
		User user = new User(username, email, name, username, password);
		return user;
	}
	
	private void showInsertView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
}

package j23_예외처리;

import java.util.ArrayList;

public class CompanyMain {
	
	/*
	 * 1. printCompanies() 메소드에서 예외를 미룬(throws)
	 * 2. printCompanies() 메소드를 호출한 지점에서 예외처리를 한다.
	 * 3. NullpointException 처리를 한다.
	 *    메세지 출력: 해당 주소에는 Company객체가 존재하지 않습니다.
	 * 4. finally 회사 정보 출력 완료.
	 */
	
	public void printCompanies(ArrayList<Company> companies) throws Exception {
		for(Company c : companies) {
			System.out.println("회사명: " + c.getName());
			System.out.println("주소: " + c.getAddress());
		}
	}

	public static void main(String[] args) {
		CompanyMain companyMain = new CompanyMain();
		ArrayList<Company> companies = new ArrayList<Company>();
		
		companies.add(new Company("LG", "구미"));
		companies.add(new Company("삼성전기", "부산"));
		companies.add(new Company("apple", "실리콘벨리"));
		companies.add(null);
		companies.add(new Company("google", "실리콘벨리"));
		
		try {
			companyMain.printCompanies(companies);
		} catch (Exception e) {
			System.out.println("해당 주소에는 Company객체가 존재하지 않습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("회사 정보 출력 완료");
		}
		
		System.out.println("프로그램 종료");
		
	}

}

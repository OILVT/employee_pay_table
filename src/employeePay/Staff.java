package employeePay;
/*
<Staff클래스>
1) Staff클래스는 Employee클래스의 name, sno 필드와 toString() 메소드를 상속 받는다.
2) 추가로 자신의 title와 staffpay변수를 갖으며 상속받는 2개의 변수와 자신의 변수를 초기화할 생성자를 갖는다.
3) 자식클래스의 생성자의 매개변수는 자신의 변수를 초기화하기 위한 2개의 매개변수뿐만 아니라 상속받는 2개의 변수를 초기화 하기 위한 매개변수도 나타내야 한다.
4) Employee 부모클래스의 name - > ename 매개변수의 값, sno - > esno 매개변수의 값을 가지고 온다.
5) 클래스의 각 변수의 값
출력할 형태로 연결된 문자열을 반환하는 toString()메소드
급여를 정하여 반환하는 earnings() 메소드
*/

// Staff 클래스는 Employee를 상속
public class Staff extends Employee {
	// 필드추가 title, staffpay
	String title;
	private long staffpay;

	// 자식클래스 Staff 생성자의 매개변수는 자신의 변수를 초기화하기 위한 2개의 매개변수와 상속받는 2개의 변수를 초기화하기 위한 매개변수도 나타낸다.
	public Staff(String ename, String esno, String title, long staffpay) {
		// Employee 부모클래스의 ename, esno 매개변수 값을 가지고 온다.
		super(ename, esno);
		this.title= title;
		this.staffpay = staffpay;
	}
	
	public Long getStaffpay() {
		return staffpay;
	}
	
	void setStaffpay() {
		
	}

	@Override
	public String toString() {
		
		return super.toString() + ", 직책 : " + title + ", 급여액 : " + (staffpay + 20) + "만원";
	}

	@Override
	public long earnings() {
		return super.earnings();
	}
	
}
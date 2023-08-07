package employeePay;
/*
 <TempEmployee 클래스>
1) 임시직 사원을 나타내는 자식 클래스
2) 추가 dept, temphour필드와 TempEmployee()생성자
3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드
4) 월 근무시간 수에 3만원을 곱하여 급여액을 계산하는 erinings()메소드로 구성된다.
 */
public class TempEmployee extends Employee {
	String dept;
	long temphour;
	
	public TempEmployee(String dept,String esno,String ename,long temphour) {
		super(ename, esno);
		this.dept = dept;
		this.temphour = temphour;
	}
	
	public String toString() {
		return super.toString() + ", 부서 : "+dept+", 근무시간 수 : "+(temphour) +", 급여액 : "+(temphour*3)+"만원"; 
		}	
		public long earnings() {
		return temphour;
		
	}

}

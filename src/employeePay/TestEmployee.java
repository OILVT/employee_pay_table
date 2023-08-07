package employeePay;

import java.util.Scanner;

/*
 <금성급여프로젝트 만들기>
1. 자바개념잡기(접근지정자, 클래스의 개념, 메서드의 개념, 다형성, 상속)
2. 내 PC에 git으로 저장소에 넣기
3. git에 있는 내용과 github의 저장소에 넣기
4. 프로젝트 PPT 작성하기

<TestEmployee클래스> - 다음조건에 맞추어 직접 작성한다
1. 입력 자료 수는main(String[] args) 이용하여 입력 받는다.
2. 사원번호, 이름을 입력
3. 사원의 근무유형은 관리직(1), 정규직(2), 임시직(3)으로 구분한다.
사원번호가 잘 못 입력되면 “근무유형 오류 재입력….”을 출력하고 다시 입력을 받는다.
4. 관리자 - 직책과 임금을 입력
정규직 - 부서, 업무, 임금을 입력
임시직 - 부서, 월 근무시간수
5. 직무 유형에 따라 수당
관리자 : 20만원 정규직 : 10만원을 더해서 급여액을 더하여 출력한다.
임시직 : 시간당 3만원으로 정하고 시간 수에 월급여액을 구해서 출력한다.
*/
public class TestEmployee {

   public static void main(String[] args) {
//      // 필드선언시 클래스타입, 임시직, 정규직
//      
//      // 필드선언시 기본타입변수, String no,name
//      String no,name;
//      
//      // main메서드 매개변수인 args를 배열선언한다.
//      Scanner scan = new Scanner(System.in);
//      
//      
//      System.out.println("입력 자료 수 : ");
//      int n = scan.nextInt();
//      
//      n = Integer.parseInt(args[0]);
//      // 부모의 클래스를 입력하는 개수로 배열을 만든다.
//      Employee[] emp= new Employee[n];
//      
//
//              1. 입력 자료수 만큼 반복문 for
//            2. System.out.print("사원번호, 이름..");
//            3. no, name에 사원번호와 이름을 넣는다.
//            4. System.out.print("사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)… "
//            5.  int eno = scan.nextInt();
//              6.  입력된 eno 1과 3사이에 있어야 된다. => if(eno<1 || eno>3) 근무유형 오류 재입력
//            7. switch(eno) {
//            8. case 1 :  Staff클래스적용
//            9. case 2 :  RegEmployee클래스적용
//            10. case 3 : TempEmployee클래스적용
//            11.  default: }
//            
//            // 급여보고서
//            // 향상된 for(데이터타입 변수 : 배열 emp){ 
//             // System.out.println(변수 + "급여액:"+변수.earningd()+"만원"   }
      
      Scanner in = new Scanner(System.in);
      
      System.out.print("입력 자료 수 : ");
      int a = in.nextInt();   // a = 입력자료 수 숫자
      
      Employee ee[]= new Employee[a];
      
      for(int i=0; i<a; i++) {
         System.out.print("사원번호, 이름...");
         String sno = in.next();
         String name = in.next();      
      

         System.out.print("사원의 근무유형 : "+"(1:CEO, 2:정규직, 3: 임시직)");
         int b = in.nextInt();
    
         
      if(b==1) {
         System.out.print("직책, 월 임금...");
         String title = in.next();
         long pay = in.nextLong();
         ee[i]=new Staff(name,sno,title,pay);
      }
      
      else if(b==2) {
         System.out.print("부서, 업무, 월 임금..."); //
         String dept = in.next();
         String regtitle = in.next();
         long pay = in.nextLong();
         ee[i]= new RegEmployee(name,sno,dept,regtitle,pay);
      }
      
      else if(b==3) {
         System.out.print("부서, 월 근무시간 수..."); //
         String dept = in.next();
         long temphour = in.nextLong();
         ee[i]= new TempEmployee(name,sno,dept,temphour);
      }
      
      else {
         System.out.println("근무입력오류 재입력...");
         i--;
      }      

      System.out.println();
      }
      System.out.println();
      System.out.println("급여 보고서");
      
      for(int i=0; i<a; i++) {
      System.out.println(ee[i]);
      }
      in.close();
}
}
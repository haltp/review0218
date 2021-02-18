package util;

public class EmpListTest {
	public static void main(String[] args) {
		EmpList emplist = new EmpList();
		emplist.addEmp(new Emp(1, "홍길동", "인사"));
		emplist.addEmp(new Emp(2, "김기자", "기획"));
		emplist.addEmp(new Emp(3, "김유신", "개발"));
		
		//1번 사원의 이름은?
		System.out.println("1번 사원의 이름은: "+emplist.getName(0));
		
		//첫번째 사원 삭제
		//emplist.delEmp(1);
		
		//전체 조회
		System.out.println("전체조회: "+emplist.getList());
		
		//사원 이름만 출력
		System.out.println("[사원이름만]");
		emplist.getNames();
		
	}
}

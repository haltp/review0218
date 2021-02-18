package util;

import java.util.ArrayList;

public class EmpList {
	ArrayList<Emp> list;
	public EmpList() {
		list = new ArrayList<>();
	}
	//추가
	public void addEmp(Emp emp) {
		//to do
		list.add(emp);
	}
	//해당사원 이름조회
	public String getName(int index) {
		String name="";
		//to do
		name = list.get(index).name;
		return name;
	}
	//삭제
	public void delEmp(int index) {
		//to do
		//list.remove(1);
	}
	
	//전체이름 조회
//	public void getNames() {
//		String name="";
//		for(int i = 0; i<list.size(); i++) {
//			name=list.get(i).name;
//			System.out.println(name);
//		}
//	}
	//확장 for문으로 전체이름 조회
	public void getNames() {
		for(Emp e : list) {
			System.out.println(e.name);
		}
	}
	//전체 이름만 리턴 ==과제
	public String getNameStr() {
		String names="";
		//for()
		
		return names;
	}
	
	//list 조회
	public ArrayList<Emp> getList() {
		return list;
	}
}

class Emp{
	int id;
	String name;
	String dept;
	
	public Emp() {}
	public Emp(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}

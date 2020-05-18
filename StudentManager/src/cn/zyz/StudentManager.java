package cn.zyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * 学生管理类
 * 
 * @author 张雅帧
 * 
 */
public class StudentManager {

	List<Students> studentList  = new ArrayList<Students>();
	Scanner in = new Scanner(System.in);

	// 增加学生基本信息
	public void add() {

		while (true) {
			System.out.println("输入学生编号：");
			int id = in.nextInt();
			
			boolean flag = false;
			for (int i = 0; i < studentList.size(); i++) {
				Students student = studentList.get(i);
				if (student.getId() == id) {
					flag = true;
					break;
				}
			}
			
			if(flag){
				System.out.println("学号重复！");
				break;
			}
			
			System.out.println("输入学生姓名：");
			String name = in.next();
			System.out.println("输入学生出生年月：");
			String birDate = in.next();
			System.out.println("输入学生性别：");
			String sex = in.next();

			
			Students s = new Students();
			s.setId(id);
			s.setName(name);
			s.setBirDate(birDate);
			
			if("男".equals(sex)){
				s.setGender(true);
			}else{
				s.setGender(false);
			}
			
			studentList.add(s);
			System.out.println("添加成功,是否继续添加，按0表示退出，其他则继续！");
			String info = in.next();
			if ("0".equals(info)) {
				break;
			}
		}
	}

	/**
	 * 删除学生信息
	 * 
	 * @param studentList
	 */
	public void del() {
		while (true) {
			System.out.println("输入学生编号：");
			int id = in.nextInt();
			boolean flag = false;
			for (int i = 0; i < studentList.size(); i++) {
				Students student = studentList.get(i);
				if (student.getId() == id) {
					studentList.remove(i);
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("删除失败,未找到该学生信息，按0表示退出，其他则继续！");
			} else {

				System.out.println("删除成功,是否继续移除，按0表示退出，其他则继续！");
			}
			String info = in.next();
			if ("0".equals(info)) {
				break;
			}
		}

	}
	
	
	//查询学生信息
	public void query() {
		if(studentList==null || studentList.size()==0){
			System.out.println("暂无学生信息,请前往添加");
			return;
		}
		System.out.println("请输入要查询的学号：");
		int id = in.nextInt();
		boolean flag = false;
		for (int i = 0; i < studentList.size(); i++) {
			Students student = studentList.get(i);
			if (student.getId() == id) {
				System.out.println(student.toString());
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println("学生不存在！");
			return;
		}
		
	}
	
	
	//查看所有学生信息
	public void show() {
		
		for (int i = 0; i < studentList.size(); i++) {
			Students student = studentList.get(i);
			System.out.println(student.toString());	
		}
		if(studentList==null || studentList.size()==0){
			System.out.println("暂无学生信息");
		}
		
	}
	
	//更新学生信息
	public void update() {
		if(studentList==null || studentList.size()==0){
			System.out.println("暂无学生信息,请前往添加");
			return;
		}
		System.out.println("请输入学号：");
		int id = in.nextInt();
		boolean flag = false;
		for (int i = 0; i < studentList.size(); i++) {
			Students student = studentList.get(i);
			if (student.getId() == id) {
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println("学生不存在！");
		}
		
		System.out.println("输入学生姓名：");
		String name = in.next();
		System.out.println("输入学生出生年月：");
		String birDate = in.next();
		System.out.println("输入学生性别：");
		String sex = in.next();
		
		
		for (int i = 0; i < studentList.size(); i++) {
			Students student = studentList.get(i);
			if (student.getId() == id) {
				studentList.get(i).setBirDate(birDate);
				studentList.get(i).setName(name);
				if("男".equals(sex)){
					studentList.get(i).setGender(true);
				}else{
					studentList.get(i).setGender(false);
				}
				break;
			}
		}
		System.out.println("修改成功！");
		
		
	}
	
	//退出
	public void exit(){
		System.exit(0);
		
	}

	
	
	

}

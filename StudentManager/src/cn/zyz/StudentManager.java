package cn.zyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * ѧ��������
 * 
 * @author ����֡
 * 
 */
public class StudentManager {

	List<Students> studentList  = new ArrayList<Students>();
	Scanner in = new Scanner(System.in);

	// ����ѧ��������Ϣ
	public void add() {

		while (true) {
			System.out.println("����ѧ����ţ�");
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
				System.out.println("ѧ���ظ���");
				break;
			}
			
			System.out.println("����ѧ��������");
			String name = in.next();
			System.out.println("����ѧ���������£�");
			String birDate = in.next();
			System.out.println("����ѧ���Ա�");
			String sex = in.next();

			
			Students s = new Students();
			s.setId(id);
			s.setName(name);
			s.setBirDate(birDate);
			
			if("��".equals(sex)){
				s.setGender(true);
			}else{
				s.setGender(false);
			}
			
			studentList.add(s);
			System.out.println("��ӳɹ�,�Ƿ������ӣ���0��ʾ�˳��������������");
			String info = in.next();
			if ("0".equals(info)) {
				break;
			}
		}
	}

	/**
	 * ɾ��ѧ����Ϣ
	 * 
	 * @param studentList
	 */
	public void del() {
		while (true) {
			System.out.println("����ѧ����ţ�");
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
				System.out.println("ɾ��ʧ��,δ�ҵ���ѧ����Ϣ����0��ʾ�˳��������������");
			} else {

				System.out.println("ɾ���ɹ�,�Ƿ�����Ƴ�����0��ʾ�˳��������������");
			}
			String info = in.next();
			if ("0".equals(info)) {
				break;
			}
		}

	}
	
	
	//��ѯѧ����Ϣ
	public void query() {
		if(studentList==null || studentList.size()==0){
			System.out.println("����ѧ����Ϣ,��ǰ�����");
			return;
		}
		System.out.println("������Ҫ��ѯ��ѧ�ţ�");
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
			System.out.println("ѧ�������ڣ�");
			return;
		}
		
	}
	
	
	//�鿴����ѧ����Ϣ
	public void show() {
		
		for (int i = 0; i < studentList.size(); i++) {
			Students student = studentList.get(i);
			System.out.println(student.toString());	
		}
		if(studentList==null || studentList.size()==0){
			System.out.println("����ѧ����Ϣ");
		}
		
	}
	
	//����ѧ����Ϣ
	public void update() {
		if(studentList==null || studentList.size()==0){
			System.out.println("����ѧ����Ϣ,��ǰ�����");
			return;
		}
		System.out.println("������ѧ�ţ�");
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
			System.out.println("ѧ�������ڣ�");
		}
		
		System.out.println("����ѧ��������");
		String name = in.next();
		System.out.println("����ѧ���������£�");
		String birDate = in.next();
		System.out.println("����ѧ���Ա�");
		String sex = in.next();
		
		
		for (int i = 0; i < studentList.size(); i++) {
			Students student = studentList.get(i);
			if (student.getId() == id) {
				studentList.get(i).setBirDate(birDate);
				studentList.get(i).setName(name);
				if("��".equals(sex)){
					studentList.get(i).setGender(true);
				}else{
					studentList.get(i).setGender(false);
				}
				break;
			}
		}
		System.out.println("�޸ĳɹ���");
		
		
	}
	
	//�˳�
	public void exit(){
		System.exit(0);
		
	}

	
	
	

}

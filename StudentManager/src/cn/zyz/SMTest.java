package cn.zyz;

import java.util.Scanner;

/**
 * ������
 * @author ����֡
 *
 */
public class SMTest {
	
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		
		while(true){
			System.out.println("��ѡ�����");
			System.out.println("**********************************");
			System.out.println("*                               1������");
			System.out.println("*                               2������");
			System.out.println("*                               3��ɾ��");
			System.out.println("*                               4���޸�");
			System.out.println("*                               5�����");
			System.out.println("*                               6���˳�");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			
			switch (num) {
		        case 1:
		        	manager.add();
		            break;
		        case 2:
		        	manager.query();
		            break;
		        case 3:
		        	manager.del();
		            break;
		        case 4:
		        	manager.update();
		            break;
		        case 5:
		        	manager.show();
		            break;
		        case 6:
		        	manager.exit();
		            break;
		   }
			
			
		}
	}

}

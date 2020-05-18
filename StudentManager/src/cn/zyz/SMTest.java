package cn.zyz;

import java.util.Scanner;

/**
 * 测试类
 * @author 张雅帧
 *
 */
public class SMTest {
	
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		
		while(true){
			System.out.println("请选择操作");
			System.out.println("**********************************");
			System.out.println("*                               1、插入");
			System.out.println("*                               2、查找");
			System.out.println("*                               3、删除");
			System.out.println("*                               4、修改");
			System.out.println("*                               5、输出");
			System.out.println("*                               6、退出");
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

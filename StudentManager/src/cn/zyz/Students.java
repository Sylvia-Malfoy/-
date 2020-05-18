package cn.zyz;

/**
 * 学生类
 * @author 张雅帧
 *
 */
public class Students {

	//学号
	private int id;
	//姓名
	private String name;
	//出生年月
	private String birDate;
	//性别
	private boolean gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirDate() {
		return birDate;
	}
	public void setBirDate(String birDate) {
		this.birDate = birDate;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Students(int id, String name, String birDate, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.birDate = birDate;
		this.gender = gender;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		
		if(gender){
			return "学号:" + id + ", 姓名：" + name + ", 出生年月：" + birDate
					+ ", 性别：男";
		}else{
			return "学号:" + id + ", 姓名：" + name + ", 出生年月：" + birDate
					+ ", 性别：女";
		}
		
		
	}
	
	
	
	
}

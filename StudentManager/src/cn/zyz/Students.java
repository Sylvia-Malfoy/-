package cn.zyz;

/**
 * ѧ����
 * @author ����֡
 *
 */
public class Students {

	//ѧ��
	private int id;
	//����
	private String name;
	//��������
	private String birDate;
	//�Ա�
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
			return "ѧ��:" + id + ", ������" + name + ", �������£�" + birDate
					+ ", �Ա���";
		}else{
			return "ѧ��:" + id + ", ������" + name + ", �������£�" + birDate
					+ ", �Ա�Ů";
		}
		
		
	}
	
	
	
	
}

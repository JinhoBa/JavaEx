package java0328;
import java.util.*;
import java.time.*;
//���赵
public class Addr {
	private String name;
	private String tel;
	private String com;
	private LocalDateTime createDate;
	
	public Addr(String name, String tel, String com, LocalDateTime createDate) {
		super();
		this.name = name;
		this.tel = tel;
		this.com = com;
		this.createDate = createDate;
	}
	
	public Addr() {}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[�ּҷ�: �̸� =" + this.name + " ��ȭ��ȣ" + tel+"ȸ��" + com + "�Է���" + createDate + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
}
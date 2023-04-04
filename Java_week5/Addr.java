package java0404;
import java.util.*;
import java.time.*;
//설계도
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
		return "[주소록: 이름  = " + this.name + " 전화번호 " + tel+"회사 " + com + "입력일 " + createDate + "]";
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

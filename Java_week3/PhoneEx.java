package projectfile;
import java.util.*;

public class PhoneEx {
	public static void main(String[] args) {
		ArrayList<Phone> phoList = new ArrayList<>();
		Phone pho1 = new Phone("갤럭시S23", "삼성전자",1000000);
		Phone pho2 = new Phone("갤럭시S20", "삼성전자",200000);
		Phone pho3 = new Phone("아이폰14", "애플",1500000);
		Phone pho4 = new Phone("갤럭시A33", "삼성전자",300000);
		Phone pho5 = new Phone("아이폰13", "애플",900000);
		phoList.add(pho1);
		phoList.add(pho2);
		phoList.add(pho3);
		phoList.add(pho4);
		phoList.add(pho5);
		
		System.out.println("---------삼성전자 휴대폰 출력----------");
		for (Phone phone : phoList) {
			if(phone.getCompany().equals("삼성전자"))
				System.out.println(phone.getpName()+phone.getCompany()+
						phone.getPrice()+" ");
		}
		System.out.println("---------애플 휴대폰 출력----------");
		for (Phone phone : phoList) {
			if(phone.getCompany().equals("애플"))
				System.out.println(phone.getpName()+phone.getCompany()+
						phone.getPrice()+" ");
		}	
		System.out.println("---------100만원 미만 휴대폰 출력----------");
		for (Phone phone : phoList) {
			if(phone.getPrice() < 1000000)
				System.out.println(phone.getpName()+phone.getCompany()+
						phone.getPrice()+" ");
		}
	}
}

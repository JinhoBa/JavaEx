package java0404;
import java.time.LocalDateTime;
import java.util.*;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addrList = new ArrayList<>();
	static boolean c = true;
	public static void main(String[] args) { 
		while (c) {
			System.out.println("------------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("------------------");			
			System.out.print("메뉴를 입력하세요 :");			
			int n = sc.nextInt();
			switch (n) {
			case 1:
				addrInput();
				break;
			case 2:
				addrSearch();
				break;
			case 3:
				addrLoad();
				break;
			case 4:
				addrUpdate();
				break;
			case 5:
				addrDelete();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				c = false;
				break;

			default:
				System.out.println("잘못된 입력입니다. 다시입력하세요.");
				break;
			}
		}
	}
	public static void addrInput() {//데이터 입력
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("전화번호릂 입력하세요 : ");
		String tel = sc.next();
		System.out.println("회사를 입력하세요 : ");
		String com = sc.next();
		LocalDateTime date = LocalDateTime.now();
		Addr add1 = new Addr(name, tel, com, date);
		addrList.add(add1);
		System.out.println(add1);
	}
	public static void addrSearch() {//데이터 검색
		System.out.print("검색할 이름을 입력하세요 : ");
		String name =  sc.next();
		for(Addr addr : addrList) {
			if(addr.getName().equals(name))
				System.out.println(addr);
		}
	}
	public static void addrLoad() {//데이터 조회
		for (Addr addr : addrList) {
			System.out.println(addr);
		}
	}
	private static void addrUpdate() {
		System.out.print("수정할 이름을 입력하시오.");
		String name = sc.next();
		System.out.print("수정할 전화번호를 입력하시오.");
		String tel = sc.next();
		System.out.print("수정할 회사이름를 입력하시오.");
		String com = sc.next();
		for (Addr addr : addrList) {
			if(addr.getName().equals(name)) {
				addr.setTel(tel);
				addr.setCom(com);
				System.out.println(addr+"로 수정되었습니다.");
			}
		}
	}
	public static void addrDelete() {
		System.out.println("삭제할 이름을 입력하시오.");
		String name = sc.next();
		for (int i = 0; i < addrList.size(); i++) {
			if(addrList.get(i).getName().equals(name)) {
				addrList.remove(i);
			}
		}
				
		
	}
}
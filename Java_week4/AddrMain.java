package java0328;
import java.time.LocalDateTime;
import java.util.*;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addrList = new ArrayList<>();
	public static void main(String[] args) { 
		while (true) {
			System.out.println("------------------");
			System.out.println("1. �ּҷ� �Է�");
			System.out.println("2. �ּҷ� �˻�");
			System.out.println("3. �ּҷ� ��ȸ");
			System.out.println("4. �ּҷ� ����");
			System.out.println("5. �ּҷ� ����");
			System.out.println("0. ����");
			System.out.println("------------------");			
			System.out.print("�޴��� �Է��ϼ��� :");			
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
				
				break;

			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է��ϼ���.");
				break;
			}
		}
	}
	public static void addrInput() {
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.println("��ȭ��ȣ�e �Է��ϼ��� : ");
		String tel = sc.next();
		System.out.println("ȸ�縦 �Է��ϼ��� : ");
		String com = sc.next();
		LocalDateTime date = LocalDateTime.now();
		Addr add1 = new Addr(name, tel, com,date);
		addrList.add(add1);
		System.out.println(add1);
	}
	public static void addrSearch() {
		for(Addr addr : addrList) {
			
		}
	}
	public static void addrLoad() {
		
	}
	private static void addrUpdate() {
		// TODO Auto-generated method stub
		
	}
	public static void addrDelete() {
		
	}
}
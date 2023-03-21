package projectfile;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(100);
		aList.add(200);
		aList.add(300);
		aList.add(1,150);
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i)+ "\t");
		}
		System.out.println("-----------------");
		int sum = 0;
		for (Integer item : aList) {
			System.out.println(item + "\t");
			sum += item;
		}
		System.out.println("합계 = " + sum);
		
	}
}

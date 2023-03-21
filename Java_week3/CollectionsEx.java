package projectfile;
import java.util.*;

public class CollectionsEx {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("트렌스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");
		
		Collections.sort(myList);
		for (String list : myList) {
			System.out.print(list + " ");
		}
		System.out.println();
		Collections.reverse(myList);
		for (String list : myList) {
			System.out.print(list + " ");
		}
		System.out.println();
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}
}

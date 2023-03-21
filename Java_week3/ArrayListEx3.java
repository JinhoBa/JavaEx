package projectfile;
import java.util.*;
//학생 명단 작성
public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<>();
		Student std1 = new Student("배진호", 20185063, "컴소과", "010-3160-1921");
		Student std2 = new Student("유재석", 20215478, "디자인과", "010-1111-1111");
		Student std3 = new Student("이제니", 20208462, "컴정과", "010-2222-2222");
		Student std4 = new Student("리사", 20235483, "건축과", "010-3333-3333");
		stuList.add(std1);
		stuList.add(std2);
		stuList.add(std3);
		stuList.add(std4);
		
		System.out.println("----------컴소과 학생 명단----------");
		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getDept().equals("컴소과")) {
				System.out.println(stuList.get(i).getName()+stuList.get(i).getStuId()
						+ stuList.get(i).getTel());
			}
		}
		System.out.println("----------디자인과 학생 명단----------");
		for (Student student : stuList) {
			if (student.getDept().equals("디자인과")) {
				System.out.println(student.getName() + student.getStuId()+ student.getTel());
			}
		}
	}
}

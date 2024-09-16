package ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student stu=new Student("Palak",98);
       List< Student> li=new ArrayList<Student>();
       li.add(new Student("Palak", 87));
       li.add(new Student("Devesh", 88));
       li.add(new Student("Mehak", 89));
       li.add(new Student("Devansh", 90));
       Collections.sort(li,(x,y)->{return (int)(y.getMarks()-x.getMarks());});
       
       
       for(int i=0;i<3;i++)
    	   System.out.println(li.get(i));
       
	}

}

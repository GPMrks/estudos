package MapJAVA;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> student = new HashMap<>();

        student.put("Name", "John");
        student.put("Age", "17");
        student.put("Grade", "8.5");
        student.put("Class", "3A");

        System.out.println(student);

        System.out.println(student.keySet());

        System.out.println(student.values());

        List<Map<String, String>> studentsList = new ArrayList<>();

        studentsList.add(student);

        Map<String, String> student2 = new HashMap<>();

        student2.put("Name", "Mary");
        student2.put("Age", "18");
        student2.put("Grade", "8.9");
        student2.put("Class", "3B");

        studentsList.add(student2);

        System.out.println(studentsList);

        System.out.println(student.containsKey("Name"));

    }
}

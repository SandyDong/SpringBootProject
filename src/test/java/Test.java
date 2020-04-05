import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("aaa");

        List<Student> studentList = new LinkedList<Student>();
        studentList.add(null);
        studentList.add(new Student("aa", "bb"));
        studentList.add(null);
        studentList.add(new Student("bb", "cc"));
        System.out.println(studentList.size());
        for (Student student : studentList) {
            if (null != student) {
                System.out.println(student.getName() + "===>" + student.getAddress());
            }
        }
        System.out.println("***************************************************");
        //java1.8lambda表达式写法
        studentList.forEach(student -> {
            if (null != student) {
                System.out.println(student.getAddress() + "===>" + student.getName());
            }
        });
    }

}


class Student {

    private String name;

    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
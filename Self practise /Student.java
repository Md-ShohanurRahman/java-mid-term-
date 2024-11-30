public class Student {
    private int id;
    private String note;

    //  here this is a  default constructor 
    public Student() {
        System.out.println("Default constructor is  called");
    }

    public Student(int studentId) {
        id = studentId;
        System.out.println("Parameterized constructor is  called with ID: " + id);
    }

    public String setMessage(String msg) {
        note = msg;
        return note;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(42);
        
        String result = s2.setMessage("Hello, this is a test message of my java lab practice code");
        System.out.println(result);
    }
}

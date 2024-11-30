public class Start {
    public static void main(String[] args) {
        
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo();
        StudentInfo s3 = new StudentInfo();
        StudentInfo s4 = new StudentInfo();
        StudentInfo s5 = new StudentInfo();

        
        s1.setName("Shohanur Rahman");
        s1.setId("S101");
        s1.setDepartment("CSE");
        s1.setCgpa(3.75);
        s1.setAddress("Bashundhara RA");

        s2.setName("Shabbir Hossen");
        s2.setId("S102");
        s2.setDepartment("CSE");
        s2.setCgpa(3.65);
        s2.setAddress("Pabna");

        s3.setName("Rahul Sarker");
        s3.setId("S103");
        s3.setDepartment("CSE");
        s3.setCgpa(3.85);
        s3.setAddress("Dhaka");

        s4.setName("Samiul Basar");
        s4.setId("S104");
        s4.setDepartment("CSE");
        s4.setCgpa(3.95);
        s4.setAddress("Rajshahi");

        s5.setName("Nabil Sadman");
        s5.setId("S105");
        s5.setDepartment("CSE");
        s5.setCgpa(3.85);
        s5.setAddress("Khulna");

    
        System.out.println();
        System.out.println();
        System.out.println("All the student details");
        System.out.println();
        System.out.println();

        System.out.println("Information about Student S1");
        System.out.println();
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("Department: " + s1.getDepartment());
        System.out.println("CGPA: " + s1.getCgpa());
        System.out.println("Address: " + s1.getAddress());
        System.out.println();

        System.out.println("Information about Student S2");
        System.out.println();
        System.out.println("Name: " + s2.getName());
        System.out.println("ID: " + s2.getId());
        System.out.println("Department: " + s2.getDepartment());
        System.out.println("CGPA: " + s2.getCgpa());
        System.out.println("Address: " + s2.getAddress());
        System.out.println();

        System.out.println("Information about Student S3");
        System.out.println();
        System.out.println("Name: " + s3.getName());
        System.out.println("ID: " + s3.getId());
        System.out.println("Department: " + s3.getDepartment());
        System.out.println("CGPA: " + s3.getCgpa());
        System.out.println("Address: " + s3.getAddress());
        System.out.println();

        System.out.println("Information about Student S4");
        System.out.println();
        System.out.println("Name: " + s4.getName());
        System.out.println("ID: " + s4.getId());
        System.out.println("Department: " + s4.getDepartment());
        System.out.println("CGPA: " + s4.getCgpa());
        System.out.println("Address: " + s4.getAddress());
        System.out.println();

        System.out.println("Information about Student S5");
        System.out.println();
        System.out.println("Name: " + s5.getName());
        System.out.println("ID: " + s5.getId());
        System.out.println("Department: " + s5.getDepartment());
        System.out.println("CGPA: " + s5.getCgpa());
        System.out.println("Address: " + s5.getAddress());
        System.out.println();

        
        s2 = null;
        s4=null;

        StudentInfo[] students = {s1, s2, s3, s4, s5};

       
        System.out.println("After updating the student information  ");
        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (students[i] != null) {
                
                System.out.println("Information about Student S" + (i + 1));
                System.out.println();
                System.out.println("Name: " + students[i].getName());
                System.out.println("ID: " + students[i].getId());
                System.out.println("Department: " + students[i].getDepartment());
                System.out.println("CGPA: " + students[i].getCgpa());
                System.out.println("Address: " + students[i].getAddress());
            } else {
                System.out.println("Information about Student S" + (i + 1));
                System.out.println("The record of this  student  is not found according to  the updated information ");
            }
            System.out.println();
        }
    }
}

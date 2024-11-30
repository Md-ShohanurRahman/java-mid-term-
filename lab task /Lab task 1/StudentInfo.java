public class StudentInfo{
    
    private String name ;
    private String id  ;
    private String department  ;
    private double cgpa ;
    private String address ;

    public void setName(String m) {
        name = m;
    }
    public String getName (){
        return name ;
    }

    public void setId(String i) {
     id =i ;
    }
    public String getId (){
        return id ;
    }

    public void setDepartment(String d) {
        department = d;
    }
    public String getDepartment  (){
        return department ;
    }
    public void setAddress(String a) {
        address =a;
    }
    public String getAddress  (){
        return address ;
    }
    public void setCgpa(double cg) {
       cgpa=cg;
    }
    public double getCgpa  (){
        return cgpa ;
    }
    
    
}
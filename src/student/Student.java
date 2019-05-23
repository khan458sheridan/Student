package student;

public class Student {

    private String name;

    private int age;

    private boolean sex;

    private String studentID;
    
    private boolean parttime; // branch parttime
    
    public Student(String name, int age, boolean sex, String studentID) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.studentID = studentID;
    }

    public String sayName() {
        return name;
    }
    
    public String repr() {
        String output = "";
        
        output += "Name: " + this.name + "\n";
        output += "Age: " + this.age + "\n";
        output += "Sex: " + (this.sex ? "Male" : "Female") + "\n";
        output += "StudentID: " + this.studentID + "\n";
        
        return output;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getStudentid() {
        return studentID;
    }

    public void setStudentid(String studentID) {
        this.studentID = studentID;
    }

    public boolean isParttime() {
        return parttime;
    }

    public void setParttime(boolean parttime) {
        this.parttime = parttime;
    }
}

package domain;

public class Student {
    private int id;
    private String name;
    private String gmail;
    private int age;
    private String course;

    public Student(int id, String name, String gmail, int age, String course){
        this.id = id;
        this.name = name;
        this.gmail = gmail;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

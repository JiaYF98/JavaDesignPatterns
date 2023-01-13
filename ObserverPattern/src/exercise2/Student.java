package exercise2;

public class Student implements Observer {
    private String name;
    private String departmentName;

    public Student(String name, Subject subject) {
        this.name = name;
        this.departmentName = subject.getDepartmentName();
        subject.addObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}

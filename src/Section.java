public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    public Section(String n){
        this.name = n;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudents(Student s){
        this.students[currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){

        String n = "";
        for(int i = 0; i < currentSize; i++){
            n += students[i].getName() + ", ";
        }

        System.out.println("This " + name + " class is taught by " + teacher.getName() + " and has " + currentSize + " students: " + n);
        return "";
    }
}

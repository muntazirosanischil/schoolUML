public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount = 0;

    public Student(String n, int g, int i){
        super(i, n);
        this.grade = g;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }

    public Section[] getSections() {
        return this.sections;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }
}

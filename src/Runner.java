public class Runner {
    public static void main (String[] args){
        School bhs = new School("Berkeley High");

        Section math = new Section("Math");
        Section compSci = new Section("CS");
        Section econ = new Section("Econ");

        Teacher henri = new Teacher("Math","Henri",12321);
        Teacher albinson = new Teacher("Computer Science","Albinson",23214);
        Teacher parker = new Teacher("Econ","Parker", 1287936935);

        Student munt = new Student("Munt", 11, 212421);
        Student mint = new Student("Mint", 11, 212422);
        Student mont = new Student("Mont", 11, 212423);
        Student ment = new Student("Ment", 11, 212424);
        Student mant = new Student("Mant", 11, 212425);
        Student Sammi = new Student("Sammi", 9, 212426);

        bhs.addSection(math);
        bhs.addSection(compSci);
        bhs.addSection(econ);

        math.setTeacher(henri);
        math.addStudents(mant);
        math.addStudents(mint);
        math.addStudents(mont);

        compSci.setTeacher(albinson);
        compSci.addStudents(ment);
        compSci.addStudents(munt);

        econ.setTeacher(parker);
        econ.addStudents(mint);
        econ.addStudents(Sammi);

        math.toString();
        compSci.toString();
        econ.toString();
    }
}


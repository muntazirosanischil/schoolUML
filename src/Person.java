public class Person {
    private String name;
    private int id;

    public Person(int i, String n){
        this.name = n;
        this.id = i;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int i){
        this.id = i;
    }
}

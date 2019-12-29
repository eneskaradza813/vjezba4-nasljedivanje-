package vjezba4;

public class Vjezba4 {

    public final String SCHOOL_NAME = "ITAcademy";
    
    public static void main(String[] args) {

        Person person = new Person("Samir", "Jukic");
        Student student = new Student("Enes", "Karadza", "10/16");
        Professor professor = new Professor("Omer", "Sadovic", "Java Programiranje");
        
        
        person.show();
        student.show();
        professor.show();
        
    }

}


package vjezba4;

 class Student extends Person{
     
     public String indexNumber;
     
     public Student(String firsName, String lastName, String indexNumber){
         super(firsName, lastName);
         
         this.indexNumber = indexNumber;
         
     }
     @Override
    public void show(){
        System.out.println("Student: " + firstName + " " + lastName + "ID NO. " + indexNumber);
    }
}

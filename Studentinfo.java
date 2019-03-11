package Student_Details;

public class Studentinfo{
    int age=18;
    String sex="MALE";
    String name,address,father_name,mother_name;
    public Studentinfo(){
        name="PETER";
        address="VIZAG";
        father_name="Mr. JOHN";
        mother_name="Mrs. MARY";
        System.out.println("!!STUDENT PERSONAL DETAILS!!");
        System.out.println("Name of the student is: "+name);
        System.out.println("Age: "+age);
        System.out.println("SEX: "+sex);
        System.out.println("Address of the student is: "+address);
        System.out.println("Father's name: "+father_name);
        System.out.println("Mother's name: "+mother_name);
        
    }
}
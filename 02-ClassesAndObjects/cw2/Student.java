public class Student
{
    String name,surname;
    boolean active,studentIdValid;
    int studentIdCard,age,semesterNumber;
    double averageGrade;
    public void main()
    {
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();
        s1.name="Andrzej";
        s1.surname="Nowak";
        s1.age=21;
        s1.studentIdCard=221133;
        s1.studentIdValid=false;
        s1.semesterNumber=2;
        s1.averageGrade=3.21;
        s2.name="Marek";
        s2.surname="Kowalski";
        s2.age=25;
        s3.name="Bartosz";
        s3.surname="Piątek";
        s3.age=19;
        s1.sayHello();
        s1.displayName();
        s1.displayAge();
        s2.displayName();
        s2.displayAge();
        s3.displayName();
        s3.displayAge();
        s1.studentInfo();
        s1.studentId();
    }

    private void displayName(){
        System.out.println(name+" "+surname);

    }

    private void sayHello(){
        System.out.println("Hello");
    }

    private void podbijLegitymacje(){
        if (studentIdValid==true){
            studentIdValid=false;
        }else{
            studentIdValid=true;
        }

    }

    private void displayAge(){
        System.out.println(age);
    }

    public void studentInfo(){
        System.out.println("Student id card: "+studentIdCard+" Is valid: "+studentIdValid+"\n Semester number "+semesterNumber+" Average grade: "+averageGrade);
    }
    public void studentId(){
        System.out.println("Name: "+name+" Id card number: "+studentIdCard+" is valid: "+studentIdValid);
    }
}

public class Student {

    //Atrybuty
    String imie;
    String nazwisko;
    int wiek;
    boolean czyZaoczny;
    double sredniaOcen;
    String numerAlbumu;
    boolean waznaLegitymacja;
    int semestr;
    

    //metody
  public static void main(String[] args){
        Student s1 = new Student();
        s1.sayHello();
        s1.imie ="Andrzej";
        s1.displayName();
        s1.wiek=22;
        s1.displayAge();
        s1.podbijLegitymacje();
        System.out.println("=============================================");
        Student s2 = new Student();
        s2.imie="Janusz";
        s2.numerAlbumu="112299";
        s2.semestr=3;
        s2.sredniaOcen=2.0;
        s2.studentInfo();
        s2.waznaLegitymacja= false;
        s2.idStatusChange();
        s2.studentIdInfo();
    }
  
    public void podbijLegitymacje(){
        System.out.println("Podbijam legitymacje");
    }

    public void zaliczSemestr(){
        System.out.println("Zaliczam semestr");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void displayName(){
        System.out.println(imie);
    }

    public void displayAge(){
        System.out.println(wiek);
    }
          
    public void studentInfo(){
        System.out.println(imie);
        System.out.println(semestr+" semestr");
        System.out.println(sredniaOcen);
    }
    
    public void idStatusChange(){
        if (waznaLegitymacja){
            waznaLegitymacja=false;
        }else{
            waznaLegitymacja=true;}
        }
        
     public void studentIdInfo(){
         System.out.println(imie);
         System.out.println(numerAlbumu);
         System.out.println(waznaLegitymacja);
        }
     }
    

package lesson2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class First {
    @Test
    public void first() {
        int a = 3;
        int b = 16;
        int c = sum(a, b);
        System.out.println(c);

        c = sum(22, 15);
        System.out.println(c);
    }

    private int sum(int a, int b) {
        System.out.println("First digit is: " + a + " and second is: " + b + "!");
        // Outcome: "First digit is: 3 and second is: 16!"
        int c = a + b;
        return c;
    }

    @Test
    public void usingObjects() {
        Student mihail = new Student();
        mihail.setFirstName("Mihail");
        mihail.setLastName("Ola la");
        mihail.setAge(18);
        mihail.setPersonalCode("12345-11122");
        Student timur = new Student();
        timur.setFirstName("Timur");
        timur.setLastName("Timurovich");
        timur.setAge(24);
        timur.setPersonalCode("543211-12345");
        System.out.println(mihail.getFirstName() + " " + mihail.getLastName());
        System.out.println(timur.getFirstName() + " " + timur.getLastName());
    }
    @Test

    public void usingStudents() {
        Student jelena = new Student();
        jelena.setFirstName("Jelena");
        jelena.setLastName("Obuhova");
        jelena.setAge(21);
        jelena.setPersonalCode("060606-21212");
        jelena.setSequenceNumber(1);
        jelena.setCourse("QA2");


        Student edgar = new Student();
        edgar.setFirstName("Edgars");
        edgar.setLastName("Korols");
        edgar.setAge(30);
        edgar.setPersonalCode("111111-22222");
        edgar.setSequenceNumber(2);
        edgar.setCourse("QA1");


        Student galka = new Student();
        galka.setFirstName("Galina");
        galka.setLastName("Blanka");
        galka.setAge(45);
        galka.setPersonalCode("232133-55555");
        galka.setSequenceNumber(3);
        galka.setCourse("QA1");


        Student ira = new Student();
        ira.setFirstName("Irina");
        ira.setLastName("Petrova");
        ira.setAge(22);
        ira.setPersonalCode("212334-56677");
        ira.setSequenceNumber(4);
        ira.setCourse("QA2");


        Student tom = new Student();
        tom.setFirstName("Toms");
        tom.setLastName("Testers");
        tom.setAge(26);
        tom.setPersonalCode("889900-67890");
        tom.setSequenceNumber(5);
        tom.setCourse("QA2");


        List<Student> students = new ArrayList<>();
        students.add(jelena);
        students.add(edgar);
        students.add(galka);
        students.add(ira);
        students.add(tom);
        System.out.println(jelena.getFirstName() + "; " + "Sequence number: " + jelena.getSequenceNumber() + "; " + "Course: " + jelena.getCourse());
        System.out.println(edgar.getFirstName() + "; " + "Sequence number: " + edgar.getSequenceNumber() + "; " + "Course: " + edgar.getCourse());
        System.out.println(galka.getFirstName() + "; " + "Sequence number: " + galka.getSequenceNumber() + "; " + "Course: " + galka.getCourse());
        System.out.println(ira.getFirstName() + "; " + "Sequence number: " + ira.getSequenceNumber() + "; " + "Course: " + ira.getCourse());
        System.out.println(tom.getFirstName() + "; " + "Sequence number: " + tom.getSequenceNumber() + "; " + "Course: " + tom.getCourse());

        for (Student scholar : students){
            if(scholar.getCourse().equals("QA2")) {
                System.out.println(scholar.getFirstName() + "Students are studying at the course QA2: ");
            }
        }
    }
}





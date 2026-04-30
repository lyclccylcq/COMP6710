package week5;

public class linkedList {
    enum Grade {
        P,
        CR,
        D,
        HD,
        PX,
        N,
    }
    record Student(String name,Grade garde){};
    record StudentRoll(Student head,Student tail){}
    Student alice = new Student("Alice", Grade.HD);
    Student bob   = new Student("Bob", Grade.CR);
    Student charlie = new Student("Charlie", Grade.P);
    StudentRoll roll=null;

}

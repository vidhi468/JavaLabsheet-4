// class Professor extends Teacher, Researcher { }
// ^ NOT ALLOWED in Java -> compile error: '{' expected
//
// Java extends only ONE class. Here Professor extends Teacher
// and simply USES a Researcher object (composition / "has-a").
public class Professor extends Teacher {
    Researcher researcher = new Researcher();

    void doBoth() {
        teach();                 // inherited from Teacher
        researcher.research();   // obtained through the object
    }
}

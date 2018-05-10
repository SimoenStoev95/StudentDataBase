import java.util.*;

public class DataBase {
    // private section
    private ArrayList<Student>  students;

    DataBase(){
        students = new ArrayList<Student>();
    }

    // public section

    // print data base

    // add student to the data base
    public void addStudent(Student student){
        if (student != null) {
            students.add(student);
        }
        else{
            System.out.println("Null pointer");
        }
    }

    // search for student by ID
        public final boolean studentExists(int ID, String password){
        for(int i = 0; i < students.size(); i++){
            Student pupil = students.get(i);
            if(pupil.getID() == ID && password.equals(pupil.getPassword())){
                return true;
            }
        }
        return false;
    }

    // get information for a particular student
    public final void serachStudentByIDandPassword(int ID, String password){
        if(studentExists(ID, password)){
            for(int i = 0; i < students.size(); i++){
                Student pupil = students.get(i);
                if(pupil.getID() == ID){
                    pupil.printStudent();
                    if(pupil.isStudentIn()){
                        System.out.println(pupil.getName() + " is successfully accepted with " + pupil.getSubjectName());
                    }
                    else{
                        System.out.println(pupil.getName() + " is not accepted in Sofia University");
                    }
                }
            }
        }
        else{
            System.out.println("Incorrect ID. There is no such student in the Data Base!");
        }
    }

    // print data base
    public final void print(){
        for (int i = 0; i < students.size(); i++){
            students.get(i).printStudent();
        }
    }
}

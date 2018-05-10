public class Student {
    // private section
    private String name;
    private int age;
    private long EGN;
    private String subjectName;
    private double mark;
    private int ID;
    private String password;
    // Constructors
    Student(){
        name = "Ivan"; age = 19; EGN = 9804107943L; subjectName = "Math"; mark = 4.00; ID = 1; password = "ihuahu95";
    }
    Student(String _name, int _age, long _EGN, String _subjectName, double _mark, int _ID, String pass){
        name = _name; age = _age; EGN = _EGN; subjectName = _subjectName; mark = _mark; ID = _ID; password = pass;
    }
    // Get information for student
    public final String getName (){
        return name;
    }
    public final int getAge(){
        return age;
    }
    public final long getEGN(){
        return EGN;
    }
    public final String getSubjectName(){
        return subjectName;
    }
    public final double getMark(){
        return mark;
    }
    public final int getID(){
        return ID;
    }
    public final String getPassword(){
        return password;
    }
    public final void printStudent(){
        System.out.println(getName() + "    " + getEGN() + "    " + getAge() + "    " + getSubjectName() + "    " + getMark());
    }
    // setters
    public void setName(String _name) {
        name = _name;
    }
    public void setAge(int _age){
        age = _age;
    }
    public void setEGN(long _EGN){
        EGN = _EGN;
    }
    public void setSubjectName(String _subjectName){
        subjectName = _subjectName;
    }
    public void setmark(double _mark){
        mark = _mark;
    }
    public void setID(int _ID){
        ID = _ID;
    }
    public void setPassword(String pass){ password = pass; }
    // method isStudentIn
    public boolean isStudentIn(){
        if(mark >= 4.80){
            return true;
        }
        return false;
   }
}

import java.util.Scanner;

public class Main {


    public static void test(DataBase dataBase){
        // Scanner scanner = new Scanner(System.in);
        Student st1 = new Student("Stoqn Georgiev Ivanov", 19, 9801231579L, "Math", 5.50, 1, "Stoqn1024");
        Student st2 = new Student("Ivan Georgiev Ivanov", 19, 9801231578L, "Biology", 3.50, 2, "Ivan1024");
        Student st3 = new Student("Antoaneta Simeonova Viktorieva", 19, 9801231519L, "History", 5.90, 3, "Toni1024");
        Student st4 = new Student("Qnica Simeonova Viktorieva", 19, 9801231524L, "History", 4.80, 4, "Qni1024");
        dataBase.addStudent(st1);
        dataBase.addStudent(st2);
        dataBase.addStudent(st3);
        dataBase.addStudent(st4);
    }

    public static void SignIn(DataBase dataBase){
        Scanner scanner = new Scanner(System.in);
        int ID;
        String password;
        boolean flag = true;
        while (flag){
            System.out.print("ID: ");
            ID = Integer.parseInt(scanner.nextLine());
            System.out.print("Password: ");
            password = scanner.nextLine();
            if(dataBase.studentExists(ID, password)){
                dataBase.serachStudentByIDandPassword(ID, password);
                flag = false;
            }
            else{
                System.out.println();
                System.out.println("Incorrect ID or Password!");
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
	// write your code here
        DataBase dataBase = new DataBase();
        test(dataBase);
        SignIn(dataBase);
    }
}

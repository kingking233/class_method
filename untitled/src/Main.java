import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer = "0";
        do {
            Student newStudent = new Student();
            System.out.println("what task would you like to perform");
            System.out.println("1.ADD STUDENT   2.VIEW STUDENT  3.EXIT STUDENT");

            Scanner choice = new Scanner(System.in);

            answer = choice.next();

            switch (answer) {
                case "1":
                    System.out.println("Enter the Name");
                    Scanner name = new Scanner(System.in);
                    String newName = name.next();
                    System.out.println("Enter the Age");
                    Scanner age = new Scanner(System.in);
                    int newAge = 0;
                    newAge= Integer.parseInt(age.next());
                    newStudent.addName(newName,newAge);

                     case "2":
                        newStudent.view();

                    case "3":

            }
        }while(!answer.equals("3"));
    }

}
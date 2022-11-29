import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Aryn berigiz : ");
            String name = scanner.nextLine();
            System.out.println("jashyn berigiz : ");
            int age = scanner.nextInt();
            Student student = new Student(name, age);
            if (!name.matches("[a-zA-Zа-яА-Я]*")){
                throw new Exp();
            }
            System.out.println(student);
        }catch (Exp e){
            System.out.println("san jazba");
    }catch (InputMismatchException e){
            System.out.println("Tamga jazbaa");
        }
    }
}
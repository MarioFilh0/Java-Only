import java.util.Scanner;
import com.entities.Student;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite seu nome e suas três notas: ");
        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println();
        System.out.println(student);
        System.out.println();
        student.media();


        sc.close();
    }
}
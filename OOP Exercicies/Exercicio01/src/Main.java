import com.entities.rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rectangle = new rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);





        sc.close();


    }
}

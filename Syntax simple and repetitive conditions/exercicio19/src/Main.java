import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){ // Programa se encerra quando x = false ou y = false.
            if(x > 0 && y > 0){
                System.out.println("primeiro"); // + +
            }else if(x > 0 && y < 0){
                System.out.println("quarto"); // + -
            }else if(x < 0 && y < 0){
                System.out.println("terceiro"); // - -
            }else if(x < 0 && y > 0){
                System.out.println("segundo"); // - +
            }else{
                System.out.println();
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}






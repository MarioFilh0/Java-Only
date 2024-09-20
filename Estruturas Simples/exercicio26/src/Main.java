import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        for(int i=1;n1>=i;i++){
            if(n1%i == 0){
                System.out.println("Divisores: "+i);
            }
        }
        sc.close();
    }
}

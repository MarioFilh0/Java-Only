import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        for(int i=1; i<=n1; i++){
            if(i%2==1){
                System.out.println("Números impares: "+i);
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int somain = 0;
        int somaout = 0;

        for(int x = 0; x<n; x++){
            int y = sc.nextInt();
            if(y >= 10 && y <= 20){
                somain += 1;
            }else{
                somaout += 1;
            }
        }
        System.out.println(somain+" in");
        System.out.println(somaout+" out");
    }
}

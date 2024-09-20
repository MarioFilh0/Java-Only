import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int j;
        int i;

        for(i=1;n1>=i;i++){
            int primeiro = i;
            int segundo = i*i;
            int terceiro = i*i*i;
            System.out.printf("%d %d %d\n",primeiro, segundo, terceiro);
        }
        sc.close();
    }
}

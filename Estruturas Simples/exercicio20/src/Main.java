import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean y = false;
        int gaso = 0;
        int dies = 0;
        int alcool = 0;

        while(!y){
            int x = sc.nextInt();
            switch(x){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gaso += 1;
                    break;
                case 3:
                    dies += 1;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO.");
                    System.out.println("Alcool: "+alcool);
                    System.out.println("Gasolina: "+gaso);
                    System.out.println("Diesel: "+dies);
                    y = true;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}

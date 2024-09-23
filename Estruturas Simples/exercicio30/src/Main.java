import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1,n2,n3;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        int mArit = (n1+n2+n3)/3;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        int mArit2 = (n1+n2+n3)/3;


        int mTotal = (mArit+mArit2)/2;

        System.out.println("1 Média: "+mArit);
        System.out.println("2 Media: "+mArit2);
        System.out.println("Média total: "+mTotal);


        sc.close();
    }
}
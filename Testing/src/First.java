import java.util.Scanner;

public class First {
    public static void main(String[] args){
        System.out.println("Menu lua chon: ");
        System.out.println("1.Danh sach");
        System.out.println("2.Lua chon  ");
        System.out.println("3.Kieu");
        System.out.println("4.Ham");

        Scanner sc = new Scanner(System.in);

        int check ;


        do {
            int i ;
            i = sc.nextInt();
            showMenu(i);
            System.out.println("Ban co muon tiep tuc");
            check = sc.nextInt();
        } while (check == 5);

    }

    public static void showMenu(int index){


        switch (index){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
        }

    }
}

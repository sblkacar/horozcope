import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        int month,day;
        Scanner input=new Scanner(System.in);
        System.out.println("Yılın kaçıncı ayında dünyaya geldiniz");
        month=input.nextInt();
        System.out.println(("Ayın kacıncı günü dünyaya geldiniz"));
        day=input.nextInt();
        switch (month){
            case 1:
                if (day<21){
                    System.out.println("Oğlak");
                } 
                else if (day>21) {
                    System.out.println("Kova");
                }
                break;
            case 2:
                if (day<21){
                    System.out.println("Oğlak");
                }
                else if (day>21) {
                    System.out.println("Kova");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        
    }

}

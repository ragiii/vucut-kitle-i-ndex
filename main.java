import java.util.Scanner;
public class main {
    public static void main(String[] args){
        double kilo,boy,kitle;
        Scanner giridi=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        boy=giridi.nextDouble();
        System.out.print("Lütfen kilonusu giriniz : ");
        kilo=giridi.nextDouble();
        kitle = kilo / (boy * boy) ;
        System.out.print("Vücut kitel indexniz :" + kitle);

    }
}

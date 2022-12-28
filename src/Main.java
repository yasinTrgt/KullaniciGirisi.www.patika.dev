import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,password,cevap,newPassword;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = sc.nextLine();
        System.out.print("Şifreniz : ");
        password = sc.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Başarılı ");

        }else if(password.equals("java123")){
            System.out.print("Kullanıcı adınız yanlış !!!");
        }else if(userName.equals("patika")){
            System.out.print("Şifreniz yanlış !!! Şifrenizi sıfırlamak istiyormusunuz ('EVET veya HAYIR') " );
            cevap = sc.nextLine();
            if(cevap.equals("EVET")) {
                System.out.print("Yeni şifre giriniz :");
                newPassword = sc.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı !!! Şifreniz eski şifre ile aynı olamaz ");
                }else{
                    System.out.print("Şifre oluşturuldu ...");
                }
            }else {
                System.out.print("Şifreyi oluşturmak istemediniz");
            }

        }
        sc.close();

    }
}

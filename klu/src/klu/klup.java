package klu;

import java.util.Scanner;

public class klup {
    static boolean aktif = true;
    static int hakSayisi = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (aktif) {
            if (hakSayisi > 0) {
                while (aktif) {
                    System.out.println("Kullanıcı Adınız: ");
                    String username = scanner.nextLine();

                    System.out.println("Şifreniz: ");
                    String password = scanner.nextLine();

                    boolean sonuc = login(username, password);
                    if (sonuc) {
                        System.out.println("Uygulamaya Başarılı Bir Şekilde Giriş Yaptınız");
                        break;
                    }else {
                    	if(hakSayisi==0)
                    	{
                    		aktif=false;
                    		break;
                    	}
                    }
                }
                if(aktif==false)
                {
                	System.out.println("Hak sayiniz dolmustur");
                }
            } else {
                System.out.println("Hak Sayınız Dolmuştur. Hesabınız Bloke Olmuştur");
            }
        } else {
            System.out.println("Hesabınız aktif değildir. Yöneticiniz ile iletişime geçiniz");
        }
    }

    public static boolean login(String username, String password) {
        if (username.equals("enes") && password.equals("123")) {
            return true;
        } else {
            hakSayisi--;
            System.out.println("Kullanici Adi Veya Sifreniz Yanlis");
            if (hakSayisi == 0) {
                aktif = false;
            }
            return false;
        }
    }
}
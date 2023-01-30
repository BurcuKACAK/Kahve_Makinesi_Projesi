package Kahve_Makinesi;

import java.util.Scanner;

public class Kahve_Makinesi1 {

    public static void main(String[] args) {

        System.out.println("KAHVE MAKINESI");

        kahveSecim();


    }
    public static void kahveSecim(){

        System.out.println("Hangi Kahveyi istersiniz?");
        System.out.println("Turk Kahvesi");
        System.out.println("Filtre Kahve");
        System.out.println("Espresso");
        Scanner input = new Scanner(System.in);

        String secim=input.nextLine().trim().replaceAll("[\\p{Punct}]", "");

        if (secim.equalsIgnoreCase("Turk Kahvesi")) {
            sutSecim();
            sekerSecim();
            boyutSecim();
        } else if (secim.equalsIgnoreCase("Filtre Kahve")) {
            sutSecim();
            sekerSecim();
            boyutSecim();
        } else if (secim.equalsIgnoreCase("Espresso")) {
            sutSecim();
            sekerSecim();
            boyutSecim();
        } else {
            System.out.println("Hatali Giris Yaptiniz!!! Lutfen Tekrar Deneyiniz");
            kahveSecim();
        }
    }

    public static void sutSecim(){

        System.out.println("Kahvenize Süt Eklememizi Ister Misiniz ?\n"+
                "Istiyorsaniz = Evet \n" +
                "Istemiyorsaniz = Hayir yaziniz.");

        Scanner input = new Scanner(System.in);
        String sut = input.next().replaceAll("[\\p{Punct}]", "").replaceAll("[0-9]","").trim();

        if (sut.equalsIgnoreCase("Evet")){
            System.out.println("Sutunuz Ekleniyor...");
        } else if (sut.equalsIgnoreCase("Hayir")){
            System.out.println("Kahveniz Sutsuz Olarak Hazirlaniyor...");
        } else {
            System.out.println("Lutfen Sut Secenegini Evet veya Hayir Olarak Belirtiniz");
        }

    }
    public static void sekerSecim(){
        System.out.println("Kahvenize Seker Eklememizi Ister Misiniz ?\n"+
                "Istiyorsaniz = Evet \n" +
                "Istemiyorsaniz = Hayir yaziniz.");

        Scanner input = new Scanner(System.in);
        String  seker = input.next().replaceAll("[\\p{Punct}]", "").replaceAll("[0-9]","").trim();


        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kahvenize Kac Seker Alirsiniz?");
            int sekerSayisi = input.nextInt();
            System.out.println(sekerSayisi+ " Seker Ekleniyor...");
        } else if (seker.equalsIgnoreCase("Hayir")){
            System.out.println("Kahveniz Sekersiz Olarak Hazirlaniyor...");
        } else {
            System.out.println("Lutfen Seker Secenegini Evet veya Hayir Olarak Belirtiniz");
        }

    }
    public static void boyutSecim(){


        System.out.println("Kahveniz Hangi Boyutta Olsun?\n" +
                "Buyuk Boy Icin = Buyuk,\n"+
                "Orta Boy Icin = Orta,\n"+
                "Kucuk Boy Icin = Kucuk yaziniz");

        Scanner input = new Scanner(System.in);
        String boy = input.next().replaceAll("[\\p{Punct}]", "").replaceAll("[0-9]","").trim();

        if (boy.equalsIgnoreCase("Buyuk")){
            System.out.println("Kahveniz Buyuk Boy Olarak Hazirlaniyor...");
        }else if (boy.equalsIgnoreCase("Orta")){
            System.out.println("Kahveniz Orta Boy Olarak Hazirlaniyor...");
        }else if (boy.equalsIgnoreCase("Kucuk")){
            System.out.println("Kahveniz Kucuk Boy Olarak Hazirlaniyor...");
        }else {
            System.out.println("Lutfen Kahveniz Icin Gecerli Bir Boy Giriniz");
        }
        System.out.println("Kahveniz " +boy+ " boy olarak hazirlanmistir. Afiyet Olsun...");
    }
}








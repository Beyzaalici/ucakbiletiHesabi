import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double normalTutar, tutar, km, perKm, yeniTutar, ucusTutari;
        int yas, ucusTipi;
        perKm = 0.10;

        Scanner input  = new Scanner(System.in);
        System.out.println("Gideceginiz rota kac Km'dir ?");
        km = input.nextDouble();
        System.out.println("Yasinizi giriniz : ");
        yas = input.nextInt();

        System.out.println("Ucus tipinizi Belirtiniz : (1 => Tek Yon , 2 => Gidis Donus ) ");
       ucusTipi = input.nextInt();
        if(km < 0 || yas < 0){
            System.out.println("Hatali Veri Girdiniz !");
        }
        normalTutar = km * perKm;
        System.out.println("Normal tutar: " + normalTutar + "TL");

        if(yas<12){
             tutar = normalTutar * 0.5;
            yeniTutar = normalTutar - tutar;
            if(ucusTipi == 2){
                tutar= yeniTutar * 0.2 ;
                ucusTutari = yeniTutar - tutar;
                System.out.println("Ucus tipi ve yas indirimi ile toplam tutar : " + ucusTutari + "TL");
            }
        }else if(yas>=12 && yas <=24){
            tutar= normalTutar * 0.1 ;
            yeniTutar = normalTutar - tutar;
            if(ucusTipi == 2){
                tutar= yeniTutar * 0.2 ;
                ucusTutari = yeniTutar - tutar;
                System.out.println("Ucus tipi ve yas indirimi ile toplam tutar : " + ucusTutari + "TL");
            }
        }else if(yas>=65){
            tutar= normalTutar * 0.3 ;
            yeniTutar = normalTutar - tutar;
            if(ucusTipi == 2){
                tutar= yeniTutar * 0.2 ;
                ucusTutari = yeniTutar - tutar;
                System.out.println("Ucus tipi ve yas indirimi ile toplam tutar : " + ucusTutari + "TL");
            }


        }




    }
}

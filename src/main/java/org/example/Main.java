package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.30,elma=3.80,muz=5,patlıcan=12,kiraz=0.5,cilek=13,akg,ekg,mkg,pkg,kkg,ckg,elmatutar,
        armuttutar,muztutar,cilektutar,patlıcantutar,kiraztutar,toplam;
        Scanner input =new Scanner(System.in);
        System.out.print("Armut kilogram miktarını giriniz:");
        akg= input.nextDouble();
        System.out.print("Elma kilogram miktarını giriniz:");
        ekg= input.nextDouble();
        System.out.print("Muz kilogram miktarını giriniz:");
        mkg= input.nextDouble();
        System.out.print("Patlıcan kilogram miktarını giriniz:");
        pkg= input.nextDouble();
        System.out.print("Kiraz kilogram miktarını giriniz:");
        kkg= input.nextDouble();
        System.out.print("Çilek kilogram miktarını giriniz:");
        ckg= input.nextDouble();
        elmatutar=elma*ekg;
        armuttutar=armut*akg;
        muztutar=muz*mkg;
        cilektutar=cilek*ckg;
        patlıcantutar=patlıcan*pkg;
        kiraztutar=kiraz*kkg;

        toplam=elmatutar+armuttutar+muztutar+cilektutar+patlıcantutar+kiraztutar;
        System.out.println("Toplam tutar:"+toplam);

    }
}
package com.training.mydesignpatternexamples.Structural_Patterns.AdapterPattern;


public class ProxyPatternApp {

    public static void main(String[] args) {

        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonEEAAdapter adapter = new TelefonEEAAdapter(samsungTelefon);

        priz.elektrikVer(adapter);
    }
}

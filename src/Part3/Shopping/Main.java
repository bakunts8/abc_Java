package Part3.Shopping;

import Part3.Cards.Business;
import Part3.Cards.Card;

public class Main {
    public static void main(String[] args) {


        Phone phone = new IPhone13("iphone", 400000, 320000);
        phone.guarantee();
        ElectronicShop.sell(phone);
        System.out.println(ElectronicShop.getCashIncome());
        System.out.println(ElectronicShop.getBankIncome());
        System.out.println(ElectronicShop.getGeneralIncome());

        System.out.println(ElectronicShop.getSoldProducts());
        System.out.println(Worker.salary);

        TV tv = new LG_8k("LG", 810000, 700000, 85);
        tv.guarantee();

        BankCard card = new BankCard(15000000);

        ElectronicShop.sellByCard(tv, card);
        System.out.println(ElectronicShop.getCashIncome());
        System.out.println(ElectronicShop.getBankIncome());
        System.out.println(ElectronicShop.getGeneralIncome());

        Computer computer = new Dell_Inspiron("Dell", 1200000, 1000000, 1024);
        computer.screenPicture();
        computer.guarantee();

        ElectronicShop.sellByCard(computer, card);
        System.out.println(ElectronicShop.getCashIncome());
        System.out.println(ElectronicShop.getBankIncome());
        System.out.println(ElectronicShop.getGeneralIncome());

        System.out.println(ElectronicShop.getSoldProducts());
        System.out.println(Worker.salary);

        IPhone iPhone = new IPhone13Pro("IPhone", 500000, 450000);
        iPhone.connectToSharedWiFi(phone, "12465431");
        System.out.println(iPhone.getIsConnectingToWiFi());
        SamsungPhones samsungPhones = new SamsungGalaxyA73("Samsung", 650000, 580000);
        iPhone.connectToSharedWiFi(samsungPhones, "10203040");
        System.out.println(iPhone.getIsConnectingToWiFi());

        System.out.println(ElectronicShop.getCashIncome());
        System.out.println(ElectronicShop.getBankIncome());
        System.out.println(ElectronicShop.getGeneralIncome());
    }
}

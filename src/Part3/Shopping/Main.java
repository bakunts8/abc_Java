package Part3.Shopping;

public class Main {
    public static void main(String[] args) {


        Phone phone = new IPhone("iphone", 400000, 320000);
        phone.guarantee();
        ElectronicShop.sell(phone);
        System.out.println(ElectronicShop.getCashIncome());
        System.out.println(ElectronicShop.getBankIncome());
        System.out.println(ElectronicShop.getGeneralIncome());

        TV tv = new SmartTV("SmartTv", 810000, 700000);
        tv.guarantee();
        ElectronicShop.sellByCard(tv);
        System.out.println(ElectronicShop.getCashIncome());
        System.out.println(ElectronicShop.getBankIncome());
        System.out.println(ElectronicShop.getGeneralIncome());

        Computer computer = new Notebook("notebook", 1200000, 1000000);
        computer.guarantee();
        ElectronicShop.sellByCard(computer);
        System.out.println(ElectronicShop.getCashIncome());
        System.out.println(ElectronicShop.getBankIncome());
        System.out.println(ElectronicShop.getGeneralIncome());

        System.out.println(ElectronicShop.getSoldProducts());
    }
}

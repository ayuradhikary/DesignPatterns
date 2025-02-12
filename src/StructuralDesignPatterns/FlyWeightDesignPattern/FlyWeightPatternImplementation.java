package StructuralDesignPatterns.FlyWeightDesignPattern;

public class FlyWeightPatternImplementation {
    public static void main(String[] args) {
        HeadPhoneObjectCache headPhoneObjectCache = new HeadPhoneObjectCache();
        HeadPhone headPhone = headPhoneObjectCache.getHeadPhone(22.3,"Apple");
        headPhone.getDescription(50000,"white","best","airpods");

        headPhone.getDescription(2000,"black","mediocre","airpods2");

    }
}

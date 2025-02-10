package StructuralDesignPatterns.FlyWeightDesignPattern;

public class FlyWeightHeadPhone implements HeadPhone {
    double size;  //intrinic data
    String company;

    public FlyWeightHeadPhone(double size, String company){
            this.size = size;
            this.company = company;
    }

    @Override
    public void getDescription(int price, String color, String audioQuality, String name) //extrinsic data
    {
        String message = """ 
            Headphones of company %s having size %s,
            color %s, model name %s and audio quality %s has price %s
            """;

        String formattedMessage = message.formatted(company,size,color,name,audioQuality, price);
        System.out.println(formattedMessage);

    }
}

package StructuralDesignPatterns.FlyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class HeadPhoneObjectCache {

    Map<String, FlyWeightHeadPhone> headPhone = new HashMap<>();

    public  FlyWeightHeadPhone getHeadPhone(double size, String companyName){
        if(!headPhone.containsKey(companyName)){
            headPhone.put(companyName, new FlyWeightHeadPhone(size,companyName));
        }
        return headPhone.get(companyName);
    }

    public int getTotalHeadPhonesCreated() {
        return headPhone.size();
    }

}

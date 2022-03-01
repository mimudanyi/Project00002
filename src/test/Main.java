package test;

import java.cn.mimudanyi.PetShop;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();   //开店
        shop.add(new Dog("黄狗","黄色"));
        shop.add(new Cat("小猫","红色"));
        shop.add(new Dog("天狗","紫色"));
        shop.add(new Cat("神猫","紫色"));
        shop.add(new Dog("舔狗","绿色"));
        Object[] result = shop.search("黄色").toArray();
        for (Object obj : result) {
            System.out.println(obj);
        }
    }
}
package com.company;

public class HeavyBox {
    private int weight;

    HeavyBox(int weight){
        this.weight = weight;
    }

    public void gruz200(){
        System.out.println("Отгрузили ящик с весом " + weight);
    }

    public void posting(){
        System.out.println("Отправяем ящик с весом " + weight);
    }

}

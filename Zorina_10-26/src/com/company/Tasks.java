package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks{

    public void Task_12(){
        Printable printable = s -> System.out.println(s);
        printable.print("Hello");
    }

    public void Task_13(){
        Predicate<String> isNull = s -> s != null;
        System.out.println(isNull.test("hello"));
        System.out.println(isNull.test(null));
    }

    public void Task_14(){
        Predicate<String> isPusto = s -> !Objects.equals(s, "");
        System.out.println(isPusto.test(""));
        System.out.println(isPusto.test("pusto"));
    }

    public void Task_15(){
        Predicate<String> isNull = s -> s != null;
        Predicate<String> isPusto = s -> !Objects.equals(s, "");
        System.out.println(isNull.and(isPusto).test("s"));
    }

    public void Task_16(){
        Predicate<String> ZV = s -> (s.startsWith("J") || s.startsWith("N")) && s.endsWith("A");
        System.out.println(ZV.test("JAVA"));
    }

    public void Task_17(){
        Consumer<HeavyBox> otpraV = s -> s.gruz200();
        Consumer<HeavyBox> post = s -> s.posting();
        otpraV.andThen(post).accept(new HeavyBox(228));
    }

    public void Task_18(){
        Function<Integer, String> function = s -> {
            if(s > 0){
                return "Положительное число";
            } else if (s < 0){
                return "Отрицательное число";
            }
            return "Ноль";
        };
        System.out.println(function.apply(2));
    }

    public void Task_19(){
        Supplier<Integer> randomNum = () -> {
            return (int) (Math.random() * 11);
        };
        System.out.println(randomNum.get());
    }

    public void Task_20(){
        Printable.sss();
    }

    public void Task_22(){
        NewThread newThread = new NewThread();
        newThread.start();
    }

    public void Task_23() throws InterruptedException {
        Runnable runnable = new NewRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        Thread.sleep(1000);
        thread3.start();
    }

    public void Task_0(){
        System.out.println(InitSingleton.getInstance());
    }

    public void Task_26(){
        ArrayList<String> nekiyList = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"));
        nekiyList = (ArrayList<String>) IntStream.range(0, nekiyList.size()).filter(i -> (i + 1) % 5 != 0).mapToObj(nekiyList::get).collect(Collectors.toList());
        System.out.println(nekiyList);
    }

}

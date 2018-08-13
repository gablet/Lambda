package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
       for(int i = 1; i<11;i++){
           numbers.add(i);
       }
//        for(int i = 0; i<numbers.size();i++){
//            System.out.println(numbers.get(i));
//        }
//        for(int e:numbers){
//            System.out.println(e);
//        }
        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer value) {
                System.out.println(value);
            }
        });
        numbers.forEach(Integer value)-> System.out.println(value));

    }
}

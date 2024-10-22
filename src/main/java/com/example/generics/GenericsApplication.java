package com.example.generics;

import com.example.generics.services.PrintService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class GenericsApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Colocar o <> para sinalizar que está instanciando um tipo generico
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println();
        System.out.println("Firts: " + ps.firts());

        sc.close();
    }

}

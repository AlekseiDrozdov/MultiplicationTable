/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aleshadoto
 */
public class MultiplicationTable {

public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
   
    public static void main(String[] args) {
        int CorrectAnswers = 0;
        for (int num=0; num<5; num++){
            Random random = new Random();
            int num1=random.nextInt(9)+1;
            int num2=random.nextInt(9)+1;
            System.out.println(num1+"*"+num2+"=");
            Scanner scanner = new Scanner(System.in);
            int solution = scanner.nextInt();
            if (solution == num1*num2){
                System.out.println(ANSI_GREEN + "Правильно!" + ANSI_RESET);
                CorrectAnswers++;
            }
            else{
                System.out.println(ANSI_RED + "Неправильно! Ответ: "+num1*num2 + ANSI_RESET);
            }
        }
        
        switch (CorrectAnswers) {
            case 5:
                System.out.println(CorrectAnswers);
                System.out.println("Молодец!");
                break;
            case 4: case 3:
                System.out.println(CorrectAnswers);
                System.out.println("Надо ещё поучить");
                break;
            default:
                System.out.println(CorrectAnswers);
                System.out.println("Срочно нужно учить таблицу умножения");
                break;
        }
    }
}

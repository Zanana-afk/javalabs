package lab2;

import java.util.Scanner;

public class TestPractise2 {
    public static void main(String[] args) {
        //1 задание
        Scanner sc = new Scanner(System.in);
        int[]array = new int[5];
        for(int i = 0; i < 5;i++){
            if(sc.hasNextInt()){
                array[i]=sc.nextInt();
            }
            else{
                array[i] = 0;
            }
        }
        int summ1 = 0;
        int summ2 = 0;
        int summ3 = 0;
        for(int i = 0; i < 5;i++){
            summ1+=array[i];
        }
        int k1 = 0;
        while(k1 < 5){
            summ2 +=array[k1];
            k1++;
        }
        int k2 = 0;
        do{
            summ3 +=array[k2];
            k2++;
        }while(k2 < 5);
        System.out.println(summ1);
        System.out.println(summ2);
        System.out.println(summ3);
        //Задание 2
        Scanner sc1 = new Scanner(System.in);
        String s = sc1.nextLine();
        for(int i=0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        //Задание 3
        double numb = 0;
        for(int i = 1; i < 11; i ++){
            numb += 1. / i;
            System.out.println(numb);
        }
        //Задание 4
        Scanner sc2 = new Scanner(System.in);
        int[]array2 = new int[7];
        for(int i = 0; i < 7;i++){
            if(sc2.hasNextInt()){
                array2[i]=sc2.nextInt();
            }
            else{
                array2[i] = 0;
            }
        }
        System.out.println("До сортировки");
        for(int i = 0; i < 7;i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 7;i++){
            for(int j = 0; j < 7-i-1; j++){
                if(array2[j] > array2[j+1]){
                    int tmp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = tmp;
                }
            }
        }
        System.out.println("после сортировки");
        for(int i = 0; i < 7;i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        //Задание 5
        Practise2 numb1 = new Practise2(6);
        System.out.println(numb1.getFact());
    }
}

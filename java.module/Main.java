import java.util.Scanner;
import java.util.Random;

public class Main{
 public static void main(String[] args){
  System.out.println("Подумай о числах от 1 до 100.");  
  System.out.println("Если готов, то напиши свое чсило И нажми ENTER");
  Scanner scanner = new Scanner(System.in);
  //ignore the yes  
  scanner.nextLine();
  int min = 1;
  int max = 100;
  int guesses = 0;  
  boolean done = false;
  while(!done){
   int guess = min + (int)(Math.random() * (max - min + 1));   
   guesses++;

   //-------------проект Нияза
   
   System.out.println("Мой ответ: " + guess);
   System.out.println("Напиши  yes если я угадал.");   
   System.out.println("Напиши more если твое число больше " + guess + ".");
   System.out.println("Напиши less если твое число меньше " + guess + ".");   
   System.out.println("Нажми Enter.");
   
   String answer = scanner.nextLine();
   
   if(answer.equals("less")){
    max = guess - 1;   }
   else if(answer.equals("more")){    
   min = guess + 1;
   }   
   else{
    System.out.println("Ураа!");    
    System.out.println("Я угадал за " + guesses + " шагов. Спасибо за игру!");
    done = true;   
    }
  }  
  scanner.close();
 }
 }
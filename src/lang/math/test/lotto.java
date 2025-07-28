package lang.math.test;

import java.util.Random;

public class lotto {
  public static void main(String[] args) {
    Random random = new Random();
    int[] lotto = new int[6];
    int index = 0;

    String str = "로또 번호:";

    while(true){
       int random_number = random.nextInt(45) + 1; // 1~45


       for(int i=0; i<lotto.length; i++){
         if(lotto[i] == random_number) {
           break;
         } else if(i==5) {
           lotto[index] = random_number;
           index = index + 1;
         }
       }

       if(index == 6){
         break;
       }

    }

    for(int i=0; i<lotto.length; i++){
      str+=" "+lotto[i];
    }

    System.out.println(str);

  }
}

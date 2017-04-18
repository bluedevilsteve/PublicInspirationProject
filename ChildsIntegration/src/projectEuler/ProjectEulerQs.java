package projectEuler;

import java.util.Scanner;

public class ProjectEulerQs{
  public static void main(String[] args) { // this is a header
    int which;
    Scanner choice = new Scanner(System.in);
    which = choice.nextInt();
    
    switch(which){
      case 1: 
        eulerMultOf3and5.getSumsOfFivesAndThrees();
        break;
      case 2: evenFnumbers.addEvens();
      break;
      case 3:
    }
      
  }
//

}
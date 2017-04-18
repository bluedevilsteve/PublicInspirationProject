import java.util.Scanner;

public class ABlankOne {

  public static void doingAblankone() {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];
    for (int i = 0; i < numScores; i++) {
      testScores[i] = scan.nextInt();
    }
    scan.close();

    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate());
  }

}

class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  // Constructor
  Person(String firstName, String lastName, int identification) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }

  // Print person data
  public void printPerson() {
    System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
  }

}

class Student extends Person {
  private int[] testScores;

  /*
   * Class Constructor
   * 
   * @param firstName - A string denoting the Person's first name.
   * 
   * @param lastName - A string denoting the Person's last name.
   * 
   * @param id - An integer denoting the Person's ID number.
   * 
   * @param scores - An array of integers denoting the Person's test scores.
   */
  public Student(String fn, String ln, int id, int[] scores) {
    super(fn, ln, id);
    testScores = scores;

  }

  /*
   * Method Name: calculate
   * 
   * @return A character denoting the grade.
   */
  public char calculate() {
    double sum = 0;
    for (int score : testScores) {
      sum += score;
    }
    double point = sum / testScores.length;
    char grade = 'i';
    if (point >= 90) {
      grade = 'O';
    } else if (point >= 80 && point < 90) {
      grade = 'E';
    } else if (point >= 70 && point < 80) {
      grade = 'A';
    } else if (point >= 55 && point < 70) {
      grade = 'P';
    } else if (point >= 40 && point < 55) {
      grade = 'D';
    } else {
      grade = 'T';
    }
    return grade;
  }
}
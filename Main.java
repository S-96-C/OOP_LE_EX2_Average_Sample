import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No1 = ");
    double no1 = sc.nextDouble();

    System.out.println("Enter No2 = ");
    double no2 = sc.nextDouble();

    double avg = (no1 + no2 )/2.0;

    System.out.println("Average is = " + avg);

  }
}
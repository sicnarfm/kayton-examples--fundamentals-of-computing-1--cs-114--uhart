import java.util.Scanner;

public class DoWhileExample {
  public static void main(String[] args) {
    int total = 0;
    int inputFromUserAsAnInteger = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Let’s add up the *positive* value of each number you enter. (Enter -1 to quit.)");

    do {
      try {
        inputFromUserAsAnInteger = input.nextInt();
      } catch(java.util.InputMismatchException e) {
        System.out.println("Input was not an integer or is out of range: " + e);
      } catch(java.util.NoSuchElementException e) {
        System.out.println("Element being requested does not exist: " + e);
      } catch(java.lang.IllegalStateException e) {
        System.out.println("Scanner was closed prematurely: " + e);
      }

      if(inputFromUserAsAnInteger < -1) {
        System.out.println("Only positive numbers allowed. Please try again…");

        continue;
      }

      if(inputFromUserAsAnInteger == -1) {
        continue; // Skip the addition below
      }

      total += inputFromUserAsAnInteger;
      System.out.println("Total thus far is " + total);
    } while(-1 != inputFromUserAsAnInteger);

    input.close();
  }
}

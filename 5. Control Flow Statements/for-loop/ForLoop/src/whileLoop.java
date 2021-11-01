public class whileLoop {
  public static void main(String[] args) {
    // int count = 0;

    // while (count != 5) {
    // System.out.println("Count value is " + count);
    // count++;
    // }

    // do-while loop runs at least once
    // do {
    // System.out.println("Count is " + count);
    // count++;
    // } while (count != 6);

    int number = 4;
    int finishedNumber = 20;
    int sum = 0;
    int evenNumbersFound = 0;

    while (number <= finishedNumber) {
      number++;

      if (!isEvenNumber(number)) {
        continue;
      }
      sum += number;
      System.out.println("Even Number is " + number);
      evenNumbersFound++;

      if (evenNumbersFound >= 5) {
        break;
      }
    }
    System.out.println("Total of the 5 even numbers are: " + sum);
  }

  // challenge
  public static boolean isEvenNumber(int number) {
    if ((number % 2) == 0) {
      return true;
    }
    return false;
  }
}

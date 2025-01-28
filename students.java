import java.util.Scanner;

public class students {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);

    System.out.println("Class Register");
    System.out.print("Enter the number of students: ");
    int students = a.nextInt();
    System.out.println();

    String[] names = new String[students];
    System.out.println("Enter student names: ");

    for (int i = 0; i < students; i++) {
      System.out.print("Student " + (i + 1) + ": ");
      String name = b.nextLine();
      names[i] = name;
    }

    System.out.println();

    System.out.println("Class List: ");
    int d = 1;
    for (String c : names) {
      System.out.println("Student "+ d + ": "+ c);
      d++;
    }
    a.close();
    b.close();
  }
}

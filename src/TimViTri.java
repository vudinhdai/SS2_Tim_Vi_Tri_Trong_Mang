import java.util.Scanner;
    public class TimViTri {
        public static void main(String[] args) {
            String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter students:");
            String input_name = scanner.nextLine();
            boolean isExist = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input_name)) {
                    System.out.println("vi tri student of list : " + input_name + " is: " + (i + 1));
                    isExist = true;
                    break;
                }
            }
            if (!isExist)
                System.out.println("Not found" + input_name + " in the list.");

        }

    }



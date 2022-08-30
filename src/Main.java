import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kundor kundor=Kundor.valueOf(scanner.nextLine());
            switch (kundor) {
                case MONDAY -> System.out.println(Kundor.MONDAY + " куну жава окуйм");
                case TUESDAY -> System.out.println(Kundor.TUESDAY + " куну англис тил окуйм");
                case WEDNESDAY -> System.out.println(Kundor.WEDNESDAY + " куну жава окуйм");
                case THUSDAY -> System.out.println(Kundor.THUSDAY + " куну англис тил окуйм");
                case FRIDAY -> System.out.println(Kundor.FRIDAY + " куну жумушка барам");
                case SATURDAY -> System.out.println(Kundor.SATURDAY + " куну сабакка барам");
                case SUNDAY -> System.out.println(Kundor.SUNDAY + " куну сабакка барам");
            }
        }

    }


// Write a Program to print alphabets A,B,C,D,E,F,G,H using patterns programming logic.
class alpabet_pattern {
    public void print_A(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 && j > 0 && j < ((number - 1) / 2) || j == 0 && i > 0
                        || i == ((number - 1) / 2) && j <= ((number - 1) / 2) || j == (number - 1) / 2 && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print_B(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 && j > 0 && j < ((number - 1) / 2) || j == 0
                        || i == (number - 1) / 2 && j <= (number - 1) / 2 || i == (number - 1) && j < ((number - 1) / 2)
                        || j == (number - 1) / 2 && i != 0 && i != (number - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print_C(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 && j > 0 && j < (number - 1) / 2 || j == 0 && i > 0 && i < (number - 1)
                        || i == 1 && j == (number - 1) / 2 || i == (number - 2) && j == (number - 1) / 2
                        || i == (number - 1) && j > 0 && j < (number - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print_D(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 && j < ((number - 1) / 2) || j == 0 || i == (number - 1) && j < (number - 1) / 2
                        || j == (number - 1) / 2 && i > 0 && i < (number - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print_E(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || j == 0 || i == (number - 1) / 2 || i == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print_F(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || j == 0 || i == (number - 1) / 2 && j != number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print_G(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 && j > 0 && j < (number - 1) / 2
                        || j == 0 && i > 0 && i < (number - 1)
                        || i == 1 && j == (number - 1) / 2
                        || i == (number - 3) && j == (((number - 1) / 2) - 1 )
                        || i == (number - 3) && j == (((number - 1) / 2) )
                        || i == (number - 2) && j == (number - 1) / 2
                        || i == (number - 1) && j > 0 && j < (number - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print_H(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (		j == 0

                        || i == (number - 1)/2
                        || j == (number - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class pattern_letter{
    public static void main(String[] args) {
        alpabet_pattern pltr = new alpabet_pattern();
        System.out.println("print A");
        pltr.print_A(12);
        System.out.println("print B");
        pltr.print_B(13);
        System.out.println("print C");
        pltr.print_C(11);
        System.out.println("print D");
        pltr.print_D(9);
        System.out.println("print E");
        pltr.print_E(7);
        System.out.println("print F");
        pltr.print_F(7);
        System.out.println("print G");
        pltr.print_G(13);
        System.out.println("print H");
        pltr.print_H(11);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        String pervayaCifraStr = string.substring(0, 1);
        int pervayaCifra = Integer.parseInt(pervayaCifraStr);
        if (pervayaCifra == 0){
        System.out.println("Первое число не подходит под условия задания");
        }
        String space = " ";
        String vtorayaCifraStr = string.substring(1, 2);
        if (vtorayaCifraStr.equals(space)) {
            String tretyaCifraStr = string.substring(4, 5);
            int tretyaCifra= Integer.parseInt(tretyaCifraStr);
            int dlinaStroki = string.length();

              if (tretyaCifra == 0 || dlinaStroki > 6) {
                  System.out.println("Выражение не подходит под условия");
              }
              else if(dlinaStroki == 5){
                      String operand = string.substring(2, 3);

                      switch (operand) {
                          case "+":
                              System.out.println(pervayaCifra + tretyaCifra);
                              break;
                          case "-":
                              System.out.println(pervayaCifra - tretyaCifra);
                              break;
                          case "/":
                              System.out.println(pervayaCifra / tretyaCifra);
                              break;
                          case "*":
                              System.out.println(pervayaCifra * tretyaCifra);
                              break;
                      }
                  }
              else {
                  String vtoroeChisloStr = string.substring(4, 6);
                  int vtoroeChislo = Integer.parseInt(vtoroeChisloStr);
                  if (vtoroeChislo <= 10){
                       String operand = string.substring(2, 3);

                      switch (operand) {
                          case "+":
                              System.out.println(pervayaCifra + vtoroeChislo);
                              break;
                          case "-":
                              System.out.println(pervayaCifra - vtoroeChislo);
                              break;
                          case "/":
                              System.out.println(pervayaCifra / vtoroeChislo);
                              break;
                          case "*":
                              System.out.println(pervayaCifra * vtoroeChislo);
                              break;
                      }
                  }
                  else if (vtoroeChislo > 10){
                      System.out.println("Второе число не может учавствовать в выражении");
                  }
              }
              }
        else {
            int dlinaStroki = string.length();
            int vtorayaCifra= Integer.parseInt(vtorayaCifraStr);
            String tretyaCifraStr = string.substring(5, 6);
            int tretyaCifra= Integer.parseInt(tretyaCifraStr);
            String pervoeChisloStr = string.substring(0, 2);
            int pervoeChislo = Integer.parseInt(pervoeChisloStr);
            if (pervoeChislo > 10 || pervoeChislo == 0) {
                System.out.println("Первое число не может учавствовать в выражении");
            }
            else if(dlinaStroki == 6) {
                String operand = string.substring(3, 4);

                switch (operand) {
                    case "+":
                        System.out.println(pervoeChislo + tretyaCifra);
                        break;
                    case "-":
                        System.out.println(pervoeChislo - tretyaCifra);
                        break;
                    case "/":
                        System.out.println(pervoeChislo / tretyaCifra);
                        break;
                    case "*":
                        System.out.println(pervoeChislo * tretyaCifra);
                        break;
                }
            }
            else {
                String vtoroeChisloStr = string.substring(5, 7);
                int vtoroeChislo = Integer.parseInt(vtoroeChisloStr);
                if (vtoroeChislo <= 10 || vtoroeChislo == 0) {
                    String operand = string.substring(3, 4);

                    switch (operand) {
                        case "+":
                            System.out.println(pervoeChislo + vtoroeChislo);
                            break;
                        case "-":
                            System.out.println(pervoeChislo - vtoroeChislo);
                            break;
                        case "/":
                            System.out.println(pervoeChislo / vtoroeChislo);
                            break;
                        case "*":
                            System.out.println(pervoeChislo * vtoroeChislo);
                            break;
                    }
                }
                else {
                    System.out.println("Второе число не может учавствовать в выражении");
                }
            }
        }
    }
}









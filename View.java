import java.util.Scanner;

public class View {
    static void clickButton() {
        System.out.println("Select calc: 1 - double; 2 - int; 3 - complex*Пока нет* 3 - exit");
        Scanner scanner = new Scanner(System.in);
        int calc = scanner.nextInt();
        switch (calc) {
            case 1:
                CalcDouble.calc(CalcDouble.getNumber(), CalcDouble.getOperation(), CalcDouble.getNumber());
                break;
            case 2:
                CalcInt.calc(CalcInt.getNumber(), CalcInt.getOperation(), CalcInt.getNumber());
                break;
            // case 3:
            // .......
            default:
                break;
        }
        scanner.close();

    }

}
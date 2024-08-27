import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("________________________|               HELLO WORLD               |________________________\n" +
                    " 1 - Cadastrar Cliente | 2 - Consultar Cadastro | 3 - Consultar IMC | 4 - Equipe | 0 - Sair");

            menu = input.nextInt();

            switch (menu) {
                case 1:
                    break;

            }


        } while(menu != 0);
    }
}
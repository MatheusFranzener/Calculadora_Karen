import java.util.Scanner;

// Apresente um menu para escolher o calculo a ser
// realizado ( soma, multiplicacao, divisao, subtracao, potenciacao, porcentagem e raiz quadrada)
// Possibilite informar a quantidade de numeros a serem inseridos
// Solicite a quantidade de numeros infromada pelo usuario ( minino 1, maximo 5)
// Realize e apresente o resultado do calculo

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        menuOperacoes();
    }

    public static void menuOperacoes(){
        System.out.println(
                "Escola o cálculo: \n1- Soma \n2- Multiplicação \n3- Divisão \n4- Subtração \n5- Potenciação \n6- Porcentagem \n7- Raíz Quadrada: ");
        int opcao = sc.nextInt();

        if (opcao < 1 || opcao > 7) {
            System.out.println("Opcao inválida");
            menuOperacoes();
        } else {
            informarNumeros(opcao);
        }
    }

    public static void informarNumeros(int opcao){
        double num1 = 0, num2 = 0;
        int qnt = 0;

        if(opcao == 1 || opcao == 2 || opcao == 4){
            System.out.println("Informe a quantidade de números 1 - 5: ");
            qnt = sc.nextInt();

            if(qnt < 1 || qnt > 5){
                System.out.println("Número inválidos!");
                informarNumeros(opcao);
            }
        } else {
            System.out.println("Informe o primeiro número: ");
            num1 = sc.nextDouble();
            System.out.println("Informe o segundo número: ");
            num2 = sc.nextDouble();
        }

        switch(opcao){
            case 1:
                for(int i = 0; i < qnt; i++){
                    System.out.println("Informe o número: ");
                    calculadora.somar(sc.nextDouble());
                }
                break;
            case 2:
                for(int i = 0; i < qnt; i++){
                    System.out.println("Informe o número: ");
                    calculadora.multiplicar(sc.nextDouble());
                }
                break;
            case 3:
                calculadora.divisao(num1,num2);
                break;
            case 4:
                for(int i = 0; i < qnt; i++){
                    System.out.println("Informe o número: ");
                    calculadora.subtrair(sc.nextDouble());
                }
                break;
            case 5:
                calculadora.potenciacao(num1, num2);
                break;
            case 6:
                calculadora.porcentagem();
                break;
            case 7:
                calculadora.divisao(num1,num2);
                break;
        }

        System.out.println("Resultado: " + calculadora.getResultado());
        calculadora.resetar();
        menuOperacoes();
    }
}

public class Calculadora {
    private double resultado = 0;

    public double getResultado() {
        return resultado;
    }

    public void somar(double numero){
        this.resultado += numero;
    }

    public void subtrair(double num1, double num2){
        this.resultado = num1 - num2;
    }

    public void multiplicar(double numero){
        this.resultado *=numero;
    }

    public void divisao(double num1, double num2){
        this.resultado = num1/num2;
    }

    public void porcentagem(double num1, double num2){
        this.resultado = num1 * (num2/100);
    }

    public void potenciacao(double num1, double num2){
        this.resultado = Math.pow(num1, num2);
    }

    public void raiz(double num1){
        this.resultado = Math.sqrt(num1);
    }

    public void resetar(){
        this.resultado = 0;
    }
}

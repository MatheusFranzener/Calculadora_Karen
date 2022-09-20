public class Calculadora {
    private double resultado = 0;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void somar(double numero){
        this.resultado += numero;
    }

    public void multiplicar(double numero){
        this.resultado *=numero;
    }

    public void subtrair(double numero){
        this.resultado -= numero;
    }

    public void divisao(double num1, double num2){
        this.resultado = num1/num2;
    }

    public void porcentagem(){}

    public void potenciacao(double num1, double num2){}

    public void resetar(){
        this.resultado = 0;
    }
}

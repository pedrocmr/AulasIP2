public class Conta {

    private String numeroConta;
    private double saldo;

    Conta(){
        numeroConta = "000-0";
        saldo = 0.0;

    }
    Conta(String numeroInicial, double saldoInicial){

    }



    public String getNumeroConta() {

        return numeroConta;
    }

    public double getSaldo() {

        return saldo;
    }
}

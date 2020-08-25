public class TesteAutomovel {

    public static void main(String[] args) {
        Automovel carro = new Automovel();

        carro.nomeCarro = "Gol";
        carro.ligar();
        carro.acelerar();

        System.out.println(carro.status);
        System.out.println(carro.Velocidade);
        System.out.println(carro.nomeCarro);



    }
}

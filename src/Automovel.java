public class Automovel {

    boolean status;
    String nomeCarro;
    int Velocidade;

    Automovel(){
        status = false;
        nomeCarro = "Ka";
        Velocidade = 0;


    }
    void ligar(){
        status = true;

    }


    void acelerar(){
        Velocidade = Velocidade + 5;

    }

    void frear(){
        Velocidade = Velocidade - 5;
    }

}

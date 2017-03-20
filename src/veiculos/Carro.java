package veiculos;

public class Carro {
    int velocidade;
    int ano;
    boolean motor;
    boolean arCondicionado;

    public Carro() {
        velocidade = 0;
        ano = 0;
        motor = false;
    }

    void ligar() {
        motor = true;
    }

    void desligarMotor() {
        if (velocidade > 0) {
            return;
        }
        motor = false;
        desligarAr();
    }

    void acelerar() {
        if (!motor) {
            return;
        }
        if (velocidade < 160) {
            velocidade += 10;
        }
    }

    void frear() {
        if (velocidade == 0) {
            return;
        }
        velocidade -= 10;
    }
    
    
    void ligarAr(){
        if(motor){
            arCondicionado = true;
        }
    }
    
    void desligarAr(){
        arCondicionado = false;
    }
    
    
    

}

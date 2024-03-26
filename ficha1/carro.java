package POO.ficha1;

public class carro {
    private String marca;
    private String modelo;
    private int anoFa;
    private int velS;
    
    public carro(String marca, String modelo, int anoFa, int veloString) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFa = anoFa;
        this.velS = 0;
    }

    public void acelerar(int vel){
        if(vel > 0) velS += vel;
    }
    
    public void desacelerar(int vel){
        if(vel > 0 && velS - vel >= 0) velS -= vel;
        else velS = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFa() {
        return anoFa;
    }

    public int getVelS() {
        return velS;
    }

    
}

package Terrestres;

import Animales.*;

class Terrestres extends Animales {

    protected String tipoDeRespiracion;
    protected boolean tienePatas;

    public Terrestres(String sistemaDigestivo, String tiempoDeVida,String tipoDeRespiracion,boolean tienePatas){
	super(sistemaDigestivo, tiempoDeVida);
    }

    public void reproducirse(){
        System.out.println("Animal terrestre se está reproduciendo");
    }

    public void respirar(){

    }
}

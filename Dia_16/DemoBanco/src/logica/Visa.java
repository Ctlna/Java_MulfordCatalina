package com.local.logica;

public class Visa extends Tarjeta {
    public Visa(String numeroDeCuenta,double valorApertura,String mes){
        super(numeroDeCuenta,valorApertura,mes);       
    }

    public double cuotaDeManejo(){
        return 50000-Descuento.DIAMANTE.getValorDescontado(getValorApertura());
    }
}

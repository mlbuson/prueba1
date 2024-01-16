package com.example.demo.Prueba;;

public interface OperacionService {

    public boolean esTarjetaValida(TarjetaCredito tarjeta);
    public boolean esOperacionValida(double importe);
    public boolean sonTarjetasDistintas(TarjetaCredito tarjeta1, TarjetaCredito tarjeta2);
    public double obtenerTasa(String marca, double importe) throws Exception;

}

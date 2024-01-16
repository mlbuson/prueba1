package com.example.demo.Prueba;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

// Clase Prueba.OperacionService que realiza operaciones con tarjetas
@Service
public class OperacionServiceImpl implements OperacionService {
    @Override
    public boolean esOperacionValida(double importe) {
        return importe < 1000;
    }

    @Override
    public boolean esTarjetaValida(TarjetaCredito tarjeta) {
        return tarjeta.getFechaVencimiento().isAfter(LocalDate.now());
    }

    @Override
    public boolean sonTarjetasDistintas(TarjetaCredito tarjeta1, TarjetaCredito tarjeta2) {
        return !tarjeta1.getNumero().equals(tarjeta2.getNumero());
    }

    @Override
    public double obtenerTasa(String marca, double importe) throws Exception {
        switch (marca) {
            case "VISA":
                return LocalDate.now().getYear() / (double) LocalDate.now().getMonthValue();
            case "NARA":
                return LocalDate.now().getDayOfMonth() * 0.5;
            case "AMEX":
                return LocalDate.now().getMonthValue() * 0.1;
            default:
                throw new Exception("Marca de tarjeta no válida");
        }
    }
}

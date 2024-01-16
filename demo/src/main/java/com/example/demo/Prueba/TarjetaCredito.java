package com.example.demo.Prueba;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


// Clase TarjetaCredito que representa una tarjeta de crédito
@Component
public class TarjetaCredito {
    private String marca;
    private String numero;
    private String cardholder;
    private LocalDate fechaVencimiento;

    // Constructor, getters y setters


    public TarjetaCredito(String marca, String numero, String cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numero = numero;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }
    public TarjetaCredito () {}


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // Método para calcular la tasa
    public double calcularTasa() {
        switch (marca) {
            case "VISA":
                return LocalDate.now().getYear() / (double) LocalDate.now().getMonthValue();
            case "NARA":
                return LocalDate.now().getDayOfMonth() * 0.5;
            case "AMEX":
                return LocalDate.now().getMonthValue() * 0.1;
            default:
                return 0.0;
        }
    }
}
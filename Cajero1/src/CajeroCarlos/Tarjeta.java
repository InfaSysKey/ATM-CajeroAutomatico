/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroCarlos;

/**
 *
 * @author InfaSysKey Carlos del Cura Pascual
 * @version 1.0
 *
 */
public class Tarjeta {

    //atributos
    private int idTarjeta;
    private int idCuenta;
    private int pin;
    private int tarjeta_bloqueo;

    //geters y setters
    public int getTarjeta_bloqueo() {
        return tarjeta_bloqueo;
    }

    public void setTarjeta_bloqueo(int tarjeta_bloqueo) {
        this.tarjeta_bloqueo = tarjeta_bloqueo;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}

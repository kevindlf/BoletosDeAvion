package interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author USUARIO
 */
public class Pasajero {
    private String nombre;
    private String apellido;
    private java.sql.Date fechaNacimiento;
    private String ticket;

    public Pasajero(String nombre, String apellido, java.sql.Date fechaNacimiento, String ticket) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ticket = ticket;
    }

    // Getters y Setters
}

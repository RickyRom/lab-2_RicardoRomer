/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_ricardoromero;

/**
 *
 * @author ricky
 */
public class Usuario {

    private String username;
    private String nombre;
    private int edad;
    private String L_D_N;
    private String pass;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String username, String nombre, int age, String lu_de_nasc, String Pass) {
        this.nombre = nombre;
        this.edad = age;
        this.L_D_N = lu_de_nasc;
        this.username = username;
        this.pass = Pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setNombre(String name) {
        nombre = name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int age) {
        edad = age;
    }

    public int getEdad() {
        return edad;
    }

    public void setLDN(String lu_de_nasc) {
        L_D_N = lu_de_nasc;
    }

    public String getLDN() {
        return L_D_N;
    }
    
    public void setPass(String passw) {
        pass = passw;
    }
    
    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

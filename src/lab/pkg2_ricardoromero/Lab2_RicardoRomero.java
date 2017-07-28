/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_ricardoromero;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class Lab2_RicardoRomero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        String op = "";
        while (!op.equals("f")) {
            op = JOptionPane.showInputDialog(""
                    + "a-Agregar Usuario\n"
                    + "b-Modificar Usuario\n"
                    + "c-listar usuario\n"
                    + "d-Eliminar Usuario\n"
                    + "e-Log-in\n"
                    + "f-salir");
            if (op.equals("a")) {
                String userN;
                String name;
                int age;
                String lu_de_nasc;
                String Pass;
                name = JOptionPane.showInputDialog("Nombre");

                age = Integer.parseInt(
                        JOptionPane.showInputDialog("Edad")
                );
                lu_de_nasc = JOptionPane.showInputDialog("Lugar de Nascimiento");
                userN = JOptionPane.showInputDialog("Username");

                Pass = JOptionPane.showInputDialog("Password");
                lista.add(new Usuario(userN, name, age, lu_de_nasc, Pass));

            }

            if (op.equals("b")) {
                int i;
                String n;
                String un;
                int e;
                String l_d_n;
                String passw;
                i = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "pocision a modificar")
                );
                n = JOptionPane.showInputDialog("nuevo nombre");
                e = Integer.parseInt(
                        JOptionPane.showInputDialog("Edad")
                );
                l_d_n = JOptionPane.showInputDialog("Lugar de Nascimiento");
                un = JOptionPane.showInputDialog("Username");

                passw = JOptionPane.showInputDialog("Password");
                ((Usuario) lista.get(i)).setNombre(n);
                ((Usuario) lista.get(i)).setEdad(e);
            }
            if (op.equals("c")) {
                String s = "";
                for (Object t : lista) {
                    if (t instanceof Usuario) {
                        s += "" + lista.indexOf(t) + "- " + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, s);
            }

            if (op.equals("d")) {
                int i;

                i = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "pocision a eliminar")
                );

                lista.remove(i);
            }

            if (op.equals("e")) {
                String name, Pword;
                boolean es = false;

                do {
                    name = JOptionPane.showInputDialog("Ingrese su nombre");
                    Pword = JOptionPane.showInputDialog("Ingrese su contraseña");
                    for (Object o : lista) {
                        if (o instanceof Usuario) {
                            if (((Usuario) o).getUsername().equals(name) && ((Usuario) o).getPass().equals(Pword)) {
                                es = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "INGRESE UN USUARIO CORRECTO");
                            }
                        }
                    }
                } while (es == false);
            }
        }
    }
}

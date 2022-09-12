package Tp4;

import java.util.ArrayList;

public class Tp4 {

    public static void main(String[] args) {

Directorio directorio=new Directorio();
// directorio.agregarCliente(123456,new Cliente(123, "Pepito", "Funes", "Cordoba", "Colon 123" ));
// directorio.agregarCliente(789456,new Cliente(456, "Fulanito", "Gomez", "Santa Fe", "San Martin 123" ));
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1(directorio).setVisible(true);
            }
        });
    
   
    }
}

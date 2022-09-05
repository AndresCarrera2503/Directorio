package Tp4;

import java.util.ArrayList;

public class Tp4 {

    public static void main(String[] args) {
//      Directorio directorio = new Directorio();
//      directorio.agregarCliente(123456,new Cliente(123, "Pepito", "Funes", "Cordoba", "Colon 123" ));
//      directorio.agregarCliente(789456,new Cliente(456, "Fulanito", "Gomez", "Santa Fe", "San Martin 123" ));
//      directorio.agregarCliente(321654,new Cliente(789, "Menganito", "Gonzalez", "Mendoza", "General Paz 123" ));
//      directorio.agregarCliente(987654,new Cliente(159, "Lito", "Funes","Jujuy","Lafinur 123" ));
//        System.out.println(directorio.buscarCliente(123456));
//        ArrayList<Cliente> clientes = new ArrayList<>();
//        clientes = directorio.buscarClientes("Cordoba");
//        for (Cliente cliente:clientes){
//            System.out.println("Clientes de Cordoba: " + cliente.getDni()+ "-" + cliente.getNombre() + " " + cliente.getApellido() + "-" + cliente.getCiudad() + "-" + cliente.getDireccion());
//        }
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PersonaABM().setVisible(true);
                new Menu1().setVisible(true);
            }
        });
    
   
    }
}

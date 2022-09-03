package Tp4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Directorio{
  private HashMap<Long, Cliente> mapaCliente = new HashMap<>();

    public Directorio() {
    }
  public void agregarCliente (long tel, Cliente client){
    mapaCliente.put(tel, client);
  }
   public Cliente buscarCliente(long tel){
    return mapaCliente.get(tel);
   } 
   public Set<Long> buscarTelefono(String Apell) {
     Set<Long> telefonos = new HashSet <>();
     Set<Long> claves =mapaCliente.keySet();
     Iterator it = claves.iterator();
     Cliente clie;
     while (it.hasNext()){
         long tell = (Long) it.next();
         clie = mapaCliente.get(tell);
         if (clie.getApellido().equals(Apell)){
             telefonos.add(tell);
             }
           }
         return telefonos;
   }
         
   public ArrayList<Cliente> buscarClientes(String city){
     ArrayList <Cliente> clientes = new ArrayList<>();
     Set<Long> claves = mapaCliente.keySet();
     Iterator it = claves.iterator();
     Cliente clie;
        while(it.hasNext()){
            long tell = (Long)it.next();
            clie = mapaCliente.get(tell);
            if (clie.getCiudad().equals(city)) {
                clientes.add(clie);
            }
          }
    return clientes;    
   }
   public void borrarCliente(int dni){
     Set<Long> claves = mapaCliente.keySet();
     Iterator it = claves.iterator();
     Cliente clie;
     while (it.hasNext()){
         long tell = (Long)it.next();
         clie = mapaCliente.get(tell);
         if (clie.getDni() == (dni)){
             it.remove();
         }
     }
   }
   
}
    
    
    
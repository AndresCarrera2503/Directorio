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
  public boolean agregarCliente (long tel, Cliente cliente){
      
      return mapaCliente.put(tel, cliente) != null;
  }
   public Cliente buscarCliente(long tel){
    return mapaCliente.get(tel);
   } 
   public Set<Long> buscarTelefono(String apellido) {
     Set<Long> telefonos = new HashSet <>();
     Set<Long> claves =mapaCliente.keySet();
     Iterator it = claves.iterator();
     Cliente clie;
     while (it.hasNext()){
         long tell = (Long) it.next();
         clie = mapaCliente.get(tell);
         if (clie.getApellido().equals(apellido)){
             telefonos.add(tell);
             }
           }
         return telefonos;
   }
         
   public ArrayList<Cliente> buscarClientes(String ciudad){
     ArrayList <Cliente> clientes = new ArrayList<>();
     Set<Long> claves = mapaCliente.keySet();
     Iterator it = claves.iterator();
     Cliente clie;
        while(it.hasNext()){
            long tell = (Long)it.next();
            clie = mapaCliente.get(tell);
            if (clie.getCiudad().equals(ciudad)) {
                clientes.add(clie);
            }
          }
    return clientes;    
   }

   public boolean borrarCliente (long tel1){
     return mapaCliente.keySet().removeIf(tel -> tel == tel1);
   }
   
}
    
    
    
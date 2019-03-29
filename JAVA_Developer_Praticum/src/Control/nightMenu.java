/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Guilhardo
 */
public class nightMenu extends menu{
    
    item [] pratos = { new item ("--", -1),
                       new item ("steak", 1),
                       new item ("potato", -1),
                       new item ("wine", 1),
                       new item ("cake", 1)};
    


    public void imprimePedido (int prt, int qtia){
           
        if(prt < pratos.length){
        
            pratos[prt].imprimeItem(qtia);
        
        }
        else{
            
            System.out.print(" error,");
            
        }

 }
    
}

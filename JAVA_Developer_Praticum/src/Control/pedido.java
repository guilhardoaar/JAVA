package Control;

import Control.morningMenu;

//Classe responsável por montar os pedidos

public class pedido {
    
    morningMenu MENU = new morningMenu();
    
    public void montarPedido(String ped){
        
        String[] itens = ped.split(" ");
        
        if(itens[0].equalsIgnoreCase("morning")||itens[0].equalsIgnoreCase("morning,")){
                
                MENU.organizaItens(itens);
                for(int x=1; x<MENU.itns.length; x++){
                
                    MENU.imprimePedido(x, MENU.itns[x]);
                
                }
                         
        }else if(itens[0].equalsIgnoreCase("night")||itens[0].equalsIgnoreCase("night,")){
                
                MENU.organizaItens(itens);
                for(int x=1; x<MENU.itns.length; x++){
                
                    MENU.imprimePedido(x, MENU.itns[x]);
                
                }
                         
        }else{
            
            System.out.println ("classe não encontrada no Menu, digite morning ou night antes do pedido");
            
        }
    }
    
}


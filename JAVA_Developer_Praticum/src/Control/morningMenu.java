package Control;


public class morningMenu extends menu{
    
    
    item [] pratos = { new item ("--", -1),
                       new item ("eggs", 1),
                       new item ("toast", 1),
                       new item ("coffee", -1)};
    


    public void imprimePedido (int prt, int qtia){
           
        if(prt < pratos.length){
        
            pratos[prt].imprimeItem(qtia);
        
        }
        else{
            
            System.out.print(" error,");
            
        }

 }
    
}

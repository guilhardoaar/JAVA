package Control;

//classe responsável por organizar os pedidos para exobir ao usuário

public class menu {
    

    int [] itns = new int[6];
    public void organizaItens(String [] itens){
        
        for (int i=1; i< itens.length; i++){

            if (itens[i].equalsIgnoreCase("1,")||itens[i].equalsIgnoreCase("1")){
                
                itns[1]++;
                
            }
            if (itens[i].equalsIgnoreCase("2,")||itens[i].equalsIgnoreCase("2")){
                
                itns[2]++;
                
            }
            if (itens[i].equalsIgnoreCase("3,")||itens[i].equalsIgnoreCase("3")){
                
                itns[3]++;
                
            }
            if (itens[i].equalsIgnoreCase("4,")||itens[i].equalsIgnoreCase("4")){
                
                itns[4]++;
                
            }
            else{
                
                itns[5]++;
                
            }
            
            
            
        }
        
        
    }
    
}

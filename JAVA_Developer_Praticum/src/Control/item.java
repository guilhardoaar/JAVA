package Control;

//classe utilizada para armazenar as informações de cada item

public class item {
    
    String nome = new String();
    int limite;

    item (String n, int l) {
    
        nome = n;
        limite = l;
    
    }
    
    public void imprimeItem (int qt){
        
        if (limite != 1){
            
            System.out.printf("%s (%d x), ", nome, qt);
        }
        else {
            
            System.out.printf("%s, ", nome);
            
        }
        
    }
    
}

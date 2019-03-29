package Control;

       
import java.util.Scanner;
import Control.pedido;

public class main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        String ficha = new String();
        pedido PEDIDO = new pedido();
        
        System.out.printf("Dishes for each time of day:\n"+
            "|Dish Type\t|Morning\t|Night\t|\n"+
            "|1(entrée)\t|eggs\t|steak\t|\n"+
            "|2(side)\t|toast\t|potato\t|\n"+
            "|3(drink)\t|cofee\t|wine\t|\n"+
            "|4(dessert)\t|****\t|cake\t|\n\n"+
            "|Para sair digite FIM|\n\n");//imprime o menu ao usuário
        
       
        while (ficha.equalsIgnoreCase("fim")== false){
            
            ficha = entrada.nextLine();        
            PEDIDO.montarPedido(ficha);
            
        }
        
    }
    
}

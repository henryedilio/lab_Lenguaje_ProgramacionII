import java.util.Scanner;
public class Machine{

    private int coin;
    private int price;
    private int snack;
    private  int carrito;


public void selectSnack(){




//--------------------------------------------------------------------------------
        //Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("      SnackWell Machine  \n");  

//Seleccion de dulces
//--------------------------------------------------------------------------------  
    	System.out.println("Seleccione dulce: ");
    	System.out.println (" 1 - $25.00 Mas y Mas \n 2- $30.00 Platanitos  \n 3- $35.00 Yuquitas  \n 4- $60.00 M&M's ");
        snack = teclado.nextInt();

//--------------------------------------------------------------------------------
        switch (snack){
            case 1:
                System.out.println("Ha seleccionado mas y mas de $30.00");
                price=25;

                break;

            case 2:
                System.out.println("Ha seleccionado Platanitos de $30.00");
    			price=30;
                break;

            case 3:
                System.out.println("Ha seleccionado Yuquitas $35.00");
                price=35;
                break;

            case 4:
                System.out.println("Ha seleccionado M&M's de $60.00");
                price=60;
                break;

            default:
                System.out.println("Dulce Invalido");
                break;
        }


//Insertar monedas podriamos usar un metodo para la maquina de monedas
//--------------------------------------------------------------------------------
        carrito=price;

        while(price>0 || price<0){
            System.out.print("Inserte moneda ");
            coin = teclado.nextInt();



            if (coin==10){
                price=price-10;

            } else if (coin==25){
                price=price-25; 

            } else {
                System.out.println("Moneda invalida \n ");
            }

//Gracias por su compra o rechazar monedas
//--------------------------------------------------------------------------------
            if (price<0){
                System.out.println("Ha exedido la cantidad favor inserte cantidad exacta \n ");
                    //La maquina devuelve todas las monedas que se insertaron
                price=carrito;
            }
            else if (price==0){
            System.out.println("Gracias por su compra \n "); }

    } //end of while


}//End of method

}//End of class

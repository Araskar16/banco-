/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                double saldo_cliente = 0;
                
                int opcion = 0;
                
               
                    
               
                
              
                    
                
                //Permite leer la entrada por consola
                Scanner entrada = new Scanner (System.in);
                
                do{
                        
                System.out.println("Menu");
                System.out.println("0 Salir");
                System.out.println("1 Consultar");
                System.out.println("2 Depositar");
                System.out.println("3 Retirar");
                
                //Captura la entrada por consola, en este caso 
                //lee un entero:
                opcion = entrada.nextInt();
                
                switch(opcion){
                    case 0:
                        //Salir de la aplicacion
                        System.out.println("Nos vemos>");
                        break;  //Aqui termina el caso 0
                     case 1:
                        //Consultar el saldo
                        System.out.println("Tu saldo es de: " + saldo_cliente);
                        break;  //Aqui termina el caso 1
                     case 2:
                        //Depositar saldo
                        System.out.println("Ingrese la cantidad a depositar:");
                        double deposito = entrada.nextDouble();
                        saldo_cliente = saldo_cliente + deposito ;
                        break;  //Aqui termina el caso 2
                     case 3:
                        //Retirar saldo
                        System.out.println("Ingresa la cantidad a retirar");
                        double retiro = entrada.nextDouble();
                        
                        if(retiro <= saldo_cliente){
                            saldo_cliente = saldo_cliente -retiro;
                        }else{
                            System.out.println("No dispones de saldo suficiente");
                        
                        }
                        break;  //Aqui termina el caso 3    
                     default:
                    //Si la opcion no cumple ninguna
                    //de las condiciones anteriores.
                         break; //Aqui termina default
                         
                }
                
                //Se ejecuta el do, hasta que la opcion sea 0
                
                }while(opcion != 0);
                
                //Se cierra
                
               
    }
    
}

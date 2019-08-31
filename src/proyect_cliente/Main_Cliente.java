/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect_cliente;
import java.io.IOException;
/**
 *
 * @author USER


/**
 *
 * @author Hawer Forero
 */
public class Main_Cliente {
    
    public static void main(String[] args) throws IOException
    {
        Cliente cli = new Cliente(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
    
}
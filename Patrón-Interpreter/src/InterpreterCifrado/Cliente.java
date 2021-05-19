/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterpreterCifrado;

/**
 *
 * @author ASUS PC
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Context contexto = new Context("DCH");
        System.out.println("Texto de entrada: " + contexto.textoEntrada);
        
        Interpreter tipoCifrado = new TextToBase64();
        tipoCifrado.interpreter(contexto);
        System.out.println("Texto de salida: " + contexto.textoSalida);
    }
}

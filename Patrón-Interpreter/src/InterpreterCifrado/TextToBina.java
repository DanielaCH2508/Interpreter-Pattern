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
public class TextToBina implements Interpreter {

    @Override
    public void interpreter(Context contexto) {

        for (char Caracter : contexto.textoEntrada.toCharArray()) {
            contexto.textoSalida
                    += String.format("%10s", Integer.toBinaryString(Caracter));
        }
    }
}

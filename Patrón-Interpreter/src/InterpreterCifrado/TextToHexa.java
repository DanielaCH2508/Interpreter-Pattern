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
public class TextToHexa implements Interpreter {

    @Override
    public void interpreter(Context context) {

        for (char caracter : context.textoEntrada.toCharArray()) {
            context.textoSalida += Integer.toHexString(caracter);
        }
    }
}

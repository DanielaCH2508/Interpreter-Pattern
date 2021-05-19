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
public class TextToASCII implements Interpreter {

    @Override
    public void interpreter(Context contexto) {

        for (int i = 0; i < contexto.textoEntrada.length(); i++) {
            contexto.textoSalida += contexto.textoEntrada.codePointAt(i);
        }
    }
}

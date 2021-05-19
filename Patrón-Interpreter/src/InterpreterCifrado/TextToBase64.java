/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterpreterCifrado;

import java.util.Base64;

/**
 *
 * @author ASUS PC
 */
public class TextToBase64 implements Interpreter {

    @Override
    public void interpreter(Context contexto) {
        contexto.textoSalida
                = Base64.getEncoder().encodeToString(contexto.textoEntrada.getBytes());
    }
}

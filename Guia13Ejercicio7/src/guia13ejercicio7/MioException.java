/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio7;

/**
 *
 * @author Flia-Santillan
 */
class MioException extends Exception{
  
    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public MioException() {
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MioException(String msg) {
        super(msg);
    }
}
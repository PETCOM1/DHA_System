/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo.errors;

/**
 *
 * @author Munzhedzi Munyadzia Petrus 
 */
public class InvalidID extends RuntimeException{

    public InvalidID(String message) {
        super(message);
    }   
}

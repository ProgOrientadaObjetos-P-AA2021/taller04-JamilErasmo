package service;

import entity.Cheque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bitxanax
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        Cheque cheque = new Cheque("Jamil", "Banco de Loja", 28500);
        cheque.calcularComisionBanco();
        
        System.out.println(cheque + "\n");
    }

}

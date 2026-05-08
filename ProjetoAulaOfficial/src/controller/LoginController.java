/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author alunocmc
 */
public class LoginController {
    
    public static boolean checkLogin(String login, String senha){
    
        return login.equals("admin") && senha.equals("admin");
    
    }
    
    
}

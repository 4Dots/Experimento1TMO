/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourDots.TMO.beans;

import fourDots.TMO.Services.FacebookServices;

/**
 *
 * @author estudiante
 */
public class LoginManagedBean
{
    
    //-------------------------------------------------
    // Atributos
    //-------------------------------------------------

    private String username;
    
    private String password;
    
    private FacebookServices fbs;
    /**
     * Creates a new instance of LoginManagedBean
     */
    public LoginManagedBean()
    {
        
    }
    
    public void createInstances()
    {
        fbs = FacebookServices.getInstance();
        System.out.println("HUEHUEHUEHUE");
    }
    
}

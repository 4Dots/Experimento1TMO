/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourDots.TMO.Services;

import facebook4j.*;
import facebook4j.auth.AccessToken;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author estudiante
 */
public class FacebookServices
{
    
    private static FacebookServices fbsSingleton;
    
    private Facebook fb;
    private AccessToken OAuthUserToken;
    private Object [] userLikes;
    
    private static String APP_ID = "348405295336411";
    private static String APP_SECRET = "f3dc80a87498a9c645b286018756491d";
    
    private FacebookServices()
    {
        fb = new FacebookFactory().getInstance();
        
        fb.setOAuthAppId(APP_ID, APP_SECRET);
        OAuthUserToken = fb.getOAuthAccessToken();
        System.out.println(OAuthUserToken.toString());
    }
    
    public static FacebookServices getInstance()
    {
        if (fbsSingleton == null)
        {
            fbsSingleton = new FacebookServices();
            return fbsSingleton;
        }
        
        else
        {
            return fbsSingleton;
        }
    }
    
    public Object [] retrieveLikes()
    {
        try
        {
            userLikes = fb.getUserLikes().toArray();
            
        }
        catch (FacebookException ex)
        {
            Logger.getLogger(FacebookServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}


package Modelo;

import byrn.BYRN;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 *
 * @author CST-UTJ
 */
public class UsuariosDAO {
    
     private User[] use;

    public User[] getUse() {
        return use;
    }

    public void setUse(User[] use) {
        this.use = use;
    }
     
     
     

     
    public UsuariosDAO() {
      
        
        
        
        
    }
     
     public void obtener() throws UnirestException{
         HttpResponse aux = PeticionHTTP.get("/users", BYRN.getAuth().getToken());
         use = BYRN.gson.fromJson(aux.getBody().toString(), User[].class);
     }
    
    
    
    
    
    
}

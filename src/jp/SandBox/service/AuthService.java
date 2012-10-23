package jp.SandBox.service;

import java.util.List;
import java.util.Map;
import org.slim3.datastore.Datastore;
import jp.SandBox.meta.UsersMeta;
import jp.SandBox.model.Users;

public class AuthService {
    SessionManagementService service = new SessionManagementService();
    public boolean isAuth(Map<String, Object> input){
           UsersMeta e = UsersMeta.get();
           List<Users> users = Datastore.query(e).filter(e.id.equal((String)input.get("id")))
                                                   .filter(e.password.equal((String)input.get("password")))
                                                   .asList();
           return isUserExists(users);
    }

    private boolean isUserExists(List<Users> users){
        if(users.size() == 1){
            service.setUserId(users.get(0).getId());
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isLogin(){
        return !service.getUserId().equals("")? true : false;
    }
}

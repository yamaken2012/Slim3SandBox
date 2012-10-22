package jp.SandBox.service;

import java.util.List;
import java.util.Map;

import jp.SandBox.meta.UsersMeta;
import jp.SandBox.model.Users;
import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;
import com.google.appengine.api.datastore.Transaction;

public class RegisterService {
    
    public Users regUser(Map<String, Object> input) {
        Users users = new Users();
        BeanUtil.copy(input, users);
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(users);
        tx.commit();
        return users;
    }

     public boolean isUserExists(Map<String, Object> input){
         UsersMeta e = UsersMeta.get();
         List<Users> users = Datastore.query(e).filter(e.id.equal((String)input.get("id"))).asList();
         return users.size()==1 ? true : false;
     }
}

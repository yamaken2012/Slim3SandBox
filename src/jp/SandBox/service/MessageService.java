package jp.SandBox.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jp.SandBox.meta.MessageMeta;
import jp.SandBox.model.Message;
import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Transaction;

public class MessageService {
    MessageMeta e = MessageMeta.get();
    
    public List<Message> getMessageList(){
        List<Message> messages = Datastore.query(e).sort(e.createDate.desc).asList();
        return messages;
    }
    
    public List<Key> StringListToKeyList(List<String> strKeys) {
        List<Key> keys = new ArrayList<Key>();
        for(String key : strKeys) keys.add(KeyFactory.stringToKey(key));
        return keys;
    }
    
    public void insert(Map<String, Object> input) {
        Message message = new Message();
        BeanUtil.copy(input, message);
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(tx, message);
        tx.commit();
    }
    
    public void update(List<String> strKeys, List<String> messages) {
        List<Key> keys = StringListToKeyList(strKeys);
        List<Message> message = Datastore.get(Message.class, keys);
        Integer i = 0;
        for (Message msg : message) {
            Transaction tx = Datastore.beginTransaction();
            msg.setMessage(messages.get(i++));
            Datastore.put(msg);
            tx.commit();
        }
    }

    public void delete(List<String> strKeys) {
        List<Key> keys = StringListToKeyList(strKeys);
        for(Key key : keys){
            Transaction tx = Datastore.beginTransaction();
            Datastore.delete(tx, key);
            tx.commit();
        }
    }

}
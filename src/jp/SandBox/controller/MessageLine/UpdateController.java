package jp.SandBox.controller.MessageLine;

import java.util.ArrayList;
import java.util.List;

import jp.SandBox.service.AuthService;
import jp.SandBox.service.MessageService;
import jp.SandBox.service.SessionManagementService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class UpdateController extends Controller {
    MessageService messageService = new MessageService();
    SessionManagementService session = new SessionManagementService();
    AuthService authService = new AuthService();
    
    @Override
    public Navigation run() throws Exception {
        if(!authService.isLogin()){
            return redirect("/Login/");
        }
    
        String[] checks = (String[]) request.getAttribute("checkBoxArray");
        if(!isSelectedItem(checks)){
            return redirect(basePath);
        }
        
        List<String>reqStrKeys = new ArrayList<String>();
        List<String>reqMessages = new ArrayList<String>();
        
        reqStrKeys = java.util.Arrays.asList((String[]) request.getAttribute("keyArray"));
        reqMessages = java.util.Arrays.asList((String[]) request.getAttribute("messageArray"));
        
        List<String>strKeys = new ArrayList<String>();
        List<String>messages = new ArrayList<String>();
        
        for(String check : checks){
            Integer index = reqStrKeys.indexOf(check);
            if(index!=-1){
                strKeys.add(reqStrKeys.get(index));
                messages.add(reqMessages.get(index));
            }
        }
        messageService.update(strKeys, messages, session.getUserId());
        return redirect(basePath);
    }

    private boolean isSelectedItem(String[] checks) {
        return checks!=null? true : false;
    }
}

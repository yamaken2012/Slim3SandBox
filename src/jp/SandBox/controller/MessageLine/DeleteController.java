package jp.SandBox.controller.MessageLine;

import java.util.ArrayList;
import java.util.List;

import jp.SandBox.meta.MessageMeta;
import jp.SandBox.service.AuthService;
import jp.SandBox.service.MessageService;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class DeleteController extends Controller {
    MessageService service = new MessageService();
    MessageMeta meta = new MessageMeta();
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
        reqStrKeys = java.util.Arrays.asList((String[]) request.getAttribute("keyArray"));
        
        List<String>strKeys = new ArrayList<String>();
        for(String check : checks){
            Integer index = reqStrKeys.indexOf(check);
            if(index!=-1){
                strKeys.add(reqStrKeys.get(index));
            }        
        }
        service.delete(strKeys);
        return redirect(basePath);
    }

    private boolean isSelectedItem(String[] checks) {
        return checks!=null? true : false;
    }
}

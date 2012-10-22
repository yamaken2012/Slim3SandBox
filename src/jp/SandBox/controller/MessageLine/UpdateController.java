package jp.SandBox.controller.MessageLine;

import java.util.ArrayList;
import java.util.List;
import jp.SandBox.service.MessageService;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class UpdateController extends Controller {
    MessageService service = new MessageService();
    @Override
    public Navigation run() throws Exception {
        List<String>reqStrKeys = new ArrayList<String>();
        List<String>reqMessages = new ArrayList<String>();
        
        reqStrKeys = java.util.Arrays.asList((String[]) request.getAttribute("keyArray"));
        reqMessages = java.util.Arrays.asList((String[]) request.getAttribute("messageArray"));
        
        List<String>strKeys = new ArrayList<String>();
        List<String>messages = new ArrayList<String>();
        String[] checks = (String[]) request.getAttribute("checkBoxArray");
        if(checks!=null){
            for(String check : checks){
                Integer index = reqStrKeys.indexOf(check);
                if(index!=-1){
                    strKeys.add(reqStrKeys.get(index));
                    messages.add(reqMessages.get(index));
                }
            }
            service.update(strKeys, messages);
        }
        return redirect(basePath);
    }
}

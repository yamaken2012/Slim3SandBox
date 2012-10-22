package jp.SandBox.controller.MessageLine;

import jp.SandBox.service.AuthService;
import jp.SandBox.service.MessageService;
import jp.SandBox.service.SessionManagementService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

public class InsertController extends Controller {
    MessageService messageService = new MessageService();
    SessionManagementService session = new SessionManagementService();
    AuthService authService = new AuthService();
    
    @Override
    public Navigation run() throws Exception {
        if(!authService.isLogin()){
            return redirect("/Login/");
        }
        messageService.insert(new RequestMap(request), session.getUserId());
        return redirect(basePath);
    }
}

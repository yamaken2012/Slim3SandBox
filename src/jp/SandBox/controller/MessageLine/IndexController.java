package jp.SandBox.controller.MessageLine;

import java.util.List;

import jp.SandBox.model.Message;
import jp.SandBox.service.AuthService;
import jp.SandBox.service.MessageService;
import jp.SandBox.service.SessionManagementService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {
    MessageService messageService = new MessageService();
    SessionManagementService session  = new SessionManagementService();
    AuthService authService  = new AuthService();
    
    @Override
    public Navigation run() throws Exception {
        if(!authService.isLogin()){
            return redirect("/Login");
        }
        List<Message> messageList = messageService.getAllMessageList();
        requestScope("messageList", messageList);
        requestScope("userId", sessionScope("userId"));
        return forward("index.jsp");
    }
}

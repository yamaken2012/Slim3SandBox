package jp.SandBox.controller.MessageLine;

import java.util.List;

import jp.SandBox.model.Message;
import jp.SandBox.service.MessageService;
import jp.SandBox.service.SessionManagementService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {
    MessageService service = new MessageService();
    SessionManagementService session  = new SessionManagementService();
    @Override
    public Navigation run() throws Exception {
        if(!session.getUserId().equals("")){
            List<Message> messageList = service.getMessageList();
            requestScope("messageList", messageList);
            requestScope("userId", session.getUserId());
            return forward("index.jsp");
        }
        return redirect("/Login/");
    }
}

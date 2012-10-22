package jp.SandBox.controller.MessageLine;

import jp.SandBox.service.MessageService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

public class InsertController extends Controller {
    MessageService service = new MessageService();
    
    @Override
    public Navigation run() throws Exception {
        service.insert(new RequestMap(request));
        return redirect(basePath);
    }
}

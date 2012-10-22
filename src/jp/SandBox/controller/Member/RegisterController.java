package jp.SandBox.controller.Member;

import jp.SandBox.service.RegisterService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

public class RegisterController extends Controller {
    RegisterService service = new RegisterService();
    @Override
    public Navigation run() throws Exception {
        RequestMap requestMap = new RequestMap(request);
        if(!service.isUserExists(requestMap)){
            service.regUser(requestMap);
            return redirect(basePath + "success");    
        }else{
            requestScope("message","Sorry. This ID is used. Please use another ID. ");
            return forward(basePath);
        }
    }
}

package jp.SandBox.controller.Login;

import jp.SandBox.service.AuthService;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

public class AuthController extends Controller {
    AuthService service = new AuthService();
    @Override
    public Navigation run() throws Exception {
        if(service.isAuth(new RequestMap(request))){
            return redirect("/MessageLine/");
        }else{
            return redirect(basePath);
        }
    }
}

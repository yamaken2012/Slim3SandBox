package jp.SandBox.controller.Member;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class SuccessController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("success.jsp");
    }
}

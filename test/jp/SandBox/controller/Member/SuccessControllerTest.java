package jp.SandBox.controller.Member;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SuccessControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/Member/success");
        SuccessController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/Member/success.jsp"));
    }
}

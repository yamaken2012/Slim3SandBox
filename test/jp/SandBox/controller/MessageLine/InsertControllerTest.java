package jp.SandBox.controller.MessageLine;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class InsertControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/MessageLine/insert");
        InsertController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/MessageLine/insert.jsp"));
    }
}

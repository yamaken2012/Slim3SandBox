package jp.SandBox.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MessageServiceTest extends AppEngineTestCase {

    private MessageService service = new MessageService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}

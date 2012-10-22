package jp.SandBox.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UsersTest extends AppEngineTestCase {

    private Users model = new Users();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}

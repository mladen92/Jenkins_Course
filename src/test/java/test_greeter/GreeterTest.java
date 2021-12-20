package test_greeter;

import greeter.Greeter;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class GreeterTest {

    private Greeter greeter;

    @Before
    public void setup() {
        greeter = new Greeter();
    }

    @Test
    public void greetShouldIncludeTheOneBeingGreeted() {
        String someone = "World";

        assertThat(greeter.greet(someone), containsString(someone));
    }

    @Test
    public void greetShouldIncludeGreetingPhrase() {
        String someone = "World";

        assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
    }
    @Test
    public void greetShouldIncludeGreetingPhrase2() {
        String someone = "World2";

        assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
    }

    @Test
    public void greetShouldIncludeGreetingMessage() {
        String someone = "World, Thanks you making me Happy";

        assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
    }
}

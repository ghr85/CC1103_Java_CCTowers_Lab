import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestGuest {
    Guest guest;
    @Before
    public void before(){
        guest = new Guest("Stevie Lovebone");
    }

    @Test
    public void hasName{
        assertEquals("Steve Lovebone",guest.getName());
    }
}

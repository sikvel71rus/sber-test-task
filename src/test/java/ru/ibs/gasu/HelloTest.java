package ru.ibs.gasu;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ibs.gasu.service.HelloService;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by evgeniy on 13.12.18.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class HelloTest {

    @InjectMocks
    private HelloService helloService;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void helloTest() {
        assertEquals(helloService.hello("test"), "Hello test!");
    }

}

package ev3dev.actuators.ev3;

import ev3dev.actuators.Sound;
import ev3dev.hardware.EV3DevFileSystem;
import ev3dev.hardware.EV3DevPlatform;
import fake_ev3dev.ev3dev.actuators.FakeLed;
import fake_ev3dev.ev3dev.sensors.FakeBattery;
import lejos.hardware.LED;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.lang.reflect.Field;

public class EV3LedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void resetTest() throws IOException, NoSuchFieldException, IllegalAccessException {

        //Reset the singleton
        //https://stackoverflow.com/questions/8256989/singleton-and-unit-testing
        Field instance = Sound.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);

        FakeBattery.resetEV3DevInfrastructure();

        System.setProperty(EV3DevFileSystem.EV3DEV_TESTING_KEY, FakeBattery.EV3DEV_FAKE_SYSTEM_PATH);

    }

    @Test
    public void constructorLeftTest() throws Exception {

        final FakeBattery fakeBattery = new FakeBattery(EV3DevPlatform.EV3BRICK);

        LED led = new EV3Led(EV3Led.LEFT);
    }

    @Test
    public void constructorRightTest() throws Exception {

        final FakeBattery fakeBattery = new FakeBattery(EV3DevPlatform.EV3BRICK);

        LED led = new EV3Led(EV3Led.RIGHT);
    }

    @Ignore("Review how to reset a Static classic in JUnit")
    @Test
    public void usingLedOnEV3BrickPlatformTest() throws Exception {

        thrown.expect(RuntimeException.class);

        final FakeBattery fakeBattery = new FakeBattery(EV3DevPlatform.BRICKPI);

        LED led = new EV3Led(EV3Led.LEFT);
    }

    @Test
    public void badButtonTest() throws Exception {

        thrown.expect(RuntimeException.class);

        final FakeBattery fakeBattery = new FakeBattery(EV3DevPlatform.EV3BRICK);

        //TODO Use a Enum in the constructor
        LED led = new EV3Led(2);
    }

    @Test
    public void leftLedPatternsTest() throws Exception {

        final FakeBattery fakeBattery = new FakeBattery(EV3DevPlatform.EV3BRICK);
        final FakeLed fakeLed = new FakeLed(EV3DevPlatform.EV3BRICK);

        //TODO Use a Enum in the constructor
        LED led = new EV3Led(EV3Led.LEFT);
        led.setPattern(1);
        led.setPattern(2);
        led.setPattern(3);
        led.setPattern(4);
    }

    @Test
    public void rightLedPatternsTest() throws Exception {

        final FakeBattery fakeBattery = new FakeBattery(EV3DevPlatform.EV3BRICK);
        final FakeLed fakeLed = new FakeLed(EV3DevPlatform.EV3BRICK);

        //TODO Use a Enum in the constructor
        LED led = new EV3Led(EV3Led.RIGHT);
        led.setPattern(1);
        led.setPattern(2);
        led.setPattern(3);
        led.setPattern(4);
    }

}

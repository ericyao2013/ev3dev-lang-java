package ev3dev.sensors.mindsensors;

import ev3dev.hardware.EV3DevFileSystem;
import ev3dev.hardware.EV3DevPlatform;
import fake_ev3dev.ev3dev.sensors.FakeBattery;
import fake_ev3dev.ev3dev.sensors.mindsensors.FakeAbsolutIMUSensor;
import fake_ev3dev.ev3dev.sensors.mindsensors.FakeNXTCamV5Sensor;
import lejos.hardware.port.SensorPort;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class NXTCamV5Test {

    @Before
    public void resetTest() throws IOException {
        FakeBattery.deleteEV3DevFakeSystemPath();
        FakeBattery.createEV3DevFakeSystemPath();

        System.setProperty(EV3DevFileSystem.EV3DEV_TESTING_KEY, FakeBattery.EV3DEV_FAKE_SYSTEM_PATH);

    }

    @Test
    public void getAvailableModes() throws Exception {

        final FakeBattery fakeBattery = new FakeBattery(EV3DevPlatform.EV3BRICK);
        final FakeNXTCamV5Sensor fakeNXTCamV5Sensor = new FakeNXTCamV5Sensor(EV3DevPlatform.EV3BRICK);

        NXTCamV5 nxtCamV5 = new NXTCamV5(SensorPort.S1);

        final List<String> expectedModes = Arrays.asList();
        final List<String> modes  = nxtCamV5.getAvailableModes();

        assertThat(modes, Matchers.is(expectedModes));
    }

}

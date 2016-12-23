package edu.illinois.library.cantaloupe.test;

import edu.illinois.library.cantaloupe.config.ConfigurationFactory;
import org.junit.After;
import org.junit.Before;

/**
 * Base class for all tests.
 */
public abstract class BaseTest {

    static {
        // Suppress a Dock icon and annoying Space transition in full-screen
        // mode in macOS.
        System.setProperty("java.awt.headless", "true");
        // Suppress an exception thrown by the JAI framework.
        System.setProperty("com.sun.media.jai.disableMediaLib", "true");
    }

    @Before
    public void setUp() throws Exception {
        ConfigurationFactory.clearInstance();
        System.setProperty(ConfigurationFactory.CONFIG_VM_ARGUMENT, "memory");
    }

    @After
    public void tearDown() throws Exception {}

}

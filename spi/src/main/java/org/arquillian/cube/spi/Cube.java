package org.arquillian.cube.spi;

import java.util.Map;

public interface Cube {

    public enum State {
        CREATED,
        CREATE_FAILED,
        STARTED,
        START_FAILED,
        STOPPED,
        STOP_FAILED,
        DESTROYED,
        DESTORY_FAILED,
        PRE_RUNNING
    }

    State state();

    String getId();

    void create() throws CubeControlException;

    void start() throws CubeControlException;

    void stop() throws CubeControlException;

    void destroy() throws CubeControlException;

    void changeToPreRunning();

    Binding bindings();

    Map<String, Object> configuration();
}

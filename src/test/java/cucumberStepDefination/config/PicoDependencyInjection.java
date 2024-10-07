package cucumberStepDefination.config;



import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class PicoDependencyInjection implements ObjectFactory {

    private PicoFactory picoFactory;

    public PicoDependencyInjection() {
        picoFactory = new PicoFactory();
    }

    @Override
    public void start() {
        picoFactory.start();
    }

    @Override
    public void stop() {
        picoFactory.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return picoFactory.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return picoFactory.getInstance(aClass);
    }
}

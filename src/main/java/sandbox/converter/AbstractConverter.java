package sandbox.converter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.convert.converter.Converter;

public abstract class AbstractConverter<S, D> implements ApplicationContextAware, Converter<S, D> {

    protected ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public D convert(S source) {

        D dest = null;
        if (!isNullSource(source)) {
            dest = doConvert(source);
        }
        if (isNullTarget(dest)) {
            dest = null;
        }
        return dest;
    }

    protected boolean isNullSource(S source) {
        return source == null;
    }

    protected abstract D doConvert(S source);

    protected boolean isNullTarget(D dest) {
        return dest == null;
    }
}

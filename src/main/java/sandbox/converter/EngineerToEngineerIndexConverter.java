package sandbox.converter;

import org.springframework.stereotype.Component;
import sandbox.domain.entity.Engineer;
import sandbox.domain.index.EngineerIndex;

@Component
public class EngineerToEngineerIndexConverter extends JobIndexConverter<Engineer, EngineerIndex> {

    public EngineerIndex doConvert(Engineer source) {

        EngineerIndex index = new EngineerIndex();
        return setJob(source, index);
    }
}

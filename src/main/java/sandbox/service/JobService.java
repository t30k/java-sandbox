package sandbox.service;

import sandbox.domain.entity.Engineer;
import sandbox.domain.index.EngineerIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private ConversionService conversionService;

    public EngineerIndex getIndex(Engineer input) {
        return conversionService.convert(input, EngineerIndex.class);
    }
}

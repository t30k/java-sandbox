package sandbox.converter;

import sandbox.domain.entity.AbstractJob;
import sandbox.domain.index.AbstractJobIndex;

public abstract class JobIndexConverter<S extends AbstractJob, D extends AbstractJobIndex> extends AbstractConverter<S, D> {

    D setJob(S job, D index) {
        index.setJobId(job.getJobId());
        index.setJobName(job.getJobName());
        return index;
    }
}

package sandbox.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Engineer extends AbstractJob {

    private String jobId;
    private String jobName;
}

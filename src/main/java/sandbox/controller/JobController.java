package sandbox.controller;

import sandbox.domain.entity.Engineer;
import sandbox.domain.index.EngineerIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sandbox.service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/search")
    public EngineerIndex search() {
        Engineer engineer = Engineer.builder().jobId("1").jobName("Engineer").build();
        EngineerIndex index = jobService.getIndex(engineer);
        return index;
    }

}

package cn.steve.eurekafeign.service.impl;

import cn.steve.eurekafeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created By SteveWoo
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}

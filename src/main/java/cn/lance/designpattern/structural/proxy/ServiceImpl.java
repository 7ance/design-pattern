package cn.lance.designpattern.structural.proxy;


import lombok.extern.slf4j.Slf4j;

/**
 * 服务实现类
 */
@Slf4j
public class ServiceImpl implements Service {

    @Override
    public void operation() {
        log.info("实际服务类执行...");
    }

}

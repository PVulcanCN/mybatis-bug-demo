package com.mybatis.plus.mybatis.bug.demo;

import com.mybatis.plus.bug.demo.MybatisBugDemoApplication;
import com.mybatis.plus.bug.demo.service.EncryptTestGateway;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@SpringBootTest(classes = MybatisBugDemoApplication.class)
@RunWith(SpringRunner.class)
class MybatisBugDemoApplicationTests {

    @Resource
    private EncryptTestGateway encryptTestGateway;

    @Test
    void contextLoads() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        encryptTestGateway.testEqAndIn("aa", strings);
    }

}

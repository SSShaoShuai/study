package com.example.study;

import com.nssutil.digest.Digest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class DigestTests {

    @Resource
    private Digest digest;

    @Test
    public void DigestTest(){
        System.out.println("开始测试用例");
        System.out.println(digest.digest("你好"));
    }
}

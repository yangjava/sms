package com.sms.test;

import com.sms.dao.SmsConfigRepository;
import com.sms.entity.SmsConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsTest {

    @Autowired
    private SmsConfigRepository smsConfigRepository;

    @Test
    public void testConfig(){
        Optional<SmsConfig> config = smsConfigRepository.findById(1L);
        System.out.println(config);
    }


}

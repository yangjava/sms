package com.sms.service.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.sms.dao.SmsConfigRepository;
import com.sms.dao.SmsTemplateRepository;
import com.sms.entity.SmsConfig;
import com.sms.entity.SmsTemplate;
import com.sms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private SmsConfigRepository smsConfigRepository;

    @Autowired
    private SmsTemplateRepository smsTemplateRepository;


    public void send(String profile,String platform,String templateCode,String phone,String signName,String templateParam)throws Exception {
//        Optional<SmsConfig> smsConfigOptional = smsConfigRepository.findByProfileAndPlatform(profile, platform);
//        if(smsConfigOptional.isPresent()){
//            Optional<SmsTemplate> smsTemplateOptional = smsTemplateRepository.findByPlatformAndTemplateCode(platform, template);
//            // 解析config
//
//            //获取accessKeyId或者accessKeySecret
//            IClientProfile iClientProfile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
//                    accessKeySecret);
//            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
//            IAcsClient acsClient = new DefaultAcsClient(iClientProfile);
//            SendSmsRequest request = new SendSmsRequest();
//            request.setMethod(MethodType.POST);
//            request.setPhoneNumbers(phone);
//            request.setSignName(signName);
//            request.setTemplateCode(templateCode);
//            request.setTemplateParam(templateParam);
//            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
//            if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
//                //请求成功
//
//            }

//        }
    }






}

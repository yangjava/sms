package com.sms.dao;

import com.sms.entity.SmsTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SmsTemplateRepository extends JpaRepository<SmsTemplate,Long> {

    Optional<SmsTemplate> findByPlatformAndTemplateCode(String platform,String templateCode);
}

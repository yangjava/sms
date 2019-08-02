package com.sms.dao;

import com.sms.entity.SmsConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SmsConfigRepository extends JpaRepository<SmsConfig,Long> {

    Optional<SmsConfig> findByProfileAndPlatform(String profile,String platform);
}

package com.example.redis.service;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    private final StringRedisTemplate redisTemplate;

    public RedisService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    // 저장
    public void saveData(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    // 조회
    public String getData(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    // 삭제
    public void deleteData(String key) {
        redisTemplate.delete(key);
    }
}

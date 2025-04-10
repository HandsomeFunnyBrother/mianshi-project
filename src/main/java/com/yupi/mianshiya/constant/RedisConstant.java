package com.yupi.mianshiya.constant;

public interface RedisConstant {

    /**
     * 用户签到记录的 Redis Key 前缀
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";
    //设置短时间
    Long CACHE_NULL_TTL = 2L;
    //设置缓存过期时间
    Long CACHE_QUESTION_TTL=30L;
    //缓存业务前缀
    String CACHE_QUESTION_KEY = "cache:question:";
    //缓存获取锁前缀
    String LOCK_QUESTION_KEY = "lock:question:";


    /**
     * 获取用户签到记录的 Redis Key
     * @param year 年份
     * @param userId 用户 id
     * @return 拼接好的 Redis Key
     */
    static String getUserSignInRedisKey(int year, long userId) {
        return String.format("%s:%s:%s", USER_SIGN_IN_REDIS_KEY_PREFIX, year, userId);
    }

}

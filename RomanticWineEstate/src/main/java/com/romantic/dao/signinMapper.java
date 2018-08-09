package com.romantic.dao;

public interface signinMapper {
    String queryUserByphone(String registerMoblie);
    String queryUserByemail(String registerEmail);
}

package com.romantic.service;

import com.romantic.pojo.register;

public interface registerService {
    register createregister(String userid,
                            String registerName,
                            String registerpassword,
                            String registerMoblie,
                            String registerEmail);
}

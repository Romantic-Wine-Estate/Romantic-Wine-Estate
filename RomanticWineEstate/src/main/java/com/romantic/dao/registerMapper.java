package com.romantic.dao;

import com.romantic.pojo.register;

public interface registerMapper {
    register createregister(String userid,
                            String registerName,
                            String registerpassword,
                            String registerMoblie,
                            String registerEmail);
}

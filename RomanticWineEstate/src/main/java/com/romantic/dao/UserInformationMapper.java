package com.romantic.dao;

import com.romantic.pojo.UserInformation;

import java.util.Date;

public interface UserInformationMapper {
    String updateHeadP(String userid,String HeadP);
    String updateBirth(String userid,String birth);
    String updateSex(String userid,String sex);
    UserInformation queryUserInformation(  String userid,
                                           String HeadP,
                                           String registerName,
                                           String sex,
                                           Date birth,
                                           String address);
}

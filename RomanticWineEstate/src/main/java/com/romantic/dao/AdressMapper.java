package com.romantic.dao;

import com.romantic.pojo.Address;

public interface AdressMapper {
    void createAddress( String user_id,
                        String province,
                        String city,
                        String town,
                        String mobile,
                        String contact,
                        String isdefault,
                        String address);
    void deleteAddress(String user_id,String isdefault);
}

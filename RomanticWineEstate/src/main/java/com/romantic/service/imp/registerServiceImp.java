package com.romantic.service.imp;
import com.romantic.dao.registerMapper;
import com.romantic.pojo.register;
import com.romantic.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class registerServiceImp implements registerService {
    @Autowired
    private registerMapper registerMapper;

    @Override
    public register createregister(String userid, String registerName, String registerpassword, String registerMoblie, String registerEmail) {
        return registerMapper.createregister(
                userid,registerName,registerpassword,registerMoblie,registerEmail);
    }
}

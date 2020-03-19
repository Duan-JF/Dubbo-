package org.example.service;

import org.example.domain.Address;

import java.util.List;

public interface UserInfoService {
    List<Address> queryAddress(Integer userId);
}

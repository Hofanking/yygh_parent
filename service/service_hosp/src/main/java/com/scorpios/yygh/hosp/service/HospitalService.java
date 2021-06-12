package com.scorpios.yygh.hosp.service;

import com.scorpios.yygh.model.hosp.Hospital;

import java.util.Map;

public interface HospitalService {

    // 上传医院信息
    void save(Map<String, Object> paramMap);

    // 查询医院
    Hospital getByHoscode(String hoscode);
}

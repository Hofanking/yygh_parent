package com.scorpios.yygh.hosp.service;

import com.scorpios.yygh.model.hosp.Hospital;
import com.scorpios.yygh.vo.hosp.HospitalQueryVo;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface HospitalService {

    // 上传医院信息
    void save(Map<String, Object> paramMap);

    // 查询医院
    Hospital getByHoscode(String hoscode);

    /**
     * 分页查询
     * @param page 当前页码
     * @param limit 每页记录数
     * @param hospitalQueryVo 查询条件
     * @return
     */
    Page<Hospital> selectPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);
}

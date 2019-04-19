package com.datau.springbootrestful001.service;

import com.datau.springbootrestful001.domain.City;

import java.util.List;

/**
 * @author menglei
 * @desc by 2019/04/18
 *城市业务逻辑接口类
 */
public interface CityService {
    /**
     * 根据城市ID 查询城市信息
     * @param id
     * @return
     */
    City findCityById(Long id);
    /**
     * 获取城市信息列表
     * @return
     */
    List<City> findAllCity();
    /**
     * 新增城市信息
     * @param city
     * @return
     */
    Long saveCity(City city);
    /**
     * 更新城市信息
     * @param city
     * @return
     */
    Long updateCity(City city);
    /**
     * 根据城市ID 删除城市信息
     * @param id
     * @return
     */
    Long movedCity(Long id);
}

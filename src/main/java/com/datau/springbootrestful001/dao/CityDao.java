package com.datau.springbootrestful001.dao;

import com.datau.springbootrestful001.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 城市 Dao 接口类
 *
 */
public interface CityDao {
    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);
    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    Long saveCity(City city);

    Long updateCity(City city);

    Long movedCity(Long id);
}

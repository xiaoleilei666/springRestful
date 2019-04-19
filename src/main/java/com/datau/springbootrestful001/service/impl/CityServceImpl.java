package com.datau.springbootrestful001.service.impl;

import com.datau.springbootrestful001.dao.CityDao;
import com.datau.springbootrestful001.domain.City;
import com.datau.springbootrestful001.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 */
@Service
public class CityServceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long movedCity(Long id) {
        return cityDao.movedCity(id);
    }
}

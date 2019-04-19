package com.datau.springbootrestful001.controller;

import com.datau.springbootrestful001.domain.City;
import com.datau.springbootrestful001.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author menglei
 * @description by 2019/04/18
 * 城市 Controller 实现 Restful HTTP 服务
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}",method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id){
        return cityService.findCityById(id);
    }
    @RequestMapping(value = "/api/city",method = RequestMethod.GET)
    public List<City> findAllCity(){
        return cityService.findAllCity();
    }
    @RequestMapping(value = "/api/city",method = RequestMethod.POST)
    public void createCity(@RequestBody City city){
        cityService.saveCity(city);
    }
    @RequestMapping(value = "/api/city",method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city){
        cityService.updateCity(city);
    }
    @RequestMapping(value = "/api/city/{id}",method = RequestMethod.DELETE)
    public void deleteCity(@PathVariable("id") Long id){
        cityService.movedCity(id);
    }
}

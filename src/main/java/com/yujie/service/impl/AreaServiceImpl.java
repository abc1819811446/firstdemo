package com.yujie.service.impl;

import com.github.pagehelper.PageHelper;
import com.yujie.mapper.AreaMapper;
import com.yujie.model.Area;
import com.yujie.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "areaService")
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public int addArea(Area area){
        return areaMapper.insertSelective(area);
    }
    @Override
    public int editArea(Area area){
        return areaMapper.updateByPrimaryKeySelective(area);
    }
    @Override
    public List<Area> findAllArea(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return areaMapper.selectAllArea();
    }
    @Override
    public int deleteArea(Integer areaId) {
        return areaMapper.deleteByPrimaryKey(areaId);
    }
    @Override
    public Area getArea(Integer areaId) {
        return areaMapper.selectByPrimaryKey(areaId);
    }
}

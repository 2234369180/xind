package com.bjpowernode.crm.workbench.service.impl;

import com.bjpowernode.crm.workbench.domain.ClueActivityRelation;
import com.bjpowernode.crm.workbench.mapper.ClueActivityRelationMapper;
import com.bjpowernode.crm.workbench.service.ClueActivityRelationMapperSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClueActivityRelationMapperSerivceImpl  implements ClueActivityRelationMapperSerivce {
    @Autowired
    private ClueActivityRelationMapper clueActivityRelationMapper;


    @Override
    public int insertClueActivityRelationByList(List<ClueActivityRelation> relationList) {
        return clueActivityRelationMapper.insertClueActivityRelationByList(relationList);
    }

    @Override
    public int deleteClueActivityRelationByClueIdandActivitybyId(String clueid, String activity) {
        return clueActivityRelationMapper.deleteClueActivityRelationByClueIdandActivitybyId(clueid, activity);
    }
}

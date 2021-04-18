package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.workbench.domain.ClueActivityRelation;

import java.util.List;

public interface ClueActivityRelationMapperSerivce {
    int insertClueActivityRelationByList(List<ClueActivityRelation> relationList);


    int deleteClueActivityRelationByClueIdandActivitybyId(String clueid,String activity);







}

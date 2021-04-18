package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.domain.DicType;
import com.bjpowernode.crm.settings.domain.DicValue;
import com.bjpowernode.crm.settings.mapper.DicValueMapper;
import com.bjpowernode.crm.settings.service.DicValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicValueServiceImpl implements DicValueService {
    @Autowired
    private DicValueMapper dicValueMapper;


    @Override
    public List<DicValue> queryAllDicValues() {
        return dicValueMapper.selectAllDicValues();
    }

    @Override
    public List<DicValue> queryDicValueByCode(String code) {
        return dicValueMapper.selectDicValueByTypeCode(code);
    }

    @Override
    public int saveCreateDicValue(DicValue dicValue) {
        return dicValueMapper.insertDicValue(dicValue);
    }


    @Override
    public int deleteDicValueByCodes(String[] typeCodes) {
        return dicValueMapper.deleteDicValueByTypeCodes(typeCodes);
    }

    @Override
    public int saveEditDicValue(DicValue dicValue) {
        return dicValueMapper.updateDicValue(dicValue);
    }

    @Override
    public int deleteDicValueByIds(String[] id) {
        return dicValueMapper.deleteDicValueByIds(id);
    }

    @Override
    public DicValue selectDicValueById(String id) {
        return dicValueMapper.selectDicValueById(id);
    }


}

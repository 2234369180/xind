package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.DicType;
import com.bjpowernode.crm.settings.domain.DicValue;

import java.util.List;

public interface DicValueService {
    List<DicValue> queryAllDicValues();

    List<DicValue> queryDicValueByCode(String code);

    int saveCreateDicValue(DicValue dicValue);

    int deleteDicValueByCodes(String[] codes);

    int saveEditDicValue(DicValue dicValue);

    int deleteDicValueByIds(String[] id);

    DicValue selectDicValueById(String id);
}

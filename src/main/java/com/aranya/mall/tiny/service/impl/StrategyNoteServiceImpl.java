package com.aranya.mall.tiny.service.impl;

import com.aranya.mall.tiny.mbg.mapper.BusinessStrategyNotesMapper;
import com.aranya.mall.tiny.mbg.model.BusinessStrategyNotes;
import com.aranya.mall.tiny.mbg.model.BusinessStrategyNotesExample;
import com.aranya.mall.tiny.service.StrategyNoteService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrategyNoteServiceImpl implements StrategyNoteService {
    @Autowired
   private BusinessStrategyNotesMapper businessStrategyNotesMapper;

    @Override
    public List<BusinessStrategyNotes> list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        BusinessStrategyNotesExample businessStrategyNotesExample = new BusinessStrategyNotesExample();
        BusinessStrategyNotesExample.Criteria criteria = businessStrategyNotesExample.createCriteria();
        criteria.andStatusEqualTo(1);
        criteria.andDeletedAtIsNull();
        businessStrategyNotesExample.setOrderByClause("created_at desc");
        return businessStrategyNotesMapper.selectByExample(businessStrategyNotesExample);
    }

    @Override
    public int addNote(BusinessStrategyNotes businessStrategyNotes) {
        return businessStrategyNotesMapper.insertSelective(businessStrategyNotes);
    }
}

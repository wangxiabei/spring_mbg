package com.aranya.mall.tiny.service;

import com.aranya.mall.tiny.mbg.model.BusinessStrategyNotes;
import java.util.List;

public interface StrategyNoteService {
    List<BusinessStrategyNotes> list(Integer pageSize, Integer pageNum);
    int addNote(BusinessStrategyNotes businessStrategyNotes);
}

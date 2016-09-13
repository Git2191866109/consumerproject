package com.mw.consumer.service.impl;

import com.mw.consumer.dao.interfaces.IDictionaryDao;
import com.mw.consumer.domain.Dictionary;
import com.mw.consumer.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wei.ma on 2016/9/2.
 */
@Service("dictionaryService")
@Transactional
public class DictionaryServiceImpl implements IDictionaryService {
    @Autowired
    private IDictionaryDao iDictionaryDao;

    @Override
    public Dictionary getDictionaryById(int id) {
        return iDictionaryDao.getById(id);
    }

    @Override
    public long insertDictionary(Dictionary dictionary) {
        return iDictionaryDao.insert(dictionary);
    }

}

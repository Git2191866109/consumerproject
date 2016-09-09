package com.mw.consumer.service;

import com.mw.consumer.domain.Dictionary;

/**
 * Created by wei.ma on 2016/9/2.
 */
public interface IDictionaryService {
    Dictionary getDictionaryById(int id);

    long insertDictionary(Dictionary dictionary);
}

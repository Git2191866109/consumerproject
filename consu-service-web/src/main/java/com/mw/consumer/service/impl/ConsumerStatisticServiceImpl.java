package com.mw.consumer.service.impl;

import com.mw.consumer.dao.interfaces.IConsumerStatisticDao;
import com.mw.consumer.domain.ConsumerStatistic;
import com.mw.consumer.service.IConsumerStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wei.ma on 2016/9/2.
 */
@Service("consumerStatisticService")
@Transactional
public class ConsumerStatisticServiceImpl implements IConsumerStatisticService {
    @Autowired
    private IConsumerStatisticDao iConsumerStatisticDao;

    @Override
    public ConsumerStatistic getConsumerStatisticById(int id) {
        return iConsumerStatisticDao.getById(id);
    }

    @Override
    public long insertConsumerStatistic(ConsumerStatistic ConsumerStatistic) {
        return iConsumerStatisticDao.insert(ConsumerStatistic);
    }

}

package com.mw.consumer.service;

import com.mw.consumer.domain.ConsumerStatistic;

/**
 * Created by wei.ma on 2016/9/2.
 */
public interface IConsumerStatisticService {

    ConsumerStatistic getConsumerStatisticById(int id);

    long insertConsumerStatistic(ConsumerStatistic consumerstatistic);
}

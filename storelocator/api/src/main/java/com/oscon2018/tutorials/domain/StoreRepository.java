package com.oscon2018.tutorials.domain;

import java.math.BigDecimal;
import java.util.List;

public interface StoreRepository {
    void createIndex(String indexName);
    void deleteIndex(String indexName);
    void addStoreToIndex(String indexName, StoreRecord store);
    List<StoreRecord> query(String indexName, BigDecimal lat, BigDecimal lon, Integer distance);
}

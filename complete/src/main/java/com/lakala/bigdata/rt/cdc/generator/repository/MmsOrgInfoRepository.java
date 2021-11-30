package com.lakala.bigdata.rt.cdc.generator.repository;

import com.lakala.bigdata.rt.cdc.generator.entity.MmsOrgInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MmsOrgInfoRepository extends JpaRepository<MmsOrgInfo, Integer> {
}
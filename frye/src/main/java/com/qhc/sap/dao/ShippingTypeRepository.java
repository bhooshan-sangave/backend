package com.qhc.sap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qhc.sap.entity.ShippingType;

@Repository
public interface ShippingTypeRepository extends JpaRepository<ShippingType, String> {
}

/**
 * 
 */
package com.qhc.sap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qhc.sap.entity.Unit;

/**
 * @author 
 *
 */
@Repository
public interface MeasurementUnitRepository extends JpaRepository<Unit, String> {
}

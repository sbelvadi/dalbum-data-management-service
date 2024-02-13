/**
 * 
 */
package com.dalbum.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dalbum.data.model.OtherImage;

/**
 * @author surajbelvadi
 *
 */
@Repository
public interface OtherImageRepository extends JpaRepository<OtherImage, Integer> {
 
    public List<OtherImage> findByDalbumId(int dalbumId) throws Exception;
    
}

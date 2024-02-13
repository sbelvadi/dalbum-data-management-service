/**
 * 
 */
package com.dalbum.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dalbum.data.model.Dalbum;

/**
 * @author surajbelvadi
 *
 */
@Repository
public interface DalbumRepository extends JpaRepository<Dalbum, Integer> {
 
    public Dalbum findByDalbumId(int dalbumId) throws Exception;
    
}

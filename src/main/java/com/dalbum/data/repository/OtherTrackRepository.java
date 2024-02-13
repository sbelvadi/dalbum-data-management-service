/**
 * 
 */
package com.dalbum.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dalbum.data.model.Dalbum;
import com.dalbum.data.model.OtherTrack;

/**
 * @author surajbelvadi
 *
 */
@Repository
public interface OtherTrackRepository extends JpaRepository<OtherTrack, Integer> {
 
    public List<OtherTrack> findByDalbum(Dalbum dalbum) throws Exception;
    
}

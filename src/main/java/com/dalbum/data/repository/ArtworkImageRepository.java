/**
 * 
 */
package com.dalbum.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dalbum.data.model.ArtworkImage;

/**
 * @author surajbelvadi
 *
 */
@Repository
public interface ArtworkImageRepository extends JpaRepository<ArtworkImage, Integer> {
 
    public List<ArtworkImage> findByDalbumId(int dalbumId) throws Exception;
    
}

/**
 * 
 */
package com.dalbum.data.dto;

import java.util.Date;
import java.util.List;

import com.dalbum.data.model.Credit;
import com.dalbum.data.model.DalbumTrack;
import com.dalbum.data.model.EmbeddedHiddenDimension;

import lombok.Data;

/**
 * @author surajbelvadi
 *
 */
public @Data class DalbumDetailRecord {

    private static final long serialVersionUID = 1L;

    private int dalbumId;
    private int adminId;
    private int artistId;
    private int containExplicitMaterial;
    private String copyrightNumber;
    private String copyrightOwner;
    private Date copyrightYear;
    private Date createdAt;
    private String dalbumDesc;
    private String dalbumRecordLbl;
    private String dalbumUrl;
    private Date deletedAt;
    private int genreId;
    private Integer hasDynamicCover;
    private Integer isActive;
    private Integer isArtworkBooklet;
    private Integer isPublished;
    private String name;
    private String password;
    private float price;
    private Date publishDate;
    private String statusDesc;
    private int subGenreId;
    private int totalSize;
    private String upcBarcode;
    private Date updatedAt;
    
    private List<Credit> credits;
    private List<DalbumTrack> dalbumTracks;
    private List<EmbeddedHiddenDimension> embeddedHiddenDimensions;
   
}

package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the lyrics database table.
 * 
 */
@Entity
@Table(name="lyrics")
@NamedQuery(name="Lyric.findAll", query="SELECT l FROM Lyric l")
public class Lyric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lyrics_id")
	private int lyricsId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private int dalbumId;

	@Column(name="dextra_label")
	private String dextraLabel;

	@Column(name="dextra_track_category")
	private String dextraTrackCategory;

	@Column(name="embedded_hidden_dimension_id")
	private int embeddedHiddenDimensionId;

	private String extension;

	@Column(name="is_active")
	private int isActive;

	@Column(name="material_category_id")
	private int materialCategoryId;

	@Column(name="material_id")
	private int materialId;

	@Column(name="material_sub_category_id")
	private int materialSubCategoryId;

	private String name;

	private String path;

	private String size;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	public Lyric() {
	}

	public int getLyricsId() {
		return this.lyricsId;
	}

	public void setLyricsId(int lyricsId) {
		this.lyricsId = lyricsId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getDalbumId() {
		return this.dalbumId;
	}

	public void setDalbumId(int dalbumId) {
		this.dalbumId = dalbumId;
	}

	public String getDextraLabel() {
		return this.dextraLabel;
	}

	public void setDextraLabel(String dextraLabel) {
		this.dextraLabel = dextraLabel;
	}

	public String getDextraTrackCategory() {
		return this.dextraTrackCategory;
	}

	public void setDextraTrackCategory(String dextraTrackCategory) {
		this.dextraTrackCategory = dextraTrackCategory;
	}

	public int getEmbeddedHiddenDimensionId() {
		return this.embeddedHiddenDimensionId;
	}

	public void setEmbeddedHiddenDimensionId(int embeddedHiddenDimensionId) {
		this.embeddedHiddenDimensionId = embeddedHiddenDimensionId;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getMaterialCategoryId() {
		return this.materialCategoryId;
	}

	public void setMaterialCategoryId(int materialCategoryId) {
		this.materialCategoryId = materialCategoryId;
	}

	public int getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public int getMaterialSubCategoryId() {
		return this.materialSubCategoryId;
	}

	public void setMaterialSubCategoryId(int materialSubCategoryId) {
		this.materialSubCategoryId = materialSubCategoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
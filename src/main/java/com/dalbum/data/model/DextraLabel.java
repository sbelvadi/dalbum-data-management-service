package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dextra_label database table.
 * 
 */
@Entity
@Table(name="dextra_label")
@NamedQuery(name="DextraLabel.findAll", query="SELECT d FROM DextraLabel d")
public class DextraLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dextra_label_id")
	private int dextraLabelId;

	@Column(name="at_position")
	private int atPosition;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private int dalbumId;

	@Column(name="is_active")
	private int isActive;

	private String label;

	@Column(name="track_dextra_category_id")
	private int trackDextraCategoryId;

	@Column(name="track_id")
	private int trackId;

	private int type;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	public DextraLabel() {
	}

	public int getDextraLabelId() {
		return this.dextraLabelId;
	}

	public void setDextraLabelId(int dextraLabelId) {
		this.dextraLabelId = dextraLabelId;
	}

	public int getAtPosition() {
		return this.atPosition;
	}

	public void setAtPosition(int atPosition) {
		this.atPosition = atPosition;
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

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getTrackDextraCategoryId() {
		return this.trackDextraCategoryId;
	}

	public void setTrackDextraCategoryId(int trackDextraCategoryId) {
		this.trackDextraCategoryId = trackDextraCategoryId;
	}

	public int getTrackId() {
		return this.trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
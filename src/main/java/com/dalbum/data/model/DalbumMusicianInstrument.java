package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dalbum_musician_instrument database table.
 * 
 */
@Entity
@Table(name="dalbum_musician_instrument")
@NamedQuery(name="DalbumMusicianInstrument.findAll", query="SELECT d FROM DalbumMusicianInstrument d")
public class DalbumMusicianInstrument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dalbum_musician_role_id")
	private int dalbumMusicianRoleId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="instrument_category_id")
	private int instrumentCategoryId;

	@Column(name="is_active")
	private int isActive;

	@Column(name="musician_instrument_id")
	private String musicianInstrumentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	//bi-directional many-to-one association to DalbumMusician
	@ManyToOne
	@JoinColumn(name="dalbum_musician_id")
	private DalbumMusician dalbumMusician;

	public DalbumMusicianInstrument() {
	}

	public int getDalbumMusicianRoleId() {
		return this.dalbumMusicianRoleId;
	}

	public void setDalbumMusicianRoleId(int dalbumMusicianRoleId) {
		this.dalbumMusicianRoleId = dalbumMusicianRoleId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getInstrumentCategoryId() {
		return this.instrumentCategoryId;
	}

	public void setInstrumentCategoryId(int instrumentCategoryId) {
		this.instrumentCategoryId = instrumentCategoryId;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getMusicianInstrumentId() {
		return this.musicianInstrumentId;
	}

	public void setMusicianInstrumentId(String musicianInstrumentId) {
		this.musicianInstrumentId = musicianInstrumentId;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public DalbumMusician getDalbumMusician() {
		return this.dalbumMusician;
	}

	public void setDalbumMusician(DalbumMusician dalbumMusician) {
		this.dalbumMusician = dalbumMusician;
	}

}
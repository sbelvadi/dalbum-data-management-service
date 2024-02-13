package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dalbum_musician database table.
 * 
 */
@Entity
@Table(name="dalbum_musician")
@NamedQuery(name="DalbumMusician.findAll", query="SELECT d FROM DalbumMusician d")
public class DalbumMusician implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dalbum_musician_id")
	private int dalbumMusicianId;

	@Column(name="at_position")
	private int atPosition;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private int dalbumId;

	@Column(name="is_active")
	private int isActive;

	@Column(name="musician_id")
	private int musicianId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	//bi-directional many-to-one association to DalbumMusicianInstrument
	@OneToMany(mappedBy="dalbumMusician")
	private List<DalbumMusicianInstrument> dalbumMusicianInstruments;

	public DalbumMusician() {
	}

	public int getDalbumMusicianId() {
		return this.dalbumMusicianId;
	}

	public void setDalbumMusicianId(int dalbumMusicianId) {
		this.dalbumMusicianId = dalbumMusicianId;
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

	public int getMusicianId() {
		return this.musicianId;
	}

	public void setMusicianId(int musicianId) {
		this.musicianId = musicianId;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<DalbumMusicianInstrument> getDalbumMusicianInstruments() {
		return this.dalbumMusicianInstruments;
	}

	public void setDalbumMusicianInstruments(List<DalbumMusicianInstrument> dalbumMusicianInstruments) {
		this.dalbumMusicianInstruments = dalbumMusicianInstruments;
	}

	public DalbumMusicianInstrument addDalbumMusicianInstrument(DalbumMusicianInstrument dalbumMusicianInstrument) {
		getDalbumMusicianInstruments().add(dalbumMusicianInstrument);
		dalbumMusicianInstrument.setDalbumMusician(this);

		return dalbumMusicianInstrument;
	}

	public DalbumMusicianInstrument removeDalbumMusicianInstrument(DalbumMusicianInstrument dalbumMusicianInstrument) {
		getDalbumMusicianInstruments().remove(dalbumMusicianInstrument);
		dalbumMusicianInstrument.setDalbumMusician(null);

		return dalbumMusicianInstrument;
	}

}
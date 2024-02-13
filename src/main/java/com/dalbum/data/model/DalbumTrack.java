package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dalbum_track database table.
 * 
 */
@Entity
@Table(name="dalbum_track")
@NamedQuery(name="DalbumTrack.findAll", query="SELECT d FROM DalbumTrack d")
public class DalbumTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="track_id")
	private Integer trackId;

	@Column(name="at_position")
	private Integer atPosition;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	private String extension;

	private String filename;

	@Column(name="is_active")
	private Integer isActive;

	@Column(name="is_compressed")
	private Integer isCompressed;

	@Column(name="isrc_number")
	private String isrcNumber;

	private Integer length;

	private String name;

	private String path;

	private String size;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	//bi-directional many-to-one association to Dalbum
	@ManyToOne
	@JoinColumn(name="dalbum_id")
	private Dalbum dalbum;

	public DalbumTrack() {
	}

	public int getTrackId() {
		return this.trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
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

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsCompressed() {
		return this.isCompressed;
	}

	public void setIsCompressed(int isCompressed) {
		this.isCompressed = isCompressed;
	}

	public String getIsrcNumber() {
		return this.isrcNumber;
	}

	public void setIsrcNumber(String isrcNumber) {
		this.isrcNumber = isrcNumber;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
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

	public Dalbum getDalbum() {
		return this.dalbum;
	}

	public void setDalbum(Dalbum dalbum) {
		this.dalbum = dalbum;
	}

}
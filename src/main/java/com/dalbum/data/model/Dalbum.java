package com.dalbum.data.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dalbum database table.
 * 
 */
@Entity
@Table(name="dalbum")
@NamedQuery(name="Dalbum.findAll", query="SELECT d FROM Dalbum d")
public class Dalbum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dalbum_id")
	private Integer dalbumId;

	@Column(name="admin_id")
	private Integer adminId;

	@Column(name="artist_id")
	private Integer artistId;

	@Column(name="contain_explicit_material")
	private Integer containExplicitMaterial;

	@Column(name="copyright_number")
	private String copyrightNumber;

	@Column(name="copyright_owner")
	private String copyrightOwner;

	@Temporal(TemporalType.DATE)
	@Column(name="copyright_year")
	private Date copyrightYear;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_desc")
	private String dalbumDesc;

	@Column(name="dalbum_record_lbl")
	private String dalbumRecordLbl;

	@Lob
	@Column(name="dalbum_url")
	private String dalbumUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="deleted_at")
	private Date deletedAt;

	@Column(name="genre_id")
	private Integer genreId;

	@Column(name="has_dynamic_cover")
	private Integer hasDynamicCover;

	@Column(name="is_active")
	private Integer isActive;

	@Column(name="is_artwork_booklet")
	private Integer isArtworkBooklet;

	@Column(name="is_published")
	private Integer isPublished;

	private String name;

	private String password;

	private BigDecimal price;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="publish_date")
	private Date publishDate;

	@Column(name="status_desc")
	private String statusDesc;

	@Column(name="sub_genre_id")
	private Integer subGenreId;

	@Column(name="total_size")
	private Integer totalSize;

	@Column(name="understand_and_agree")
	private Integer understandAndAgree;

	@Lob
	@Column(name="upc_barcode")
	private String upcBarcode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	//bi-directional many-to-one association to Credit
	@OneToMany(mappedBy="dalbum")
	private List<Credit> credits;

	//bi-directional many-to-one association to DalbumTrack
	@OneToMany(mappedBy="dalbum")
	private List<DalbumTrack> dalbumTracks;

	//bi-directional many-to-one association to EmbeddedHiddenDimension
	@OneToMany(mappedBy="dalbum")
	private List<EmbeddedHiddenDimension> embeddedHiddenDimensions;

	//bi-directional many-to-one association to OtherTrack
	@OneToMany(mappedBy="dalbum")
	private List<OtherTrack> otherTracks;

	public Dalbum() {
	}

	public int getDalbumId() {
		return this.dalbumId;
	}

	public void setDalbumId(int dalbumId) {
		this.dalbumId = dalbumId;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public int getArtistId() {
		return this.artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public int getContainExplicitMaterial() {
		return this.containExplicitMaterial;
	}

	public void setContainExplicitMaterial(int containExplicitMaterial) {
		this.containExplicitMaterial = containExplicitMaterial;
	}

	public String getCopyrightNumber() {
		return this.copyrightNumber;
	}

	public void setCopyrightNumber(String copyrightNumber) {
		this.copyrightNumber = copyrightNumber;
	}

	public String getCopyrightOwner() {
		return this.copyrightOwner;
	}

	public void setCopyrightOwner(String copyrightOwner) {
		this.copyrightOwner = copyrightOwner;
	}

	public Date getCopyrightYear() {
		return this.copyrightYear;
	}

	public void setCopyrightYear(Date copyrightYear) {
		this.copyrightYear = copyrightYear;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getDalbumDesc() {
		return this.dalbumDesc;
	}

	public void setDalbumDesc(String dalbumDesc) {
		this.dalbumDesc = dalbumDesc;
	}

	public String getDalbumRecordLbl() {
		return this.dalbumRecordLbl;
	}

	public void setDalbumRecordLbl(String dalbumRecordLbl) {
		this.dalbumRecordLbl = dalbumRecordLbl;
	}

	public String getDalbumUrl() {
		return this.dalbumUrl;
	}

	public void setDalbumUrl(String dalbumUrl) {
		this.dalbumUrl = dalbumUrl;
	}

	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public int getGenreId() {
		return this.genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public int getHasDynamicCover() {
		return this.hasDynamicCover;
	}

	public void setHasDynamicCover(int hasDynamicCover) {
		this.hasDynamicCover = hasDynamicCover;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsArtworkBooklet() {
		return this.isArtworkBooklet;
	}

	public void setIsArtworkBooklet(int isArtworkBooklet) {
		this.isArtworkBooklet = isArtworkBooklet;
	}

	public int getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public int getSubGenreId() {
		return this.subGenreId;
	}

	public void setSubGenreId(int subGenreId) {
		this.subGenreId = subGenreId;
	}

	public int getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getUnderstandAndAgree() {
		return this.understandAndAgree;
	}

	public void setUnderstandAndAgree(int understandAndAgree) {
		this.understandAndAgree = understandAndAgree;
	}

	public String getUpcBarcode() {
		return this.upcBarcode;
	}

	public void setUpcBarcode(String upcBarcode) {
		this.upcBarcode = upcBarcode;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Credit> getCredits() {
		return this.credits;
	}

	public void setCredits(List<Credit> credits) {
		this.credits = credits;
	}

	public Credit addCredit(Credit credit) {
		getCredits().add(credit);
		credit.setDalbum(this);

		return credit;
	}

	public Credit removeCredit(Credit credit) {
		getCredits().remove(credit);
		credit.setDalbum(null);

		return credit;
	}

	public List<DalbumTrack> getDalbumTracks() {
		return this.dalbumTracks;
	}

	public void setDalbumTracks(List<DalbumTrack> dalbumTracks) {
		this.dalbumTracks = dalbumTracks;
	}

	public DalbumTrack addDalbumTrack(DalbumTrack dalbumTrack) {
		getDalbumTracks().add(dalbumTrack);
		dalbumTrack.setDalbum(this);

		return dalbumTrack;
	}

	public DalbumTrack removeDalbumTrack(DalbumTrack dalbumTrack) {
		getDalbumTracks().remove(dalbumTrack);
		dalbumTrack.setDalbum(null);

		return dalbumTrack;
	}

	public List<EmbeddedHiddenDimension> getEmbeddedHiddenDimensions() {
		return this.embeddedHiddenDimensions;
	}

	public void setEmbeddedHiddenDimensions(List<EmbeddedHiddenDimension> embeddedHiddenDimensions) {
		this.embeddedHiddenDimensions = embeddedHiddenDimensions;
	}

	public EmbeddedHiddenDimension addEmbeddedHiddenDimension(EmbeddedHiddenDimension embeddedHiddenDimension) {
		getEmbeddedHiddenDimensions().add(embeddedHiddenDimension);
		embeddedHiddenDimension.setDalbum(this);

		return embeddedHiddenDimension;
	}

	public EmbeddedHiddenDimension removeEmbeddedHiddenDimension(EmbeddedHiddenDimension embeddedHiddenDimension) {
		getEmbeddedHiddenDimensions().remove(embeddedHiddenDimension);
		embeddedHiddenDimension.setDalbum(null);

		return embeddedHiddenDimension;
	}

	public List<OtherTrack> getOtherTracks() {
		return this.otherTracks;
	}

	public void setOtherTracks(List<OtherTrack> otherTracks) {
		this.otherTracks = otherTracks;
	}

	public OtherTrack addOtherTrack(OtherTrack otherTrack) {
		getOtherTracks().add(otherTrack);
		otherTrack.setDalbum(this);

		return otherTrack;
	}

	public OtherTrack removeOtherTrack(OtherTrack otherTrack) {
		getOtherTracks().remove(otherTrack);
		otherTrack.setDalbum(null);

		return otherTrack;
	}

}
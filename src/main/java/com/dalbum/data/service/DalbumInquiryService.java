/**
 * 
 */
package com.dalbum.data.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dalbum.data.dto.DalbumMedia;
import com.dalbum.data.dto.DalbumPackageInfo;
import com.dalbum.data.model.ArtworkImage;
import com.dalbum.data.model.Dalbum;
import com.dalbum.data.model.DalbumTrack;
import com.dalbum.data.model.OtherImage;
import com.dalbum.data.model.OtherTrack;
import com.dalbum.data.repository.ArtworkImageRepository;
import com.dalbum.data.repository.DalbumRepository;
import com.dalbum.data.repository.OtherImageRepository;
import com.dalbum.data.repository.OtherTrackRepository;

/**
 * @author surajbelvadi
 *
 */
@Service
public class DalbumInquiryService {

    private static Logger LOGGER = LoggerFactory.getLogger(DalbumInquiryService.class);
    
    @Autowired
    private DalbumRepository dalbumRepository;
    
    @Autowired
    private ArtworkImageRepository artworkImageRepository;
    
    @Autowired
    private OtherImageRepository otherImageRepository;
    
    @Autowired
    private OtherTrackRepository otherTrackRepository;

    private static final String DEXTRA_STRING = "dextra";
    private static final String EMBEDDED_STRING = "embedded";
    
    /**
     * @param dalbumId
     * @return
     * @throws Exception
     */
    public DalbumPackageInfo getDalbumPackageInfo(String dalbumId) throws Exception {

        /*
         * Get all the Dalbum Related data from repository
         */
        Dalbum dalbum = dalbumRepository.findByDalbumId(Integer.parseInt(dalbumId));
        

        // Get Artwork
        List<DalbumMedia> artworks = new ArrayList<DalbumMedia>();
        LOGGER.info("Number of Dalbum Artwork for Dalbum id{} is {}" , dalbumId, dalbum.getDalbumTracks().size());
        for (ArtworkImage artworkImage : artworkImageRepository.findByDalbumId(Integer.valueOf(dalbumId))) {
            DalbumMedia dalbumMedia = DalbumMedia.builder().dalbumMediaId(String.valueOf(artworkImage.getArtworkImageId()))
                    .description(Optional.of(artworkImage.getName())).name(artworkImage.getName())
                    .size(Optional.of(artworkImage.getSize())).type(Optional.of(artworkImage.getArtworkType())) 
                    .path(Optional.of(artworkImage.getPath())).build();
            artworks.add(dalbumMedia);

        }

        // Get Tracks
        List<DalbumMedia> tracks = new ArrayList<DalbumMedia>();
        LOGGER.info("Number of Dalbum Tracks for Dalbum id{} is {}" , dalbumId, dalbum.getDalbumTracks().size());
        for (DalbumTrack dalbumTrack : dalbum.getDalbumTracks()) {
            DalbumMedia dalbumMedia = DalbumMedia.builder()
                                        .dalbumMediaId(String.valueOf(dalbumTrack.getTrackId()))
                                        .description(Optional.of(dalbumTrack.getFilename()))
                                        .name(dalbumTrack.getName())
                                        .size(Optional.of(dalbumTrack.getSize())).type(Optional.of("TRACK")) 
                                        .path(Optional.of(dalbumTrack.getPath())).build();
            tracks.add(dalbumMedia);

        }

        /*
         * Get Dextras and Embedded media
         * Tables Other Track and Other Image contain both Embedded and Dextra.
         * Need to filter out and store appropriately
         */
        List<DalbumMedia> dextras = new ArrayList<DalbumMedia>();
        List<DalbumMedia> embeddedMediaList = new ArrayList<DalbumMedia>();
        
        for (OtherTrack otherTrack : otherTrackRepository.findByDalbum(dalbum)) {
            
            //Do this if it contains dextra in the file name
            if (otherTrack.getFilename().contains(DEXTRA_STRING)){
                DalbumMedia dalbumMedia = DalbumMedia.builder()
                                            .dalbumMediaId(String.valueOf(otherTrack.getOtherTrackId()))
                                            .description(Optional.of(otherTrack.getFilename()))
                                            .name(otherTrack.getName())
                                            .size(Optional.of(otherTrack.getSize()))
                                            .type(Optional.of(DEXTRA_STRING)) 
                                            .path(Optional.of(otherTrack.getPath())).build();
                dextras.add(dalbumMedia);
            
            } else if (otherTrack.getFilename().contains(EMBEDDED_STRING)) {
                
                DalbumMedia dalbumMedia = DalbumMedia.builder()
                        .dalbumMediaId(String.valueOf(otherTrack.getOtherTrackId()))
                        .description(Optional.of(otherTrack.getFilename()))
                        .name(otherTrack.getName())
                        .size(Optional.of(otherTrack.getSize()))
                        .type(Optional.of(EMBEDDED_STRING)) 
                        .path(Optional.of(otherTrack.getPath())).build();
                embeddedMediaList.add(dalbumMedia);

            }

        }
        
        for (OtherImage otherImage : otherImageRepository.findByDalbumId(Integer.valueOf(dalbumId))) {
            
            //Do this if it contains dextra in the file name
            if (otherImage.getFilename().contains(DEXTRA_STRING)){
                DalbumMedia dalbumMedia = DalbumMedia.builder()
                                            .dalbumMediaId(String.valueOf(otherImage.getOtherImageId()))
                                            .description(Optional.of(otherImage.getFilename()))
                                            .name(otherImage.getName())
                                            .size(Optional.of(otherImage.getSize()))
                                            .type(Optional.of(DEXTRA_STRING)) 
                                            .path(Optional.of(otherImage.getPath())).build();
                dextras.add(dalbumMedia);
            
            } else if (otherImage.getFilename().contains(EMBEDDED_STRING)) {
                
                DalbumMedia dalbumMedia = DalbumMedia.builder()
                        .dalbumMediaId(String.valueOf(otherImage.getOtherImageId()))
                        .description(Optional.of(otherImage.getFilename()))
                        .name(otherImage.getName())
                        .size(Optional.of(otherImage.getSize()))
                        .type(Optional.of(EMBEDDED_STRING)) 
                        .path(Optional.of(otherImage.getPath())).build();
                embeddedMediaList.add(dalbumMedia);

            }

        }
        
        LOGGER.info("Number of Dalbum Dextras for Dalbum id{} is {}" , dalbumId, dextras.size());
        LOGGER.info("Number of Dalbum Embedded for Dalbum id{} is {}" , dalbumId, embeddedMediaList.size());
     
        return DalbumPackageInfo.builder()
                .dalbumId(Integer.valueOf(dalbumId))
                .adminId(Integer.valueOf(dalbum.getAdminId()))
                .artistId(dalbum.getArtistId())
                .artwork(artworks)
                .tracks(tracks).dextras(dextras)
                .embeddedMediaList(embeddedMediaList).build();

    }

}

/**
 * 
 */
package com.dalbum.data.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * @author surajbelvadi
 *
 */
@Data 
@Builder
public class DalbumPackageInfo {

    private int dalbumId;
    private int adminId;
    private int artistId;
    private List<DalbumMedia> tracks;
    private List<DalbumMedia> artwork;
    private List<DalbumMedia> dextras;
    private List<DalbumMedia> embeddedMediaList;
}

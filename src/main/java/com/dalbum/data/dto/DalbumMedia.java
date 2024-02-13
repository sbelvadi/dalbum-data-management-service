/**
 * 
 */
package com.dalbum.data.dto;

import java.util.Optional;

import lombok.Builder;
import lombok.Data;


/**
 * @author surajbelvadi
 *
 */
@Data 
@Builder
public class DalbumMedia {

    private String dalbumMediaId;
    private String name;
    
    private Optional<String> description;
    private Optional<String> type;
    private Optional<String> size;
    private Optional<String> path;
    
    
}

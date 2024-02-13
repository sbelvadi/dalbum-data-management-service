/**
 * 
 */
package com.dalbum.data.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dalbum.data.dto.DalbumPackageInfo;
import com.dalbum.data.service.DalbumInquiryService;

/**
 * @author surajbelvadi
 *
 */
@RestController
@RequestMapping("/api/v1/dalbum/inquiry")
public class DalbumInquiryController {

    private static Logger LOGGER = LoggerFactory.getLogger(DalbumInquiryController.class);
    
    @Autowired
    private DalbumInquiryService dalbumInquiryService;
    
    @GetMapping(value = "/dalbum-package-info")
    public ResponseEntity<DalbumPackageInfo> get(@RequestParam("dalbumId") String dalbumId) throws Exception{
       
        LOGGER.info("Dalbum Data Mgmt Svc: START: Retrieve Dalbum Package file [" +dalbumId+ "]");
        DalbumPackageInfo dalbumPackageInfo = this.dalbumInquiryService.getDalbumPackageInfo(dalbumId);
        LOGGER.info("Dalbum Data Mgmt Svc: END: Dalbum Package file {} has {} tracks, {} artwork ",dalbumId, dalbumPackageInfo.getTracks().size(), dalbumPackageInfo.getArtwork().size());
        return new ResponseEntity<DalbumPackageInfo>(dalbumPackageInfo, HttpStatus.OK);
        
        
    }
    
    @GetMapping(value = "/dalbum")
    public ResponseEntity<DalbumPackageInfo> getDalbum(@RequestParam("dalbumId") String dalbumId) throws Exception{
       
        LOGGER.info("Dalbum Data Mgmt Svc: START: Retrieve Dalbum Package file [" +dalbumId+ "]");
        DalbumPackageInfo dalbumPackageInfo = this.dalbumInquiryService.getDalbumPackageInfo(dalbumId);
        LOGGER.info("Dalbum Data Mgmt Svc: END: Dalbum Package file {} has {} tracks, {} artwork ",dalbumId, dalbumPackageInfo.getTracks().size(), dalbumPackageInfo.getArtwork().size());
        return new ResponseEntity<DalbumPackageInfo>(dalbumPackageInfo, HttpStatus.OK);
        
        
    }
}

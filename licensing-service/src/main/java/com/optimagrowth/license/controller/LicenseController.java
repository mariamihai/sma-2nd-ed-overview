package com.optimagrowth.license.controller;

import com.optimagrowth.license.model.License;
import com.optimagrowth.license.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/organization/{organizationId}/license")
public class LicenseController {

    private LicenseService licenseService;

    @Autowired
    public LicenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @GetMapping("/{licenseId}")
    public ResponseEntity<License> getLicense(@PathVariable String organizationId,
                                              @PathVariable String licenseId) {
        return ResponseEntity.ok(licenseService.getLicense(licenseId, organizationId));
    }


    @PostMapping
    public ResponseEntity<License> createLicense(@PathVariable String organizationId,
                                                 @RequestBody License license) {
        return ResponseEntity.ok(licenseService.createLicense(license, organizationId));
    }


    @PutMapping
    public ResponseEntity<License> updatetLicense(@PathVariable String organizationId,
                                                  @RequestBody License license) {
        return ResponseEntity.ok(licenseService.updateLicense(license, organizationId));
    }


    @DeleteMapping("/{licenseId}")
    public ResponseEntity<License> deleteLicense(@PathVariable String organizationId,
                                                 @PathVariable String licenseId) {
        return ResponseEntity.ok(licenseService.deleteLicense(licenseId, organizationId));
    }
}

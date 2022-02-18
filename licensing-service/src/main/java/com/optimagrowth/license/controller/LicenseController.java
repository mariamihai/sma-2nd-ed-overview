package com.optimagrowth.license.controller;

import com.optimagrowth.license.model.License;
import com.optimagrowth.license.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

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
                                              @PathVariable String licenseId,
                                              @RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        return ResponseEntity.ok(licenseService.getLicense(licenseId, organizationId, locale));
    }


    @PostMapping
    public ResponseEntity<License> createLicense(@PathVariable String organizationId,
                                                 @RequestBody License license,
                                                 @RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        return ResponseEntity.ok(licenseService.createLicense(license, organizationId, locale));
    }


    @PutMapping
    public ResponseEntity<License> updatetLicense(@PathVariable String organizationId,
                                                  @RequestBody License license,
                                                  @RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        return ResponseEntity.ok(licenseService.updateLicense(license, organizationId, locale));
    }


    @DeleteMapping("/{licenseId}")
    public ResponseEntity<License> deleteLicense(@PathVariable String organizationId,
                                                 @PathVariable String licenseId,
                                                 @RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        return ResponseEntity.ok(licenseService.deleteLicense(licenseId, organizationId, locale));
    }
}

package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {

    // GET
    public License getLicense(String licenseId, String organizationId) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(licenseId)
                .organizationId(organizationId)
                .productName("O-Stock")
                .description("Software product")
                .licenseType("full")
                .build();
    }

    // POST
    public License createLicense(License license, String organizationId) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(license.getLicenseId())
                .organizationId(organizationId)
                .productName(license.getProductName())
                .description(license.getDescription())
                .licenseType(license.getLicenseType())
                .build();
    }


    // PUT
    public License updateLicense(License license, String organizationId) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(license.getLicenseId())
                .organizationId(organizationId)
                .productName(license.getProductName())
                .description(license.getDescription())
                .licenseType(license.getLicenseType())
                .build();
    }

    // DELETE
    public License deleteLicense(String licenseId, String organizationId) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(licenseId)
                .organizationId(organizationId)
                .productName("O-Stock")
                .description("Software product")
                .licenseType("full")
                .build();
    }
}

package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;

@Service
public class LicenseService {

    private MessageSource messages;

    @Autowired
    public LicenseService(MessageSource messages) {
        this.messages = messages;
    }

    // GET
    public License getLicense(String licenseId, String organizationId, Locale locale) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(licenseId)
                .organizationId(organizationId)
                .productName("O-Stock")
                .description("Software product")
                .licenseType(translateLicenseType("full", locale))
                .build();
    }

    // POST
    public License createLicense(License license, String organizationId, Locale locale) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(license.getLicenseId())
                .organizationId(organizationId)
                .productName(license.getProductName())
                .description(license.getDescription())
                .licenseType(translateLicenseType("full", locale))
                .build();
    }


    // PUT
    public License updateLicense(License license, String organizationId, Locale locale) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(license.getLicenseId())
                .organizationId(organizationId)
                .productName(license.getProductName())
                .description(license.getDescription())
                .licenseType(translateLicenseType("full", locale))
                .build();
    }

    // DELETE
    public License deleteLicense(String licenseId, String organizationId, Locale locale) {
        return License.builder()
                .id(new Random().nextInt(1000))
                .licenseId(licenseId)
                .organizationId(organizationId)
                .productName("O-Stock")
                .description("Software product")
                .licenseType(translateLicenseType("full", locale))
                .build();
    }

    private String translateLicenseType(String type, Locale locale) {
        return messages.getMessage("license.type." + type, null, locale);
    }
}

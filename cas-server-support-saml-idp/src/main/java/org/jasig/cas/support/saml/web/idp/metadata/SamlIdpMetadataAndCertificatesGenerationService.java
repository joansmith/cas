package org.jasig.cas.support.saml.web.idp.metadata;

import java.io.File;

/**
 * This is {@link SamlIdpMetadataAndCertificatesGenerationService},
 * responsible for generating metadata and required certificates for signing and encryption.
 *
 * @author Misagh Moayyed
 * @since 4.3.0
 */
public interface SamlIdpMetadataAndCertificatesGenerationService {

    /**
     * Perform the metadata generation steps.
     *
     * @return the metadata file
     */
    File performGenerationSteps();
}

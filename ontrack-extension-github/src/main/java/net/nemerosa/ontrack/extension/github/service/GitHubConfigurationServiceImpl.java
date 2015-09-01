package net.nemerosa.ontrack.extension.github.service;

import net.nemerosa.ontrack.extension.github.model.GitHubEngineConfiguration;
import net.nemerosa.ontrack.extension.support.AbstractConfigurationService;
import net.nemerosa.ontrack.model.events.EventFactory;
import net.nemerosa.ontrack.model.events.EventPostService;
import net.nemerosa.ontrack.model.security.EncryptionService;
import net.nemerosa.ontrack.model.security.SecurityService;
import net.nemerosa.ontrack.model.support.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GitHubConfigurationServiceImpl extends AbstractConfigurationService<GitHubEngineConfiguration> implements GitHubConfigurationService {

    @Autowired
    public GitHubConfigurationServiceImpl(ConfigurationRepository configurationRepository, SecurityService securityService, EncryptionService encryptionService, EventPostService eventPostService, EventFactory eventFactory) {
        super(GitHubEngineConfiguration.class, configurationRepository, securityService, encryptionService, eventPostService, eventFactory);
    }

}

package net.nemerosa.ontrack.extension.svn.property;

import lombok.Data;
import net.nemerosa.ontrack.extension.svn.model.SVNConfiguration;
import net.nemerosa.ontrack.model.support.ConfigurationProperty;

/**
 * Associates a {@link net.nemerosa.ontrack.model.structure.Project} with a
 * {@link net.nemerosa.ontrack.extension.svn.model.SVNConfiguration}.
 */
@Data
public class SVNProjectConfigurationProperty implements ConfigurationProperty<SVNConfiguration> {

    /**
     * Link to the SVN configuration
     */
    private final SVNConfiguration configuration;

    /**
     * Path of the main project branch (trunk) in this configuration. The path is relative to the root
     * of the repository.
     */
    private final String projectPath;

    /**
     * Derived property: the full URL to the Subversion URL.
     */
    public String getUrl() {
        return configuration.getUrl(projectPath);
    }

}

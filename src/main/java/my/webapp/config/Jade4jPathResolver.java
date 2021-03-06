package my.webapp.config;

import javax.enterprise.inject.Specializes;
import javax.inject.Inject;

import br.com.caelum.vraptor.http.FormatResolver;
import br.com.caelum.vraptor.view.DefaultPathResolver;

@Specializes
public class Jade4jPathResolver extends DefaultPathResolver {
	
	@Inject
    public Jade4jPathResolver(FormatResolver resolver) {
        super(resolver);
    }
	
	@Override
    protected String getPrefix() {
        return AppConfig.NAME_DIRECTORY_HTML_FILES;
    }

	@Override
    protected String getExtension() {
        return AppConfig.EXTENSION_FILES;
    }
}
package my.webapp.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import de.neuland.jade4j.Jade4J;
import my.webapp.bean.Book;
import my.webapp.config.AppConfig;

@Controller
public class ClientsController {
	
	private static final String JADE_DIR = AppConfig.NAME_DIRECTORY_HTML_FILES + "clients" + File.separator;
	
	@Inject
    private Result result;
	
	@Inject
	private ServletContext context;
	
    public void add() throws Exception {
    	
    	List<Book> books = new ArrayList<Book>();
    	books.add(new Book("The Hitchhiker's Guide to the Galaxy", 5.70, true));
    	books.add(new Book("Life, the Universe and Everything", 5.60, false));
    	books.add(new Book("The Restaurant at the End of the Universe", 5.40, true));

    	Map<String, Object> model = new HashMap<String, Object>();
    	model.put("books", books);
    	model.put("pageName", "My Bookshelf");
    	
    	String fullPathFile = context.getRealPath(JADE_DIR + new Object(){}.getClass().getEnclosingMethod().getName() + "." + AppConfig.EXTENSION_FILES);
    	result.use(Results.http()).body(Jade4J.render(fullPathFile, model));
    }
    
}
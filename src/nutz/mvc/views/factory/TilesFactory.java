package nutz.mvc.views.factory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.tiles.TilesApplicationContext;
import org.apache.tiles.context.TilesRequestContextFactory;
import org.apache.tiles.definition.DefinitionsFactoryException;
import org.apache.tiles.factory.BasicTilesContainerFactory;

public class TilesFactory extends BasicTilesContainerFactory {

	@Override
	protected List<URL> getSourceURLs(TilesApplicationContext context,
			TilesRequestContextFactory factory) {
		List<URL> list = new ArrayList<URL>();
		try {
			list.add(context.getResource("/WEB-INF/classes/tiles-defs.xml"));
		} catch (IOException e) {
			e.printStackTrace();
			throw new DefinitionsFactoryException("load tiles-defs.xml error: " + e.getMessage());
		}
		return list;
	}
	
}

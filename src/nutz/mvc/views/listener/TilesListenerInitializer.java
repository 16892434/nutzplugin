package nutz.mvc.views.listener;

import nutz.mvc.views.factory.TilesFactory;

import org.apache.tiles.TilesApplicationContext;
import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.startup.AbstractTilesInitializer;

public class TilesListenerInitializer extends AbstractTilesInitializer {

	@Override
	protected AbstractTilesContainerFactory createContainerFactory(
			TilesApplicationContext context) {
		return new TilesFactory();
	}

}

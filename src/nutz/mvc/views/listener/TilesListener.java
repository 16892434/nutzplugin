package nutz.mvc.views.listener;

import org.apache.tiles.startup.TilesInitializer;
import org.apache.tiles.web.startup.AbstractTilesListener;


public class TilesListener extends AbstractTilesListener {

	@Override
	protected TilesInitializer createTilesInitializer() {
		return new TilesListenerInitializer();
	}

}

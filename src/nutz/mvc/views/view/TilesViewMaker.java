package nutz.mvc.views.view;

import org.nutz.ioc.Ioc;
import org.nutz.mvc.View;
import org.nutz.mvc.ViewMaker;

public class TilesViewMaker implements ViewMaker {

	@Override
	public View make(Ioc ioc, String type, String value) {
		if("tiles".equalsIgnoreCase(type)) {
			return new TilesView(value);
		}
		return null;
	}

}

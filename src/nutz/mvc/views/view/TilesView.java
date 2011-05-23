package nutz.mvc.views.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.servlet.context.ServletUtil;
import org.nutz.mvc.View;

public class TilesView implements View {

	private String viewName;
	
	public TilesView() {}
	public TilesView(String viewName) {
		this.viewName = viewName;
	}
	
	@Override
	public void render(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Throwable {
		request.setAttribute("obj", obj);
		TilesContainer container = ServletUtil.getContainer(request.getSession().getServletContext());
		container.render(viewName, request, response);
	}

}

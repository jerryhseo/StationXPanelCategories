package osp.panel.category.application.list;

import osp.panel.category.constants.StationXPanelCategoryKeys;

import com.liferay.application.list.BaseJSPPanelCategory;
import com.liferay.application.list.BasePanelCategory;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.util.Locale;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

/**
 * @author DELL
 */
@Component(
	immediate = true,
	property = {
		"panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION,
		"panel.category.order:Integer=100"
	},
	service = PanelCategory.class
)
public class StationXPanelCategory extends BaseJSPPanelCategory {

	@Override
	public String getKey() {
		return StationXPanelCategoryKeys.STATION_X;
	}

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());

		return LanguageUtil.get(resourceBundle, "station.x");
	}

	@Override
	public String getJspPath() {
		return null;
	}

}
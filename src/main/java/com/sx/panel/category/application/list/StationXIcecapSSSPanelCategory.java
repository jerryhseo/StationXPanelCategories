package com.sx.panel.category.application.list;

import com.liferay.application.list.BaseJSPPanelCategory;
import com.liferay.application.list.PanelCategory;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.sx.panel.category.constants.StationXPanelCategoryKeys;

import java.util.Locale;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

/**
 * @author DELL
 */
@Component(
	immediate = true,
	property = {
		"panel.category.key=" + StationXPanelCategoryKeys.ICECAP,
		"panel.category.order:Integer=100"
	},
	service = PanelCategory.class
)
public class StationXIcecapSSSPanelCategory extends BaseJSPPanelCategory {

	@Override
	public String getKey() {
		return StationXPanelCategoryKeys.ICECAP_SSS;
	}

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());

		return LanguageUtil.get(resourceBundle, "station.x.icecap.sss");
	}

	@Override
	public String getJspPath() {
		return null;
	}

}
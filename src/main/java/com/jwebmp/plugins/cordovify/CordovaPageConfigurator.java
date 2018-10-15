/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.cordovify;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Cordova/PhoneGap",
		pluginUniqueName = "jwebswing-cordova-plugin",
		pluginDescription = "Instantly switch to cordova for hybrid apps",
		pluginVersion = "0.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "cordova, mobile, hybrid",
		pluginSubtitle = "Integrate Cordova Plugins instantly with this guy",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Cordovify",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-Cordovify",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Cordovify/wiki",
		pluginOriginalHomepage = "https://cordova.io",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/Cordovify.jar/download",
		pluginIconUrl = "bower_components/radial-svg-slider-jwebswing/example.png",
		pluginIconImageUrl = "bower_components/radial-svg-slider-jwebswing/example.png",
		pluginLastUpdatedDate = "2017/09/22")
public class CordovaPageConfigurator
		implements IPageConfigurator<CordovaPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return CordovaPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		CordovaPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			Page p = page;
			p.getBody()
			 .addJavaScriptReference(new JavascriptReference("Cordova JS ", 1.0, "cordova/browser/cordova.js"));
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return CordovaPageConfigurator.enabled;
	}

}

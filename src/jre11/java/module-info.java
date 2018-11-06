import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.cordovify.CordovaPageConfigurator;

module com.jwebmp.plugins.cordovify {
	exports com.jwebmp.plugins.cordovify;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;

	provides IPageConfigurator with CordovaPageConfigurator;

}

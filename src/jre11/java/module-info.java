module com.jwebmp.plugins.cordovify {
	exports com.jwebmp.plugins.cordovify;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.cordovify.CordovaPageConfigurator;

}

package in.haridas.servlet;

import com.google.inject.AbstractModule;
import in.haridas.camel.route.HelloWorldRoute;
import org.apache.camel.guice.CamelModuleWithMatchingRoutes;

/**
 * Created by haridasn on 25/7/15.
 */
public class GuiceRouteModule extends CamelModuleWithMatchingRoutes {
    @Override
    protected void configure() {
        super.configure();
        bind(HelloWorldRoute.class);
    }
}

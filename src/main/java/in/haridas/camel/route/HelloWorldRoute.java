package in.haridas.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.ProcessorEndpoint;

/**
 * Created by haridas on 12/7/15.
 */
public class HelloWorldRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("servlet:///helloworld?matchOnUriPrefix=true")
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                exchange.getIn().setBody("Hello World !");
            }
        });
    }
}

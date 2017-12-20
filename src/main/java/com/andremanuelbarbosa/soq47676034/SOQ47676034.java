package com.andremanuelbarbosa.soq47676034;

import com.fasterxml.jackson.databind.DeserializationFeature;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SOQ47676034 extends Application<SOQ47676034Configuration> {

    @Override
    public void initialize(Bootstrap<SOQ47676034Configuration> bootstrap) {

        bootstrap.getObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Override
    public void run(SOQ47676034Configuration soq47676034Configuration, Environment environment) throws Exception {

        environment.jersey().register(new SOQ47676034Api());
    }

    public static void main(String[] args) throws Exception {

        new SOQ47676034().run(args);
    }
}

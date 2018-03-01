package io.github.jklingsporn.vertx.jooq.generate.rx;

import io.github.jklingsporn.vertx.jooq.generate.builder.DelegatingVertxGeneratorStrategy;
import io.github.jklingsporn.vertx.jooq.generate.builder.VertxGeneratorStrategyBuilder;

/**
 * Created by jensklingsporn on 06.02.18.
 */
public class JDBCRXVertxGeneratorStrategy extends DelegatingVertxGeneratorStrategy{

    public JDBCRXVertxGeneratorStrategy() {
        super(VertxGeneratorStrategyBuilder.init().withRXAPI().withJDBCDriver().build());
    }
}

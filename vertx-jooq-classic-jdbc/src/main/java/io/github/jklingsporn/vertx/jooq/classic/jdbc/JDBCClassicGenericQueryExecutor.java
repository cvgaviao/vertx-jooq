package io.github.jklingsporn.vertx.jooq.classic.jdbc;

import io.github.jklingsporn.vertx.jooq.classic.ClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.DatabaseResult;
import io.github.jklingsporn.vertx.jooq.shared.internal.jdbc.JDBCDatabaseResult;
import io.github.jklingsporn.vertx.jooq.shared.internal.jdbc.JDBCQueryExecutor;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.function.Function;

/**
 * Created by jensklingsporn on 05.02.18.
 */
public class JDBCClassicGenericQueryExecutor extends AbstractQueryExecutor implements JDBCQueryExecutor<Future<?>>, ClassicQueryExecutor{

    protected final Vertx vertx;

    public JDBCClassicGenericQueryExecutor(Configuration configuration, Vertx vertx) {
        super(configuration);
        this.vertx = vertx;
    }

    @Override
    public <X> Future<X> executeAny(Function<DSLContext, X> function){
        return executeBlocking(h -> h.complete(function.apply(DSL.using(configuration()))));
    }

    protected <X> Future<X> executeBlocking(Handler<Future<X>> blockingCodeHandler){
        Future<X> future = Future.future();
        vertx.executeBlocking(blockingCodeHandler,future);
        return future;
    }

    @Override
    public Future<Integer> exec(Function<DSLContext, Query> queryFunction) {
        return executeBlocking(h -> h.complete(createQuery(queryFunction).execute()));
    }

    @Override
    public <R extends Record> Future<DatabaseResult> query(Function<DSLContext, ResultQuery<R>> queryFunction) {
        return executeBlocking(h -> h.complete(new JDBCDatabaseResult(createQuery(queryFunction).fetch())));
    }
}

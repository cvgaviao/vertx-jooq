package generated.cf.reactive.guice.vertx.tables.mappers;

import com.julienviet.pgclient.Row;
import java.util.function.Function;

public class RowMappers {

    private RowMappers(){}

    public static Function<Row,generated.cf.reactive.guice.vertx.tables.pojos.Something> getSomethingMapper() {
        return row -> {
            generated.cf.reactive.guice.vertx.tables.pojos.Something pojo = new generated.cf.reactive.guice.vertx.tables.pojos.Something();
            pojo.setSomeid(row.getInteger("someId"));
            pojo.setSomestring(row.getString("someString"));
            pojo.setSomehugenumber(row.getLong("someHugeNumber"));
            // Omitting unrecognized type DataType [ t=smallint; p=16; s=0; u="pg_catalog"."int2"; j=null ] (java.lang.Short) for column someSmallNumber!
            pojo.setSomeregularnumber(row.getInteger("someRegularNumber"));
            pojo.setSomedouble(row.getDouble("someDouble"));
            pojo.setSomejsonobject(row.getJsonObject("someJsonObject"));
            pojo.setSomejsonarray(row.getJsonArray("someJsonArray"));
            pojo.setSometimestamp(row.getLocalDateTime("someTimestamp"));
            return pojo;
        };
    }

    public static Function<Row,generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite> getSomethingcompositeMapper() {
        return row -> {
            generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite pojo = new generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite();
            pojo.setSomeid(row.getInteger("someId"));
            pojo.setSomesecondid(row.getInteger("someSecondId"));
            pojo.setSomejsonobject(row.getJsonObject("someJsonObject"));
            return pojo;
        };
    }

    public static Function<Row,generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson> getSomethingwithoutjsonMapper() {
        return row -> {
            generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson pojo = new generated.cf.reactive.guice.vertx.tables.pojos.Somethingwithoutjson();
            pojo.setSomeid(row.getInteger("someId"));
            pojo.setSomestring(row.getString("someString"));
            return pojo;
        };
    }

}

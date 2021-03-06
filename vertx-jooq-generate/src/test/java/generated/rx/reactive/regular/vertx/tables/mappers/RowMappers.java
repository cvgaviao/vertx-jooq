package generated.rx.reactive.regular.vertx.tables.mappers;

import io.vertx.sqlclient.Row;
import java.util.function.Function;

public class RowMappers {

    private RowMappers(){}

    public static Function<Row,generated.rx.reactive.regular.vertx.tables.pojos.Something> getSomethingMapper() {
        return row -> {
            generated.rx.reactive.regular.vertx.tables.pojos.Something pojo = new generated.rx.reactive.regular.vertx.tables.pojos.Something();
            pojo.setSomeid(row.getInteger("someId"));
            pojo.setSomestring(row.getString("someString"));
            pojo.setSomehugenumber(row.getLong("someHugeNumber"));
            pojo.setSomesmallnumber(row.getShort("someSmallNumber"));
            pojo.setSomeregularnumber(row.getInteger("someRegularNumber"));
            pojo.setSomedouble(row.getDouble("someDouble"));
            pojo.setSomeenum(generated.rx.reactive.regular.vertx.enums.Someenum.valueOf(row.getString("someEnum")));
            pojo.setSomejsonobject(row.get(io.vertx.core.json.JsonObject.class,row.getColumnIndex("someJsonObject")));
            pojo.setSomecustomjsonobject(generated.rx.reactive.regular.vertx.tables.converters.Converters.IO_GITHUB_JKLINGSPORN_VERTX_JOOQ_GENERATE_CONVERTER_SOMEJSONPOJOCONVERTER_INSTANCE.pgConverter().from(row.get(io.vertx.core.json.JsonObject.class,row.getColumnIndex("someCustomJsonObject"))));
            pojo.setSomejsonarray(row.get(io.vertx.core.json.JsonArray.class,row.getColumnIndex("someJsonArray")));
            pojo.setSometimestamp(row.getLocalDateTime("someTimestamp"));
            return pojo;
        };
    }

    public static Function<Row,generated.rx.reactive.regular.vertx.tables.pojos.Somethingcomposite> getSomethingcompositeMapper() {
        return row -> {
            generated.rx.reactive.regular.vertx.tables.pojos.Somethingcomposite pojo = new generated.rx.reactive.regular.vertx.tables.pojos.Somethingcomposite();
            pojo.setSomeid(row.getInteger("someId"));
            pojo.setSomesecondid(row.getInteger("someSecondId"));
            pojo.setSomejsonobject(row.get(io.vertx.core.json.JsonObject.class,row.getColumnIndex("someJsonObject")));
            return pojo;
        };
    }

    public static Function<Row,generated.rx.reactive.regular.vertx.tables.pojos.Somethingwithoutjson> getSomethingwithoutjsonMapper() {
        return row -> {
            generated.rx.reactive.regular.vertx.tables.pojos.Somethingwithoutjson pojo = new generated.rx.reactive.regular.vertx.tables.pojos.Somethingwithoutjson();
            pojo.setSomeid(row.getInteger("someId"));
            pojo.setSomestring(row.getString("someString"));
            return pojo;
        };
    }

}

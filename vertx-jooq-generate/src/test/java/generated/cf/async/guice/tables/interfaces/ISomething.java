/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.guice.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISomething extends VertxPojo, Serializable {

    /**
     * Setter for <code>something.someId</code>.
     */
    public ISomething setSomeid(Integer value);

    /**
     * Getter for <code>something.someId</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>something.someString</code>.
     */
    public ISomething setSomestring(String value);

    /**
     * Getter for <code>something.someString</code>.
     */
    public String getSomestring();

    /**
     * Setter for <code>something.someHugeNumber</code>.
     */
    public ISomething setSomehugenumber(Long value);

    /**
     * Getter for <code>something.someHugeNumber</code>.
     */
    public Long getSomehugenumber();

    /**
     * Setter for <code>something.someSmallNumber</code>.
     */
    public ISomething setSomesmallnumber(Short value);

    /**
     * Getter for <code>something.someSmallNumber</code>.
     */
    public Short getSomesmallnumber();

    /**
     * Setter for <code>something.someRegularNumber</code>.
     */
    public ISomething setSomeregularnumber(Integer value);

    /**
     * Getter for <code>something.someRegularNumber</code>.
     */
    public Integer getSomeregularnumber();

    /**
     * Setter for <code>something.someDouble</code>.
     */
    public ISomething setSomedouble(Double value);

    /**
     * Getter for <code>something.someDouble</code>.
     */
    public Double getSomedouble();

    /**
     * Setter for <code>something.someEnum</code>.
     */
    public ISomething setSomeenum(String value);

    /**
     * Getter for <code>something.someEnum</code>.
     */
    public String getSomeenum();

    /**
     * Setter for <code>something.someJsonObject</code>.
     */
    public ISomething setSomejsonobject(JsonObject value);

    /**
     * Getter for <code>something.someJsonObject</code>.
     */
    public JsonObject getSomejsonobject();

    /**
     * Setter for <code>something.someJsonArray</code>.
     */
    public ISomething setSomejsonarray(JsonArray value);

    /**
     * Getter for <code>something.someJsonArray</code>.
     */
    public JsonArray getSomejsonarray();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISomething
     */
    public void from(generated.cf.async.guice.tables.interfaces.ISomething from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISomething
     */
    public <E extends generated.cf.async.guice.tables.interfaces.ISomething> E into(E into);

    @Override
    public default ISomething fromJson(io.vertx.core.json.JsonObject json) {
        setSomeid(json.getInteger("someId"));
        setSomestring(json.getString("someString"));
        setSomehugenumber(json.getLong("someHugeNumber"));
        setSomesmallnumber(json.getInteger("someSmallNumber")==null?null:json.getInteger("someSmallNumber").shortValue());
        setSomeregularnumber(json.getInteger("someRegularNumber"));
        setSomedouble(json.getDouble("someDouble"));
        setSomeenum(json.getString("someEnum"));
        setSomejsonobject(json.getJsonObject("someJsonObject"));
        setSomejsonarray(json.getJsonArray("someJsonArray"));
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("someId",getSomeid());
        json.put("someString",getSomestring());
        json.put("someHugeNumber",getSomehugenumber());
        json.put("someSmallNumber",getSomesmallnumber());
        json.put("someRegularNumber",getSomeregularnumber());
        json.put("someDouble",getSomedouble());
        json.put("someEnum",getSomeenum());
        json.put("someJsonObject",getSomejsonobject());
        json.put("someJsonArray",getSomejsonarray());
        return json;
    }

}

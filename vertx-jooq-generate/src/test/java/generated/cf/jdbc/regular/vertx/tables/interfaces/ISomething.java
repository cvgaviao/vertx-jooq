/*
 * This file is generated by jOOQ.
 */
package generated.cf.jdbc.regular.vertx.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISomething extends VertxPojo, Serializable {

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    public ISomething setSomeid(Integer value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    public ISomething setSomestring(String value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    public String getSomestring();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    public ISomething setSomehugenumber(Long value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    public Long getSomehugenumber();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    public ISomething setSomesmallnumber(Short value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    public Short getSomesmallnumber();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    public ISomething setSomeregularnumber(Integer value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    public Integer getSomeregularnumber();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    public ISomething setSomeboolean(Boolean value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    public Boolean getSomeboolean();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    public ISomething setSomedouble(Double value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    public Double getSomedouble();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    public ISomething setSomejsonobject(JsonObject value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    public JsonObject getSomejsonobject();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    public ISomething setSomejsonarray(JsonArray value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    public JsonArray getSomejsonarray();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    public ISomething setSometimestamp(LocalDateTime value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    public LocalDateTime getSometimestamp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISomething
     */
    public void from(ISomething from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISomething
     */
    public <E extends ISomething> E into(E into);

    @Override
    public default ISomething fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setSomeid(json.getInteger("SOMEID"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMEID","java.lang.Integer",e);
        }
        try {
            setSomestring(json.getString("SOMESTRING"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMESTRING","java.lang.String",e);
        }
        try {
            setSomehugenumber(json.getLong("SOMEHUGENUMBER"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMEHUGENUMBER","java.lang.Long",e);
        }
        try {
            setSomesmallnumber(json.getInteger("SOMESMALLNUMBER")==null?null:json.getInteger("SOMESMALLNUMBER").shortValue());
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMESMALLNUMBER","java.lang.Short",e);
        }
        try {
            setSomeregularnumber(json.getInteger("SOMEREGULARNUMBER"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMEREGULARNUMBER","java.lang.Integer",e);
        }
        try {
            setSomeboolean(json.getBoolean("SOMEBOOLEAN"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMEBOOLEAN","java.lang.Boolean",e);
        }
        try {
            setSomedouble(json.getDouble("SOMEDOUBLE"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMEDOUBLE","java.lang.Double",e);
        }
        try {
            setSomejsonobject(json.getJsonObject("SOMEJSONOBJECT"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMEJSONOBJECT","io.vertx.core.json.JsonObject",e);
        }
        try {
            setSomejsonarray(json.getJsonArray("SOMEJSONARRAY"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMEJSONARRAY","io.vertx.core.json.JsonArray",e);
        }
        try {
            // Omitting unrecognized type java.time.LocalDateTime for column SOMETIMESTAMP!
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("SOMETIMESTAMP","java.time.LocalDateTime",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("SOMEID",getSomeid());
        json.put("SOMESTRING",getSomestring());
        json.put("SOMEHUGENUMBER",getSomehugenumber());
        json.put("SOMESMALLNUMBER",getSomesmallnumber());
        json.put("SOMEREGULARNUMBER",getSomeregularnumber());
        json.put("SOMEBOOLEAN",getSomeboolean());
        json.put("SOMEDOUBLE",getSomedouble());
        json.put("SOMEJSONOBJECT",getSomejsonobject());
        json.put("SOMEJSONARRAY",getSomejsonarray());
        // Omitting unrecognized type java.time.LocalDateTime for column SOMETIMESTAMP!
        return json;
    }

}

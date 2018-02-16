/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.guice.tables;


import generated.cf.async.guice.DefaultSchema;
import generated.cf.async.guice.Indexes;
import generated.cf.async.guice.Keys;
import generated.cf.async.guice.tables.records.SomethingwithoutjsonRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Somethingwithoutjson extends TableImpl<SomethingwithoutjsonRecord> {

    private static final long serialVersionUID = 400936822;

    /**
     * The reference instance of <code>somethingWithoutJson</code>
     */
    public static final Somethingwithoutjson SOMETHINGWITHOUTJSON = new Somethingwithoutjson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingwithoutjsonRecord> getRecordType() {
        return SomethingwithoutjsonRecord.class;
    }

    /**
     * The column <code>somethingWithoutJson.someId</code>.
     */
    public final TableField<SomethingwithoutjsonRecord, Integer> SOMEID = createField("someId", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>somethingWithoutJson.someString</code>.
     */
    public final TableField<SomethingwithoutjsonRecord, String> SOMESTRING = createField("someString", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * Create a <code>somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson() {
        this(DSL.name("somethingWithoutJson"), null);
    }

    /**
     * Create an aliased <code>somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson(String alias) {
        this(DSL.name(alias), SOMETHINGWITHOUTJSON);
    }

    /**
     * Create an aliased <code>somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson(Name alias) {
        this(alias, SOMETHINGWITHOUTJSON);
    }

    private Somethingwithoutjson(Name alias, Table<SomethingwithoutjsonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Somethingwithoutjson(Name alias, Table<SomethingwithoutjsonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SOMETHINGWITHOUTJSON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SomethingwithoutjsonRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SOMETHINGWITHOUTJSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SomethingwithoutjsonRecord> getPrimaryKey() {
        return Keys.KEY_SOMETHINGWITHOUTJSON_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SomethingwithoutjsonRecord>> getKeys() {
        return Arrays.<UniqueKey<SomethingwithoutjsonRecord>>asList(Keys.KEY_SOMETHINGWITHOUTJSON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Somethingwithoutjson as(String alias) {
        return new Somethingwithoutjson(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Somethingwithoutjson as(Name alias) {
        return new Somethingwithoutjson(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingwithoutjson rename(String name) {
        return new Somethingwithoutjson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingwithoutjson rename(Name name) {
        return new Somethingwithoutjson(name, null);
    }
}

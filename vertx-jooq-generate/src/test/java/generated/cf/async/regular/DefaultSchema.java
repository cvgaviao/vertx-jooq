/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.regular;


import generated.cf.async.regular.tables.Something;
import generated.cf.async.regular.tables.Somethingcomposite;
import generated.cf.async.regular.tables.Somethingwithoutjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = -319261659;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>something</code>.
     */
    public final Something SOMETHING = generated.cf.async.regular.tables.Something.SOMETHING;

    /**
     * The table <code>somethingComposite</code>.
     */
    public final Somethingcomposite SOMETHINGCOMPOSITE = generated.cf.async.regular.tables.Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * The table <code>somethingWithoutJson</code>.
     */
    public final Somethingwithoutjson SOMETHINGWITHOUTJSON = generated.cf.async.regular.tables.Somethingwithoutjson.SOMETHINGWITHOUTJSON;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Something.SOMETHING,
            Somethingcomposite.SOMETHINGCOMPOSITE,
            Somethingwithoutjson.SOMETHINGWITHOUTJSON);
    }
}

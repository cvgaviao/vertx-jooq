/*
 * This file is generated by jOOQ.
 */
package generated.cf.jdbc.guice.vertx;


import generated.cf.jdbc.guice.DefaultCatalog;
import generated.cf.jdbc.guice.vertx.tables.Something;
import generated.cf.jdbc.guice.vertx.tables.Somethingcomposite;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Vertx extends SchemaImpl {

    private static final long serialVersionUID = -792271344;

    /**
     * The reference instance of <code>VERTX</code>
     */
    public static final Vertx VERTX = new Vertx();

    /**
     * The table <code>VERTX.SOMETHING</code>.
     */
    public final Something SOMETHING = Something.SOMETHING;

    /**
     * The table <code>VERTX.SOMETHINGCOMPOSITE</code>.
     */
    public final Somethingcomposite SOMETHINGCOMPOSITE = Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * No further instances allowed
     */
    private Vertx() {
        super("VERTX", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Something.SOMETHING,
            Somethingcomposite.SOMETHINGCOMPOSITE);
    }
}

/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.regular;


import generated.classic.reactive.regular.vertx.Vertx;

import java.util.Arrays;
import java.util.List;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -1910666444;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>vertx</code>.
     */
    public final Vertx VERTX = Vertx.VERTX;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.<Schema>asList(
            Vertx.VERTX);
    }
}

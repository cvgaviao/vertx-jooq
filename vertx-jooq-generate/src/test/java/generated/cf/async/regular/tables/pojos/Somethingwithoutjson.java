/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.regular.tables.pojos;


import generated.cf.async.regular.tables.interfaces.ISomethingwithoutjson;

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
public class Somethingwithoutjson implements ISomethingwithoutjson {

    private static final long serialVersionUID = -1287319295;

    private Integer someid;
    private String  somestring;

    public Somethingwithoutjson() {}

    public Somethingwithoutjson(Somethingwithoutjson value) {
        this.someid = value.someid;
        this.somestring = value.somestring;
    }

    public Somethingwithoutjson(
        Integer someid,
        String  somestring
    ) {
        this.someid = someid;
        this.somestring = somestring;
    }

    @Override
    public Integer getSomeid() {
        return this.someid;
    }

    @Override
    public Somethingwithoutjson setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    @Override
    public String getSomestring() {
        return this.somestring;
    }

    @Override
    public Somethingwithoutjson setSomestring(String somestring) {
        this.somestring = somestring;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Somethingwithoutjson other = (Somethingwithoutjson) obj;
        if (someid == null) {
            if (other.someid != null)
                return false;
        }
        else if (!someid.equals(other.someid))
            return false;
        if (somestring == null) {
            if (other.somestring != null)
                return false;
        }
        else if (!somestring.equals(other.somestring))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.someid == null) ? 0 : this.someid.hashCode());
        result = prime * result + ((this.somestring == null) ? 0 : this.somestring.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Somethingwithoutjson (");

        sb.append(someid);
        sb.append(", ").append(somestring);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISomethingwithoutjson from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISomethingwithoutjson> E into(E into) {
        into.from(this);
        return into;
    }

    public Somethingwithoutjson(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

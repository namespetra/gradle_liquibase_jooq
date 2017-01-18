/*
 * This file is generated by jOOQ.
*/
package com.fna.learning.db.tables;


import com.fna.learning.db.Keys;
import com.fna.learning.db.Messaging;
import com.fna.learning.db.tables.records.DepartmentRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Department extends TableImpl<DepartmentRecord> {

    private static final long serialVersionUID = -91396503;

    /**
     * The reference instance of <code>messaging.department</code>
     */
    public static final Department DEPARTMENT = new Department();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DepartmentRecord> getRecordType() {
        return DepartmentRecord.class;
    }

    /**
     * The column <code>messaging.department.id</code>.
     */
    public final TableField<DepartmentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>messaging.department.name</code>.
     */
    public final TableField<DepartmentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>messaging.department</code> table reference
     */
    public Department() {
        this("department", null);
    }

    /**
     * Create an aliased <code>messaging.department</code> table reference
     */
    public Department(String alias) {
        this(alias, DEPARTMENT);
    }

    private Department(String alias, Table<DepartmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Department(String alias, Table<DepartmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Messaging.MESSAGING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DepartmentRecord> getPrimaryKey() {
        return Keys.KEY_DEPARTMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DepartmentRecord>> getKeys() {
        return Arrays.<UniqueKey<DepartmentRecord>>asList(Keys.KEY_DEPARTMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Department as(String alias) {
        return new Department(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Department rename(String name) {
        return new Department(name, null);
    }
}

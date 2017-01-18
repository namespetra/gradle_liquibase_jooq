/*
 * This file is generated by jOOQ.
*/
package com.fna.learning.db.tables.records;


import com.fna.learning.db.tables.Employee;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EmployeeRecord extends UpdatableRecordImpl<EmployeeRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1908350999;

    /**
     * Setter for <code>messaging.employee.id</code>.
     */
    public EmployeeRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>messaging.employee.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>messaging.employee.emp_name</code>.
     */
    public EmployeeRecord setEmpName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>messaging.employee.emp_name</code>.
     */
    public String getEmpName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>messaging.employee.dept</code>.
     */
    public EmployeeRecord setDept(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>messaging.employee.dept</code>.
     */
    public Integer getDept() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Employee.EMPLOYEE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Employee.EMPLOYEE.EMP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Employee.EMPLOYEE.DEPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmpName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDept();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeRecord value2(String value) {
        setEmpName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeRecord value3(Integer value) {
        setDept(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeRecord
     */
    public EmployeeRecord() {
        super(Employee.EMPLOYEE);
    }

    /**
     * Create a detached, initialised EmployeeRecord
     */
    public EmployeeRecord(Integer id, String empName, Integer dept) {
        super(Employee.EMPLOYEE);

        set(0, id);
        set(1, empName);
        set(2, dept);
    }
}

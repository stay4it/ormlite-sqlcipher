package com.stay4it.sample.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
@DatabaseTable
public class User implements Serializable {
    @DatabaseField(id = true)
    public String id;
    @DatabaseField
    public String name;
    @DatabaseField
    public int age;

    @Override
    public String toString() {
        return super.toString() + "\n" + "name:" + name + ",id:" + id + ",age:" + age;
    }
}

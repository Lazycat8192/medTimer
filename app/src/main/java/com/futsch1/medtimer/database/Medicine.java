package com.futsch1.medtimer.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Medicine {

    @PrimaryKey(autoGenerate = true)
    public int medicineId;

    @ColumnInfo(name = "medicineName")
    public String name;

    public Medicine(String name) {
        this.name = name;
    }

    public Medicine(String name, int id) {
        this.name = name;
        this.medicineId = id;
    }
}

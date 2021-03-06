package com.example.wintecwaiata;

import androidx.room.DatabaseView;

@DatabaseView("SELECT \n" +
        "    carving_description.carving_id,\n" +
        "    carving_description.description,\n" +
        "    multimedia.filename\n" +
        "FROM\n" +
        "    carving_description \n" +
        "        LEFT JOIN multimedia \n" +
        "        ON carving_description.multimedia_id = multimedia.id ")
public class CarvingDescriptionView {
    private int carving_id;
    private String description;
    private String filename;

    public CarvingDescriptionView(int carving_id, String description, String filename) {
        this.carving_id = carving_id;
        this.description = description;
        this.filename = filename;
    }

    public int getCarving_id() {
        return carving_id;
    }

    public String getDescription() {
        return description;
    }

    public String getFilename() {
        return filename;
    }
}

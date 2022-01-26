package com.queue;

public class DataMhs {
    private int id;
    private String name;
    private String npm;

    public DataMhs(int id, String name, String npm) {
        this.id = id;
        this.name = name;
        this.npm = npm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String price) {
        this.npm = price;
    }

    @Override
    public String toString() {
        return "DataMhs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", npm='" + npm + '\'' +
                '}';
    }
}

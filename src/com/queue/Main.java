package com.queue;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        DataMhs zamzam_ubaidilah = new DataMhs(1, "Zamzam Ubaidilah", "21552011057");
        DataMhs rifky_abdul_hanan = new DataMhs(2, "Rifky Abdul Hanan", "21552011052");
        DataMhs bayu_alam_pamungkas = new DataMhs(3, "Bayu Alam Pamungkas", "21552011044");
        DataMhs azis_banon_sanjaya = new DataMhs(4, "Azis Banon Sanjaya", "21552011453");
        DataMhs abdul_japar = new DataMhs(5, "Abdul Japar", "21552011039");

        queue.add(zamzam_ubaidilah);
        queue.add(rifky_abdul_hanan);
        queue.add(bayu_alam_pamungkas);
        queue.add(azis_banon_sanjaya);

        queue.remove();

        queue.add(abdul_japar);

        queue.printQueue();
    }
}

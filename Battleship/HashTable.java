package Battleship;

import java.util.Arrays;

public class HashTable {
    private int[] keys;
    private String[] values;
    private int size;

    public HashTable(int size) {
        this.size = size;
        keys = new int[size];
        values = new String[size];
        Arrays.fill(keys, -1);
    }

    private int hash(int key) {
        return key % size;
    }

    public void add(int key, String value) {
        int index = hash(key);
        while (keys[index] != -1) {
            index = (index + 1) % size;
        }
        keys[index] = key;
        values[index] = value;
    }

    public String getValue(int key) {
        int index = hash(key);
        while (keys[index] != key) {
            index = (index + 1) % size;
            if (keys[index] == -1) {
                return null;
            }
        }
        return values[index];
    }

    public void delete(int key) {
        int index = hash(key);
        while (keys[index] != key) {
            index = (index + 1) % size;
            if (keys[index] == -1) {
                return;
            }
        }
        keys[index] = -1;
        values[index] = null;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.add(1, "Value1");
        table.add(2, "Value2");
        table.add(3, "Value3");

        System.out.println("Value for key 1: " + table.getValue(1));
        System.out.println("Value for key 2: " + table.getValue(2));
        System.out.println("Value for key 3: " + table.getValue(3));

        table.delete(2);
        System.out.println("Value for key 2 after deletion: " + table.getValue(2));
    }
}

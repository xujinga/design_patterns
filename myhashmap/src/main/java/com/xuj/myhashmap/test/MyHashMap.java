package com.xuj.myhashmap.test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Author: XuJing
 * @Date: 2019/6/29 19:56
 */
public class MyHashMap<K, V> implements Map<K, V> {
    private MyEntry[] table;

    private Integer size = 0;

    static final Integer DEFAULT_TABLE_SIZE = 8;

    public MyHashMap(Integer size) {
        table = new MyEntry[size];
    }

    public MyHashMap() {
        this.table = new MyEntry[DEFAULT_TABLE_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        //计算hashcode
        int hash = hash(key);
        //hashcode % 数组的长度 计算下标识
        int index = indexOf(hash);

        //遍历链表
        MyEntry<K, V> entries = table[index];
        for (MyEntry<K, V> entry = entries; entry != null; entry = entries.next) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        //计算hashcode
        int hash = hash(key);
        //hashcode % 数组的长度 计算下标识
        int index = indexOf(hash);

        //遍历链表
        MyEntry<K, V> entries = table[index];
        for (MyEntry<K, V> entry = entries; entry != null; entry = entries.next) {
            if (entry.key.equals(key)) {
                V old = entry.value;
                entry.value = value;
                return old;
            }
        }
        addEntry(key, value, index, entries);
        return null;
    }

    private void addEntry(K key, V value, int index, MyEntry<K, V> entries) {
        //新建一个节点 并记录节点下一个值
        MyEntry<K, V> entry = new MyEntry<>(key, value, entries);
        //将新的节点放到table上
        table[index] = entry;
        //新增map大小
        size++;
    }

    private int indexOf(int hash) {
        return hash % table.length;
    }

    private int hash(Object key) {
        return key.hashCode();
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return null;
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> action) {

    }

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {

    }

    @Override
    public V putIfAbsent(K key, V value) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return false;
    }

    @Override
    public V replace(K key, V value) {
        return null;
    }

    @Override
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        return null;
    }

    @Override
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return null;
    }

    @Override
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return null;
    }

    @Override
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return null;
    }

    class MyEntry<K, V> implements Entry<K, V> {

        private K key;

        private V value;

        private MyEntry<K, V> next;

        public MyEntry(K key, V value, MyEntry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            return null;
        }
    }

}

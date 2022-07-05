package org.netbrace.common;

import org.netbrace.api.utils.DataFunction;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * this doc was created on 05.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public class DataFunctionImpl< K , T > implements DataFunction< K , T > {
    private final LinkedList<K> _keys = new LinkedList<K>();
    private final LinkedList<LinkedList<T>> _values = new LinkedList<LinkedList<T>>();

    public void insert(K key, T value) {
        if (this._keys.contains(key)) {
            int sizeOf = _keys.indexOf(key);
            _values.get(sizeOf).add(value);
        } else {
            this._keys.add(key);
            this._values.add(new LinkedList<T>(Collections.singletonList(value)));
        }
    }

    public T get(K key, int i) {
        if (this._keys.contains(key)) {
            return _values.get(this.indexOf(key)).get(i);
        } else return null;
    }

    public List<T> get(K key) {
        if (this._keys.contains(key)) {
            return _values.get(this.indexOf(key));
        } else return null;
    }

    public boolean containsKey(K key) {
        return this._keys.contains(key);
    }

    public int size() {
        return this._keys.size();
    }

    public int sizeOf(K key) {
        if (this._keys.contains(key)) {
            return _values.get(this.indexOf(key)).size();
        } else return -1;
    }

    public int indexOf(K key) {
        return _keys.indexOf(key);
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    public boolean containsValue(T value) {
        return this._values.contains(value);
    }

    @Override
    public void remove(K key) {
        if (this._keys.contains(key)) {
            int index = this.indexOf(key);
            this._keys.remove(index);
            this._values.remove(index);
        }
    }

    @Override
    public void foreach(K key, Consumer<T> consumer) {
        if (this._keys.contains(key))
            for (T t : this._values.get(this.indexOf(key))) {
                consumer.accept(t);
            }
    }

    @Override
    public void clear() {
        this._keys.clear();
        this._values.clear();
    }

    @Override
    public DataFunction<K, T> filter(Predicate<DataFunction<K, T>> predicate) {
        return null;
    }
}

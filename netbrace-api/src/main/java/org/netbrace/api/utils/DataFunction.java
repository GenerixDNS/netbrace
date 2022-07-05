package org.netbrace.api.utils;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * this doc was created on 05.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public interface DataFunction< K , T > {

    void insert(K key, T value);

    T get(K key, int i);

    List<T> get(K key);

    boolean containsKey(K key);

    int size();

    int sizeOf(K key);

    int indexOf(K key);

    boolean containsValue(T value);

    void remove(K key);

    void foreach(K key, Consumer<T> consumer);

    void clear();

    DataFunction<K, T> filter(Predicate<DataFunction<K, T>> predicate);

}

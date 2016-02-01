package com.nxin.framework.functions;

/**
 * Created by petzold on 2015/11/2.
 */
public interface Predicate4<T1, T2, T3, T4> extends Predicate
{
    boolean accept(T1 t1, T2 t2, T3 t3, T4 t4);
}

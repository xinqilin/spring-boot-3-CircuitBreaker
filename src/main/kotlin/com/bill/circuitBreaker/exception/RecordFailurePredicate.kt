package com.bill.circuitBreaker.exception

import java.util.function.Predicate

/**
 * @author Bill.Lin 2024/6/29
 */
class RecordFailurePredicate : Predicate<Throwable> {

    override fun test(throwable: Throwable): Boolean {
        return throwable !is BusinessException
    }
}
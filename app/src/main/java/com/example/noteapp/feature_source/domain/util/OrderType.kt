package com.example.noteapp.feature_source.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}

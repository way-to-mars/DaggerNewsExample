package ru.way2mars.daggernewsexample.news_api

import android.annotation.SuppressLint
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

@Serializer(forClass = Date::class)
object DateSerializer : KSerializer<Date> {
    @SuppressLint("SimpleDateFormat")
    private val df: DateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ ")

    override fun deserialize(decoder: Decoder): Date {
        // TODO: How to parse null?
        return df.parse(decoder.decodeString())!!
    }

    override fun serialize(encoder: Encoder, value: Date) {
//        if (value == null)
//            encoder.encodeNull()
//        else
            encoder.encodeString(df.format(value))
    }


}
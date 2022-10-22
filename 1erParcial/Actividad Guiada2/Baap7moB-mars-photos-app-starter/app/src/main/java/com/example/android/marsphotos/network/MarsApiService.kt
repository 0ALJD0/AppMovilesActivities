package com.example.android.marsphotos.network

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.http.GET
//Defino la url base del servicio web
private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()
//Interfaz para obtener la dependencia photos
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos() : List<MarsPhoto>
}
//Creación del Objeto MarsApi usando Singlenton
object MarsApi {
    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
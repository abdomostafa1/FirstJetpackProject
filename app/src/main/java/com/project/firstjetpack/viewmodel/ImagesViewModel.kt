package com.project.firstjetpack.viewmodel

import androidx.lifecycle.ViewModel
import com.project.firstjetpack.model.MyImage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET


class ImagesViewModel : ViewModel() {

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://picsum.photos")
        .build()

    var imageService: ImageService = retrofit.create(ImageService::class.java)

    private val _state=MutableStateFlow<List<MyImage>>(listOf())
    val state=_state.asStateFlow()

}

interface ImageService{

    @GET("/v2/list")
    fun getImages():Call<List<MyImage>>
}
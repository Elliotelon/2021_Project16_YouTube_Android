package fastcampus.aop.part4.chapter01.service

import fastcampus.aop.part4.chapter01.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/b9ff4ff2-598c-43fd-9b73-bd4bb3b419de")
    fun listVideos(): Call<VideoDto>
}
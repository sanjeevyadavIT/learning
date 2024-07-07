package com.betatech.retrofit.data.remote

import com.google.gson.annotations.SerializedName

data class MarsPhoto(

	@SerializedName("id")
	val id: String? = null,

	@SerializedName("img_src")
	val imgSrc: String? = null
)

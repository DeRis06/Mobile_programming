package com.denis.portalberita

import com.google.gson.annotations.SerializedName

data class ResponsePortalBerita(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null
)

data class DataItem(

	@field:SerializedName("cover")
	val cover: String? = null,

	@field:SerializedName("gambar_tambahan")
	val gambarTambahan: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("id_news")
	val idNews: Int? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("kategori")
	val kategori: String? = null,

	@field:SerializedName("judul")
	val judul: String? = null,

	@field:SerializedName("deleted_at")
	val deletedAt: String? = null,

	@field:SerializedName("isi")
	val isi: String? = null,

	@field:SerializedName("username")
	val username: String? = null
)

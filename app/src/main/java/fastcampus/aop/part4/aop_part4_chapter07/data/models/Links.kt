package fastcampus.aop.part4.aop_part4_chapter07.data.models


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("download")
    val download: String?,
    @SerializedName("download_location")
    val downloadLocation: String?,
    @SerializedName("html")
    val html: String?,
    @SerializedName("self")
    val self: String?
)
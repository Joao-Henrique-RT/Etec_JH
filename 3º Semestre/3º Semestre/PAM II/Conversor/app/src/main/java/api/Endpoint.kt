package api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoint {
    @GET("last/{from}-{to}")
    fun getCurrencyRate(
        @Path(value = "from",encoded = true)from:String,
        @Path(value="to",encoded = true)to:String
        ): Call<JsonObject>









}
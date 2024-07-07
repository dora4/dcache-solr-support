package dora.cache.solr.service

import dora.http.retrofit.ApiService
import dora.cache.solr.SolrResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SolrService<T> : ApiService {

    @GET("/select")
    fun select(@Query("q") q: String) : Call<SolrResult<T>>
}
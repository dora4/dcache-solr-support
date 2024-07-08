package dora.cache.solr

data class SolrResponseHeader(
    var status: Int,
    var QTime: Int,
    var params: SolrParam? = null,
    var msg: String,
    var code: Int
)
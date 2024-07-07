package dora.cache.solr

data class SolrResponseHeader(
    var status: Int,
    var QTime: Int,
    var params: SolrParam,
    var msg: String,
    var code: Int
)
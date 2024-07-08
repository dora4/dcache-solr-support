package dora.cache.solr

data class SolrParam(
    var q: String? = null,
    var indent: Boolean? = null,
    var fq: String? = null,
    var sort: String? = null,
    var start: Long? = null,
    var rows: Long? = null,
    var fl: String? = null,
    var df: String? = null,
    var wt: String? = null,
)
package dora.cache.solr

data class SolrParam(
    var q: String,
    var indent: Boolean,
    var fq: String,
    var sort: String,
    var start: Long,
    var rows: Long,
    var fl: String,
    var df: String,
    var wt: String,
)
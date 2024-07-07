package dora.cache.solr

data class SolrResponse<T>(
    var numFound: Long,
    var start: Long,
    var numFoundExact: Boolean,
    var docs: MutableList<T>
)
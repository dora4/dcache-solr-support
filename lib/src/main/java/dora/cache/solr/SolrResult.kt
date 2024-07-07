package dora.cache.solr

data class SolrResult<T>(
    var responseHeader: SolrResponseHeader,
    var response: SolrResponse<T>
)
package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch-helper", "SearchResults")
@js.native
class SearchResults protected () extends js.Object {
  def this(state: SearchParameters, results: js.Array[_]) = this()
  var _rawResults: js.Any = js.native
  var _state: SearchParameters = js.native
  /**
    * The position if the position was guessed by IP.
    * @example "48.8637,2.3615",
    */
  var aroundLatLng: java.lang.String = js.native
  /**
    * The radius computed by Algolia.
    * @example "126792922",
    */
  var automaticRadius: java.lang.String = js.native
  /**
    * disjunctive facets results
    */
  var disjunctiveFacets: js.Array[algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs.Facet] = js.native
  /**
    * True if the counts of the facets is exhaustive
    */
  var exhaustiveFacetsCount: scala.Boolean = js.native
  /**
    * True if the number of hits is exhaustive
    */
  var exhaustiveNbHits: scala.Boolean = js.native
  /**
    * other facets results
    */
  var facets: js.Array[algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs.Facet] = js.native
  /**
    * disjunctive facets results
    */
  var hierarchicalFacets: js.Array[
    algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs.HierarchicalFacet
  ] = js.native
  /**
    * all the records that match the search parameters. Each record is
    * augmented with a new attribute `_highlightResult`
    * which is an object keyed by attribute and with the following properties:
    *  - `value` : the value of the facet highlighted (html)
    *  - `matchLevel`: full, partial or none depending on how the query terms match
    */
  var hits: js.Array[_] = js.native
  /**
    * number of hits per page requested
    */
  var hitsPerPage: scala.Double = js.native
  /**
    * index where the results come from
    */
  var index: java.lang.String = js.native
  /**
    * total number of hits of this query on the index
    */
  var nbHits: scala.Double = js.native
  /**
    * total number of pages with respect to the number of hits per page and the total number of hits
    */
  var nbPages: scala.Double = js.native
  /**
    * current page
    */
  var page: scala.Double = js.native
  /**
    * The query as parsed by the engine given all the rules.
    */
  var parsedQuery: java.lang.String = js.native
  /**
    * sum of the processing time of all the queries
    */
  var processingTimeMS: scala.Double = js.native
  /**
    * query used to generate the results
    */
  var query: java.lang.String = js.native
  /**
    * queryID is the unique identifier of the query used to generate the current search results.
    * This value is only available if the `clickAnalytics` search parameter is set to `true`.
    */
  var queryID: java.lang.String = js.native
  /**
    * String identifying the server used to serve this request.
    * @example "c7-use-2.algolia.net",
    */
  var serverUsed: java.lang.String = js.native
  /**
    * Boolean that indicates if the computation of the counts did time out.
    * @deprecated
    */
  var timeoutCounts: scala.Boolean = js.native
  /**
    * Boolean that indicates if the computation of the hits did time out.
    * @deprecated
    */
  var timeoutHits: scala.Boolean = js.native
  /**
    * Contains the userData if they are set by a [query rule](https://www.algolia.com/doc/guides/query-rules/query-rules-overview/).
    */
  var userData: js.Array[_] = js.native
  /**
    * Get a facet object with its name
    * @deprecated
    * @param name name of the faceted attribute
    * @return  the facet object
    */
  def getFacetByName(name: java.lang.String): algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs.Facet = js.native
  /**
    * Returns the facet stats if attribute is defined and the facet contains some.
    * Otherwise returns undefined.
    * @param attribute name of the faceted attribute
    * @return The stats of the facet
    */
  def getFacetStats(attribute: java.lang.String): js.Any = js.native
  /**
    * Get a the list of values for a given facet attribute. Those values are sorted
    * refinement first, descending count (bigger value on top), and name ascending
    * (alphabetical order). The sort formula can overridden using either string based
    * predicates or a function.
    *
    * This method will return all the values returned by the Algolia engine plus all
    * the values already refined. This means that it can happen that the
    * `maxValuesPerFacet` [configuration](https://www.algolia.com/doc/rest-api/search#param-maxValuesPerFacet)
    * might not be respected if you have facet values that are already refined.
    * @param attribute attribute name
    * @param opts configuration options.
    * @param opts.sortBy
    * When using strings, it consists of
    * the name of the [FacetValue](#SearchResults.FacetValue) or the
    * [HierarchicalFacet](#SearchResults.HierarchicalFacet) attributes with the
    * order (`asc` or `desc`). For example to order the value by count, the
    * argument would be `['count:asc']`.
    *
    * If only the attribute name is specified, the ordering defaults to the one
    * specified in the default value for this attribute.
    *
    * When not specified, the order is
    * ascending.  This parameter can also be a function which takes two facet
    * values and should return a number, 0 if equal, 1 if the first argument is
    * bigger or -1 otherwise.
    *
    * The default value for this attribute `['isRefined:desc', 'count:desc', 'name:asc']`
    * @return depending on the type of facet of
    * the attribute requested (hierarchical, disjunctive or conjunctive)
    * @example
    * helper.on('results', function(content){
    *   //get values ordered only by name ascending using the string predicate
    *   content.getFacetValues('city', {sortBy: ['name:asc']});
    *   //get values  ordered only by count ascending using a function
    *   content.getFacetValues('city', {
    *     // this is equivalent to ['count:asc']
    *     sortBy: function(a, b) {
    *       if (a.count === b.count) return 0;
    *       if (a.count > b.count)   return 1;
    *       if (b.count > a.count)   return -1;
    *     }
    *   });
    * });
    */
  def getFacetValues(attribute: java.lang.String, opts: js.Any): js.Array[algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs.FacetValue] | algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs.HierarchicalFacet = js.native
  /**
    * Returns all refinements for all filters + tags. It also provides
    * additional information: count and exhausistivity for each filter.
    *
    * See the [refinement type](#Refinement) for an exhaustive view of the available
    * data.
    *
    * @return all the refinements
    */
  def getRefinements(): js.Array[algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs.Refinement] = js.native
}


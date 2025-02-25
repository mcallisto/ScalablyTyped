package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
  	@default 'none'
  	- `bracket`: Parse arrays with bracket representation:
  		```
  		queryString.parse('foo[]=1&foo[]=2&foo[]=3', {arrayFormat: 'bracket'});
  		//=> {foo: ['1', '2', '3']}
  		```
  	- `index`: Parse arrays with index representation:
  		```
  		queryString.parse('foo[0]=1&foo[1]=2&foo[3]=3', {arrayFormat: 'index'});
  		//=> {foo: ['1', '2', '3']}
  		```
  	- `comma`: Parse arrays with elements separated by comma:
  		```
  		queryString.parse('foo=1,2,3', {arrayFormat: 'comma'});
  		//=> {foo: ['1', '2', '3']}
  		```
  	- `none`: Parse arrays with elements using duplicate keys:
  		```
  		queryString.parse('foo=1&foo=2&foo=3');
  		//=> {foo: ['1', '2', '3']}
  		```
  	*/
  val arrayFormat: js.UndefOr[
    queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.comma | queryDashStringLib.queryDashStringLibStrings.none
  ] = js.undefined
  /**
  	Decode the keys and values. URI components are decoded with [`decode-uri-component`](https://github.com/SamVerschueren/decode-uri-component).
  	@default true
  	*/
  val decode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	Parse the value as a boolean type instead of string type if it's a boolean.
  	@default false
  	@example
  	```
  	queryString.parse('foo=true', {parseBooleans: true});
  	//=> {foo: true}
  	```
  	*/
  val parseBooleans: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	Parse the value as a number type instead of string type if it's a number.
  	@default false
  	@example
  	```js
  	queryString.parse('foo=1', {parseNumbers: true});
  	//=> {foo: 1}
  	```
  	*/
  val parseNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	Supports both `Function` as a custom sorting function or `false` to disable sorting.
  	If omitted, keys are sorted using `Array#sort`, which means, converting them to strings and comparing strings in Unicode code point order.
  	@default true
  	@example
  	```
  	const order = ['c', 'a', 'b'];
  	queryString.parse('?a=one&b=two&c=three', {
  		sort: (itemLeft, itemRight) => order.indexOf(itemLeft) - order.indexOf(itemRight)
  	});
  	// => {c: 'three', a: 'one', b: 'two'}
  	```
  	queryString.parse('?a=one&c=three&b=two', {sort: false});
  	// => {a: 'one', c: 'three', b: 'two'}
  	```
  	*/
  val sort: js.UndefOr[
    (js.Function2[/* itemLeft */ java.lang.String, /* itemRight */ java.lang.String, scala.Double]) | queryDashStringLib.queryDashStringLibNumbers.`false`
  ] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    arrayFormat: queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.comma | queryDashStringLib.queryDashStringLibStrings.none = null,
    decode: js.UndefOr[scala.Boolean] = js.undefined,
    parseBooleans: js.UndefOr[scala.Boolean] = js.undefined,
    parseNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    sort: (js.Function2[/* itemLeft */ java.lang.String, /* itemRight */ java.lang.String, scala.Double]) | queryDashStringLib.queryDashStringLibNumbers.`false` = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(decode)) __obj.updateDynamic("decode")(decode)
    if (!js.isUndefined(parseBooleans)) __obj.updateDynamic("parseBooleans")(parseBooleans)
    if (!js.isUndefined(parseNumbers)) __obj.updateDynamic("parseNumbers")(parseNumbers)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}


package typings
package urijsLib.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URI extends js.Object {
  def absoluteTo(path: java.lang.String): URI = js.native
  def absoluteTo(path: URI): URI = js.native
  def addFragment(fragment: java.lang.String): URI = js.native
  def addQuery(qry: java.lang.String): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addQuery(qry: java.lang.String, value: js.Any): URI = js.native
  def addQuery(qry: js.Object): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addSearch(key: java.lang.String, value: js.Any): URI = js.native
  def addSearch(qry: java.lang.String): URI = js.native
  def addSearch(qry: js.Object): URI = js.native
  def authority(): java.lang.String = js.native
  def authority(authority: java.lang.String): URI = js.native
  def directory(): java.lang.String = js.native
  def directory(dir: java.lang.String): URI = js.native
  def directory(dir: scala.Boolean): java.lang.String = js.native
  def domain(): java.lang.String = js.native
  def domain(domain: java.lang.String): URI = js.native
  def domain(domain: scala.Boolean): java.lang.String = js.native
  def duplicateQueryParameters(`val`: scala.Boolean): URI = js.native
  def equals(): scala.Boolean = js.native
  def equals(url: java.lang.String): scala.Boolean = js.native
  def equals(url: URI): scala.Boolean = js.native
  def filename(): java.lang.String = js.native
  def filename(file: java.lang.String): URI = js.native
  def filename(file: scala.Boolean): java.lang.String = js.native
  def fragment(): java.lang.String = js.native
  def fragment(fragment: java.lang.String): URI = js.native
  def fragmentPrefix(prefix: java.lang.String): URI = js.native
  def hasQuery(name: /*string | */ js.Any): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: java.lang.String): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: java.lang.String, withinArray: scala.Boolean): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.Array[scala.Boolean | scala.Double | java.lang.String]): scala.Boolean = js.native
  def hasQuery(
    name: /*string | */ js.Any,
    value: js.Array[scala.Boolean | scala.Double | java.lang.String],
    withinArray: scala.Boolean
  ): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _]): scala.Boolean = js.native
  def hasQuery(
    name: /*string | */ js.Any,
    value: js.Function1[/* repeated */ js.Any, _],
    withinArray: scala.Boolean
  ): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: scala.Boolean): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: scala.Boolean, withinArray: scala.Boolean): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: scala.Double): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: scala.Double, withinArray: scala.Boolean): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: stdLib.RegExp): scala.Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: stdLib.RegExp, withinArray: scala.Boolean): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: java.lang.String): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: java.lang.String, withinArray: scala.Boolean): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.Array[scala.Boolean | scala.Double | java.lang.String]): scala.Boolean = js.native
  def hasSearch(
    name: /*string | */ js.Any,
    value: js.Array[scala.Boolean | scala.Double | java.lang.String],
    withinArray: scala.Boolean
  ): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _]): scala.Boolean = js.native
  def hasSearch(
    name: /*string | */ js.Any,
    value: js.Function1[/* repeated */ js.Any, _],
    withinArray: scala.Boolean
  ): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: scala.Boolean): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: scala.Boolean, withinArray: scala.Boolean): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: scala.Double): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: scala.Double, withinArray: scala.Boolean): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: stdLib.RegExp): scala.Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: stdLib.RegExp, withinArray: scala.Boolean): scala.Boolean = js.native
  def hash(): java.lang.String = js.native
  def hash(hash: java.lang.String): URI = js.native
  def host(): java.lang.String = js.native
  def host(host: java.lang.String): URI = js.native
  def hostname(): java.lang.String = js.native
  def hostname(hostname: java.lang.String): URI = js.native
  def href(): java.lang.String = js.native
  def href(url: java.lang.String): scala.Unit = js.native
  def is(
    qry: urijsLib.urijsLibStrings.relative | urijsLib.urijsLibStrings.absolute | urijsLib.urijsLibStrings.urn | urijsLib.urijsLibStrings.url | urijsLib.urijsLibStrings.domain | urijsLib.urijsLibStrings.name | urijsLib.urijsLibStrings.sld | urijsLib.urijsLibStrings.idn | urijsLib.urijsLibStrings.punycode | urijsLib.urijsLibStrings.ip | urijsLib.urijsLibStrings.ip4 | urijsLib.urijsLibStrings.ipv4 | urijsLib.urijsLibStrings.inet4 | urijsLib.urijsLibStrings.ip6 | urijsLib.urijsLibStrings.ipv6 | urijsLib.urijsLibStrings.inet6
  ): scala.Boolean = js.native
  def iso8859(): URI = js.native
  def normalize(): URI = js.native
  def normalizeFragment(): URI = js.native
  def normalizeHash(): URI = js.native
  def normalizeHostname(): URI = js.native
  def normalizePath(): URI = js.native
  def normalizePathname(): URI = js.native
  def normalizePort(): URI = js.native
  def normalizeProtocol(): URI = js.native
  def normalizeQuery(): URI = js.native
  def normalizeSearch(): URI = js.native
  def origin(): java.lang.String = js.native
  def origin(uri: java.lang.String): URI = js.native
  def origin(uri: URI): URI = js.native
  def password(): java.lang.String = js.native
  def password(pw: java.lang.String): URI = js.native
  def path(): java.lang.String = js.native
  def path(path: java.lang.String): URI = js.native
  def path(path: scala.Boolean): java.lang.String = js.native
  def pathname(): java.lang.String = js.native
  def pathname(path: java.lang.String): URI = js.native
  def pathname(path: scala.Boolean): java.lang.String = js.native
  def port(): java.lang.String = js.native
  def port(port: java.lang.String): URI = js.native
  def protocol(): java.lang.String = js.native
  def protocol(protocol: java.lang.String): URI = js.native
  def query(): java.lang.String = js.native
  def query(qry: java.lang.String): URI = js.native
  def query(qry: js.Object): URI = js.native
  def query(qry: scala.Boolean): js.Object = js.native
  def readable(): java.lang.String = js.native
  def relativeTo(path: java.lang.String): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeQuery(name: java.lang.String, value: java.lang.String): URI = js.native
  def removeQuery(qry: java.lang.String): URI = js.native
  def removeQuery(qry: js.Object): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeSearch(name: java.lang.String, value: java.lang.String): URI = js.native
  def removeSearch(qry: java.lang.String): URI = js.native
  def removeSearch(qry: js.Object): URI = js.native
  def resource(): java.lang.String = js.native
  def resource(resource: java.lang.String): URI = js.native
  def scheme(): java.lang.String = js.native
  def scheme(protocol: java.lang.String): URI = js.native
  def search(): java.lang.String = js.native
  def search(qry: java.lang.String): URI = js.native
  def search(qry: js.Object): URI = js.native
  def search(qry: scala.Boolean): js.Any = js.native
  def segment(): js.Array[java.lang.String] = js.native
  def segment(position: scala.Double): js.UndefOr[java.lang.String] = js.native
  def segment(position: scala.Double, level: java.lang.String): URI = js.native
  def segment(segments: java.lang.String): URI = js.native
  def segment(segments: js.Array[java.lang.String]): URI = js.native
  def segmentCoded(): js.Array[java.lang.String] = js.native
  def segmentCoded(position: scala.Double): java.lang.String = js.native
  def segmentCoded(position: scala.Double, level: java.lang.String): URI = js.native
  def segmentCoded(segments: java.lang.String): URI = js.native
  def segmentCoded(segments: js.Array[java.lang.String]): URI = js.native
  def setQuery(key: java.lang.String, value: java.lang.String): URI = js.native
  def setQuery(qry: js.Object): URI = js.native
  def setSearch(key: java.lang.String, value: java.lang.String): URI = js.native
  def setSearch(qry: js.Object): URI = js.native
  def subdomain(): java.lang.String = js.native
  def subdomain(subdomain: java.lang.String): URI = js.native
  def suffix(): java.lang.String = js.native
  def suffix(suffix: java.lang.String): URI = js.native
  def suffix(suffix: scala.Boolean): java.lang.String = js.native
  def tld(): java.lang.String = js.native
  def tld(tld: java.lang.String): URI = js.native
  def tld(tld: scala.Boolean): java.lang.String = js.native
  def unicode(): URI = js.native
  def userinfo(): java.lang.String = js.native
  def userinfo(userinfo: java.lang.String): URI = js.native
  def username(): java.lang.String = js.native
  def username(uname: java.lang.String): URI = js.native
}


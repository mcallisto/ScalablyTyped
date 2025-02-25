package typings
package screenfullLib.screenfullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Screenfull extends js.Object {
  /**
  		The element currently in fullscreen, otherwise `null`.
  		*/
  val element: stdLib.Element | scala.Null = js.native
  /**
  		Whether you are allowed to enter fullscreen. If your page is inside an `<iframe>` you will need to add a `allowfullscreen` attribute (+ `webkitallowfullscreen` and `mozallowfullscreen`).
  		@example
  		```
  		if (screenfull.enabled) {
  			screenfull.request();
  		}
  		```
  		*/
  val enabled: scala.Boolean = js.native
  /**
  		Whether fullscreen is active.
  		*/
  val isFullscreen: scala.Boolean = js.native
  /**
  		Exposes the raw properties (prefixed if needed) used internally.
  		*/
  var raw: RawEventNames = js.native
  /**
  		Brings you out of fullscreen.
  		@returns A promise that resolves after the element exits fullscreen.
  		*/
  def exit(): js.Promise[scala.Unit] = js.native
  /**
  		Remove a previously registered event listener.
  		@example
  		```
  		screenfull.off('change', callback);
  		```
  		*/
  def off(name: EventName, handler: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
  		Add a listener for when the browser switches in and out of fullscreen or when there is an error.
  		@example
  		```
  		// Detect fullscreen change
  		if (screenfull.enabled) {
  			screenfull.on('change', () => {
  				console.log('Am I fullscreen?', screenfull.isFullscreen ? 'Yes' : 'No');
  			});
  		}
  		// Detect fullscreen error
  		if (screenfull.enabled) {
  			screenfull.on('error', event => {
  				console.error('Failed to enable fullscreen', event);
  			});
  		}
  		```
  		*/
  def on(name: EventName, handler: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
  		Alias for `.on('change', function)`.
  		*/
  def onchange(handler: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
  		Alias for `.on('error', function)`.
  		*/
  def onerror(handler: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
  		Make an element fullscreen.
  		If your page is inside an `<iframe>` you will need to add a `allowfullscreen` attribute (+ `webkitallowfullscreen` and `mozallowfullscreen`).
  		Keep in mind that the browser will only enter fullscreen when initiated by user events like click, touch, key.
  		@param element - Default is `<html>`. If called with another element than the currently active, it will switch to that if it's a decendant.
  		@returns A promise that resolves after the element enters fullscreen.
  		@example
  		```
  		// Fullscreen the page
  		document.getElementById('button').addEventListener('click', () => {
  			if (screenfull.enabled) {
  				screenfull.request();
  			} else {
  				// Ignore or do something else
  			}
  		});
  		// Fullscreen an element
  		const el = document.getElementById('target');
  		document.getElementById('button').addEventListener('click', () => {
  			if (screenfull.enabled) {
  				screenfull.request(el);
  			}
  		});
  		// Fullscreen an element with jQuery
  		const target = $('#target')[0]; // Get DOM element from jQuery collection
  		$('#button').on('click', () => {
  			if (screenfull.enabled) {
  				screenfull.request(target);
  			}
  		});
  		```
  		*/
  def request(): js.Promise[scala.Unit] = js.native
  def request(element: stdLib.Element): js.Promise[scala.Unit] = js.native
  /**
  		Requests fullscreen if not active, otherwise exits.
  		@returns A promise that resolves after the element enters/exits fullscreen.
  		@example
  		```
  		// Toggle fullscreen on a image with jQuery
  		$('img').on('click', event => {
  			if (screenfull.enabled) {
  				screenfull.toggle(event.target);
  			}
  		});
  		```
  		*/
  def toggle(): js.Promise[scala.Unit] = js.native
  def toggle(element: stdLib.Element): js.Promise[scala.Unit] = js.native
}


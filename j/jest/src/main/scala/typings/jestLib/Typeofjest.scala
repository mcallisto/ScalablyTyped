package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofjest extends js.Object {
  /**
    * Provides a way to add Jasmine-compatible matchers into your Jest context.
    */
  def addMatchers(matchers: jestLib.jestMod.jasmineNs.CustomMatcherFactories): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Advances all timers by msToRun milliseconds. All pending "macro-tasks" that have been
    * queued via setTimeout() or setInterval(), and would be executed within this timeframe
    * will be executed.
    */
  def advanceTimersByTime(msToRun: scala.Double): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Disables automatic mocking in the module loader.
    */
  def autoMockOff(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Enables automatic mocking in the module loader.
    */
  def autoMockOn(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Clears the mock.calls and mock.instances properties of all mocks.
    * Equivalent to calling .mockClear() on every mocked function.
    */
  def clearAllMocks(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Removes any pending timers from the timer system. If any timers have
    * been scheduled, they will be cleared and will never have the opportunity
    * to execute in the future.
    */
  def clearAllTimers(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module, including all of the specificied module's dependencies.
    */
  def deepUnmock(moduleName: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Disables automatic mocking in the module loader.
    */
  def disableAutomock(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def doMock(moduleName: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  def doMock(moduleName: java.lang.String, factory: js.Function0[_]): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  def doMock(
    moduleName: java.lang.String,
    factory: js.Function0[_],
    options: jestLib.jestMod.jestNs.MockOptions
  ): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module from require() (e.g. that it should always return the real module).
    */
  def dontMock(moduleName: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Enables automatic mocking in the module loader.
    */
  def enableAutomock(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  def fn(): jestLib.jestMod.jestNs.Mock[_, _] = js.native
  def fn[T, Y /* <: js.Array[_] */](implementation: js.Function1[/* args */ Y, T]): jestLib.jestMod.jestNs.Mock[T, Y] = js.native
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  @JSName("fn")
  def fn_TYArray[T, Y /* <: js.Array[_] */](): jestLib.jestMod.jestNs.Mock[T, Y] = js.native
  /**
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  def genMockFromModule[T](moduleName: java.lang.String): T = js.native
  /**
    * Returns whether the given function is a mock function.
    */
  def isMockFunction(fn: js.Any): /* is jest.jest.jest.Mock<any, any> */ scala.Boolean = js.native
  /**
    * Creates a sandbox registry for the modules that are loaded inside the callback function..
    * This is useful to isolate specific modules for every test so that local module state doesn't conflict between tests.
    */
  def isolateModules(fn: js.Function0[scala.Unit]): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def mock(moduleName: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  def mock(moduleName: java.lang.String, factory: js.Function0[_]): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  def mock(
    moduleName: java.lang.String,
    factory: js.Function0[_],
    options: jestLib.jestMod.jestNs.MockOptions
  ): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    */
  def requireActual(moduleName: java.lang.String): js.Any = js.native
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    */
  def requireMock(moduleName: java.lang.String): js.Any = js.native
  /**
    * Resets the state of all mocks.
    * Equivalent to calling .mockReset() on every mocked function.
    */
  def resetAllMocks(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def resetModuleRegistry(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def resetModules(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * available since Jest 21.1.0
    * Restores all mocks back to their original value.
    * Equivalent to calling .mockRestore on every mocked function.
    * Beware that jest.restoreAllMocks() only works when mock was created with
    * jest.spyOn; other mocks will require you to manually restore them.
    */
  def restoreAllMocks(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Runs failed tests n-times until they pass or until the max number of retries is exhausted.
    * This only works with jest-circus!
    */
  def retryTimes(numRetries: scala.Double): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Exhausts tasks queued by setImmediate().
    */
  def runAllImmediates(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Exhausts the micro-task queue (usually interfaced in node via process.nextTick).
    */
  def runAllTicks(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Exhausts the macro-task queue (i.e., all tasks queued by setTimeout() and setInterval()).
    */
  def runAllTimers(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Executes only the macro-tasks that are currently pending (i.e., only the
    * tasks that have been queued by setTimeout() or setInterval() up to this point).
    * If any of the currently pending macro-tasks schedule new macro-tasks,
    * those new tasks will not be executed by this call.
    */
  def runOnlyPendingTimers(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * (renamed to `advanceTimersByTime` in Jest 21.3.0+) Executes only the macro
    * task queue (i.e. all tasks queued by setTimeout() or setInterval() and setImmediate()).
    */
  def runTimersToTime(msToRun: scala.Double): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Explicitly supplies the mock object that the module system should return
    * for the specified module.
    */
  def setMock[T](moduleName: java.lang.String, moduleExports: T): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Set the default timeout interval for tests and before/after hooks in milliseconds.
    * Note: The default timeout interval is 5 seconds if this method is not called.
    */
  def setTimeout(timeout: scala.Double): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  def spyOn[T /* <: js.Object */, M /* <: jestLib.jestMod.jestNs.FunctionPropertyNames[stdLib.Required[T]] */](`object`: T, method: M): jestLib.jestMod.jestNs.SpyInstance[
    stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    jestLib.jestMod.jestNs.ArgsType[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
  /**
    * Creates a mock function similar to jest.fn but also tracks calls to `object[methodName]`
    *
    * Note: By default, jest.spyOn also calls the spied method. This is different behavior from most
    * other test libraries.
    *
    * @example
    *
    * const video = require('./video');
    *
    * test('plays video', () => {
    *   const spy = jest.spyOn(video, 'play');
    *   const isPlaying = video.play();
    *
    *   expect(spy).toHaveBeenCalled();
    *   expect(isPlaying).toBe(true);
    *
    *   spy.mockReset();
    *   spy.mockRestore();
    * });
    */
  @JSName("spyOn")
  def spyOn_get[T /* <: js.Object */, M /* <: jestLib.jestMod.jestNs.NonFunctionPropertyNames[stdLib.Required[T]] */](`object`: T, method: M, accessType: jestLib.jestLibStrings.get): jestLib.jestMod.jestNs.SpyInstance[
    /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any, 
    js.Array[js.Any]
  ] = js.native
  @JSName("spyOn")
  def spyOn_set[T /* <: js.Object */, M /* <: jestLib.jestMod.jestNs.NonFunctionPropertyNames[stdLib.Required[T]] */](`object`: T, method: M, accessType: jestLib.jestLibStrings.set): jestLib.jestMod.jestNs.SpyInstance[
    scala.Unit, 
    js.Array[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
  /**
    * Indicates that the module system should never return a mocked version of
    * the specified module from require() (e.g. that it should always return the real module).
    */
  def unmock(moduleName: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Instructs Jest to use fake versions of the standard timer functions.
    */
  def useFakeTimers(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
  /**
    * Instructs Jest to use the real versions of the standard timer functions.
    */
  def useRealTimers(): /* import warning: ImportType.apply Failed type conversion: typeof jest */ js.Any = js.native
}


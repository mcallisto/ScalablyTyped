package typings
package rimrafLib.rimrafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chmod: js.UndefOr[rimrafLib.Anon_Callback] = js.undefined
  var chmodSync: js.UndefOr[rimrafLib.Fn_Mode] = js.undefined
  var disableGlob: js.UndefOr[scala.Boolean] = js.undefined
  var emfileWait: js.UndefOr[scala.Boolean] = js.undefined
  var glob: js.UndefOr[globLib.globMod.IOptions | rimrafLib.rimrafLibNumbers.`false`] = js.undefined
  var lstat: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* stats */ nodeLib.fsMod.Stats, 
        scala.Unit
      ], 
      scala.Unit
    ]) with rimrafLib.Typeoflstat
  ] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats]] = js.undefined
  var maxBusyTries: js.UndefOr[scala.Double] = js.undefined
  var readdir: js.UndefOr[rimrafLib.Anon_Buffer] = js.undefined
  var readdirSync: js.UndefOr[rimrafLib.Fn_Buffer] = js.undefined
  var rmdir: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit], 
      scala.Unit
    ]) with rimrafLib.Typeofrmdir
  ] = js.undefined
  var rmdirSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, scala.Unit]] = js.undefined
  var stat: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* stats */ nodeLib.fsMod.Stats, 
        scala.Unit
      ], 
      scala.Unit
    ]) with rimrafLib.Typeofstat
  ] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats]] = js.undefined
  var unlink: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit], 
      scala.Unit
    ]) with rimrafLib.Typeofunlink
  ] = js.undefined
  var unlinkSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chmod: rimrafLib.Anon_Callback = null,
    chmodSync: rimrafLib.Fn_Mode = null,
    disableGlob: js.UndefOr[scala.Boolean] = js.undefined,
    emfileWait: js.UndefOr[scala.Boolean] = js.undefined,
    glob: globLib.globMod.IOptions | rimrafLib.rimrafLibNumbers.`false` = null,
    lstat: (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* stats */ nodeLib.fsMod.Stats, 
        scala.Unit
      ], 
      scala.Unit
    ]) with rimrafLib.Typeoflstat = null,
    lstatSync: /* path */ nodeLib.fsMod.PathLike => nodeLib.fsMod.Stats = null,
    maxBusyTries: scala.Int | scala.Double = null,
    readdir: rimrafLib.Anon_Buffer = null,
    readdirSync: rimrafLib.Fn_Buffer = null,
    rmdir: (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit], 
      scala.Unit
    ]) with rimrafLib.Typeofrmdir = null,
    rmdirSync: /* path */ nodeLib.fsMod.PathLike => scala.Unit = null,
    stat: (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* stats */ nodeLib.fsMod.Stats, 
        scala.Unit
      ], 
      scala.Unit
    ]) with rimrafLib.Typeofstat = null,
    statSync: /* path */ nodeLib.fsMod.PathLike => nodeLib.fsMod.Stats = null,
    unlink: (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit], 
      scala.Unit
    ]) with rimrafLib.Typeofunlink = null,
    unlinkSync: /* path */ nodeLib.fsMod.PathLike => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chmod != null) __obj.updateDynamic("chmod")(chmod)
    if (chmodSync != null) __obj.updateDynamic("chmodSync")(chmodSync)
    if (!js.isUndefined(disableGlob)) __obj.updateDynamic("disableGlob")(disableGlob)
    if (!js.isUndefined(emfileWait)) __obj.updateDynamic("emfileWait")(emfileWait)
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (lstat != null) __obj.updateDynamic("lstat")(lstat)
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1(lstatSync))
    if (maxBusyTries != null) __obj.updateDynamic("maxBusyTries")(maxBusyTries.asInstanceOf[js.Any])
    if (readdir != null) __obj.updateDynamic("readdir")(readdir)
    if (readdirSync != null) __obj.updateDynamic("readdirSync")(readdirSync)
    if (rmdir != null) __obj.updateDynamic("rmdir")(rmdir)
    if (rmdirSync != null) __obj.updateDynamic("rmdirSync")(js.Any.fromFunction1(rmdirSync))
    if (stat != null) __obj.updateDynamic("stat")(stat)
    if (statSync != null) __obj.updateDynamic("statSync")(js.Any.fromFunction1(statSync))
    if (unlink != null) __obj.updateDynamic("unlink")(unlink)
    if (unlinkSync != null) __obj.updateDynamic("unlinkSync")(js.Any.fromFunction1(unlinkSync))
    __obj.asInstanceOf[Options]
  }
}


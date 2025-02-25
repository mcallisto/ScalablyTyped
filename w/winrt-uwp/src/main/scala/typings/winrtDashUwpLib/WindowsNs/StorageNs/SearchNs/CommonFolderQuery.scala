package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommonFolderQuery extends js.Object

/** Specifies how to group files into folders in the query results and determines whether the query is shallow or deep. Query results for deep queries include all files in all of the subfolders of the current folder, grouped into folders according to the specified option. */
@JSGlobal("Windows.Storage.Search.CommonFolderQuery")
@js.native
object CommonFolderQuery extends js.Object {
  /** A shallow list of the folders in the current folder, similar to the view that File Explorer provides. */
  @js.native
  sealed trait defaultQuery
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders by year based on the System.Music.AlbumTitle property of each file. Each folder will contain all (and only) files with identical values for System.Music.AlbumTitle. */
  @js.native
  sealed trait groupByAlbum
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.AlbumArtist property of each file. Each folder will contain all (and only) files with identical values for System.Music.AlbumArtist. */
  @js.native
  sealed trait groupByAlbumArtist
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.Artistproperty of each file. Each folder will contain all (and only) files with identical values for System.Music.Artist. */
  @js.native
  sealed trait groupByArtist
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Author property of each file. Each folder will represent one author, and contain all files whose System.Author vector contains that author. If a file lists multiple authors, it may appear in more than one of the resulting folders. */
  @js.native
  sealed trait groupByAuthor
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.Composer property of each file. Each folder will represent one composer, and contain all files whose System.Music.Composer vector contains that composer. If a file lists multiple composers, it may appear in more than one of the resulting folders. */
  @js.native
  sealed trait groupByComposer
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.Genre property of each file. Each folder will contain all (and only) files with identical values for System.Music.Genre. */
  @js.native
  sealed trait groupByGenre
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders by month based on the System.ItemDate property of each file. Each folder will contain all (and only) files that have values for System.ItemDate within the same month. */
  @js.native
  sealed trait groupByMonth
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders by year based on the System.Media.Year property of each file. Each folder will contain all (and only) files that have values for System.Media.Year within the same year. */
  @js.native
  sealed trait groupByPublishedYear
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders by rating (1 star, 2 stars, and so on) based on the System.Rating property of each file. Each folder will contain all (and only) files with identical values for System.Rating. */
  @js.native
  sealed trait groupByRating
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Keywords property of each file. Each folder will represent one tag, and contain all files whose System.Keywords vector contains that tag. If a file lists multiple tags in its System.Keywords vector, it may appear in more than one of the resulting folders. */
  @js.native
  sealed trait groupByTag
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders by type (for example, Word documents, text files, and so forth) based on the System.ItemTypeText property of each file. */
  @js.native
  sealed trait groupByType
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /** Group files into virtual folders by year based on the System.ItemDate property of each file. Each folder will contain all (and only) files that have values for System.ItemDate within the same year. */
  @js.native
  sealed trait groupByYear
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /* 0 */ val defaultQuery: defaultQuery with scala.Double = js.native
  /* 4 */ val groupByAlbum: groupByAlbum with scala.Double = js.native
  /* 5 */ val groupByAlbumArtist: groupByAlbumArtist with scala.Double = js.native
  /* 3 */ val groupByArtist: groupByArtist with scala.Double = js.native
  /* 11 */ val groupByAuthor: groupByAuthor with scala.Double = js.native
  /* 6 */ val groupByComposer: groupByComposer with scala.Double = js.native
  /* 7 */ val groupByGenre: groupByGenre with scala.Double = js.native
  /* 2 */ val groupByMonth: groupByMonth with scala.Double = js.native
  /* 8 */ val groupByPublishedYear: groupByPublishedYear with scala.Double = js.native
  /* 9 */ val groupByRating: groupByRating with scala.Double = js.native
  /* 10 */ val groupByTag: groupByTag with scala.Double = js.native
  /* 12 */ val groupByType: groupByType with scala.Double = js.native
  /* 1 */ val groupByYear: groupByYear with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery with scala.Double] = js.native
}


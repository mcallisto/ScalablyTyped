package typings
package mendixmodelsdkLib.distGenAllDashModelDashClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation")
@js.native
object navigationNs extends js.Object {
  @js.native
  class DeviceType ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.DeviceType
  
  @js.native
  class HomePage protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.HomePage {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
    */
  @js.native
  abstract class HomePageBase protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.HomePageBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.22.0: introduced
    */
  @js.native
  class NativeNavigationProfile protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.NativeNavigationProfile {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
    */
  @js.native
  class NavigationDocument protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
  }
  
  /**
    * In version 7.2.0: added public
    */
  @js.native
  class NavigationProfile protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class NavigationProfileBase protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfileBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class OfflineEntityConfig protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.OfflineEntityConfig {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class ProfileKind ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind
  
  @js.native
  class ProfileType ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType
  
  @js.native
  class RoleBasedHomePage protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedHomePage {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 8.0.0: introduced
    */
  @js.native
  class RoleBasedNativeHomePage protected ()
    extends mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedNativeHomePage {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* static members */
  @js.native
  object DeviceType extends js.Object {
    var Desktop: mendixmodelsdkLib.distGenNavigationMod.navigationNs.DeviceType = js.native
    var Phone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.DeviceType = js.native
    var Tablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.DeviceType = js.native
  }
  
  /* static members */
  @js.native
  object HomePage extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.HomePage = js.native
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * The new HomePage will be automatically stored in the 'homePage' property
      * of the parent NavigationProfile element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile): mendixmodelsdkLib.distGenNavigationMod.navigationNs.HomePage = js.native
  }
  
  /* static members */
  @js.native
  object HomePageBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NativeNavigationProfile extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NativeNavigationProfile = js.native
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NativeNavigationProfile = js.native
  }
  
  /* static members */
  @js.native
  object NavigationDocument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates a new NavigationDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument = js.native
  }
  
  /* static members */
  @js.native
  object NavigationProfile extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    def createInNavigationDocumentUnderDesktopProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    def createInNavigationDocumentUnderHybridPhoneProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    def createInNavigationDocumentUnderHybridPhoneProfile6(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    def createInNavigationDocumentUnderHybridTabletProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    def createInNavigationDocumentUnderHybridTabletProfile6(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.0.1
      */
    def createInNavigationDocumentUnderOfflinePhoneProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    def createInNavigationDocumentUnderPhoneProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInNavigationDocumentUnderProfiles(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    def createInNavigationDocumentUnderTabletProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
  }
  
  /* static members */
  @js.native
  object NavigationProfileBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object OfflineEntityConfig extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.OfflineEntityConfig = js.native
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
      * of the parent NavigationProfileBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfileBase): mendixmodelsdkLib.distGenNavigationMod.navigationNs.OfflineEntityConfig = js.native
  }
  
  /* static members */
  @js.native
  object ProfileKind extends js.Object {
    var Hybrid: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridOffline: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridPhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridPhoneOffline: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridTablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridTabletOffline: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var NativePhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var Phone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var Responsive: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var Tablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
  }
  
  /* static members */
  @js.native
  object ProfileType extends js.Object {
    var Desktop: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridPhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridPhone6: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridTablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridTablet6: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var OfflinePhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var Phone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var Tablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
  }
  
  /* static members */
  @js.native
  object RoleBasedHomePage extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedHomePage = js.native
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
      * of the parent NavigationProfile element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile): mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedHomePage = js.native
  }
  
  /* static members */
  @js.native
  object RoleBasedNativeHomePage extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedNativeHomePage = js.native
    /**
      * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
      * The new RoleBasedNativeHomePage will be automatically stored in the 'roleBasedNativeHomePages' property
      * of the parent NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NativeNavigationProfile): mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedNativeHomePage = js.native
  }
  
}


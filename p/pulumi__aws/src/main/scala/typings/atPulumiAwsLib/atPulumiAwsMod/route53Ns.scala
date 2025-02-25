package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "route53")
@js.native
object route53Ns extends js.Object {
  @js.native
  class DelegationSet protected ()
    extends atPulumiAwsLib.route53Mod.DelegationSet {
    /**
      * Create a DelegationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53DelegationSetMod.DelegationSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53DelegationSetMod.DelegationSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class HealthCheck protected ()
    extends atPulumiAwsLib.route53Mod.HealthCheck {
    /**
      * Create a HealthCheck resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53HealthCheckMod.HealthCheckArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53HealthCheckMod.HealthCheckArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class QueryLog protected ()
    extends atPulumiAwsLib.route53Mod.QueryLog {
    /**
      * Create a QueryLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53QueryLogMod.QueryLogArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53QueryLogMod.QueryLogArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Record protected ()
    extends atPulumiAwsLib.route53Mod.Record {
    /**
      * Create a Record resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53RecordMod.RecordArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53RecordMod.RecordArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverEndpoint protected ()
    extends atPulumiAwsLib.route53Mod.ResolverEndpoint {
    /**
      * Create a ResolverEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpointArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverRule protected ()
    extends atPulumiAwsLib.route53Mod.ResolverRule {
    /**
      * Create a ResolverRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ResolverRuleMod.ResolverRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ResolverRuleMod.ResolverRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverRuleAssociation protected ()
    extends atPulumiAwsLib.route53Mod.ResolverRuleAssociation {
    /**
      * Create a ResolverRuleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ResolverRuleAssociationMod.ResolverRuleAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ResolverRuleAssociationMod.ResolverRuleAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Zone protected ()
    extends atPulumiAwsLib.route53Mod.Zone {
    /**
      * Create a Zone resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneMod.ZoneArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneMod.ZoneArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ZoneAssociation protected ()
    extends atPulumiAwsLib.route53Mod.ZoneAssociation {
    /**
      * Create a ZoneAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getDelegationSet(args: atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetArgs): js.Promise[atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetResult] = js.native
  def getDelegationSet(
    args: atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetResult] = js.native
  def getZone(): js.Promise[atPulumiAwsLib.route53GetZoneMod.GetZoneResult] = js.native
  def getZone(args: atPulumiAwsLib.route53GetZoneMod.GetZoneArgs): js.Promise[atPulumiAwsLib.route53GetZoneMod.GetZoneResult] = js.native
  def getZone(
    args: atPulumiAwsLib.route53GetZoneMod.GetZoneArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.route53GetZoneMod.GetZoneResult] = js.native
  /* static members */
  @js.native
  object DelegationSet extends js.Object {
    /**
      * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53DelegationSetMod.DelegationSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53DelegationSetMod.DelegationSetState
    ): atPulumiAwsLib.route53DelegationSetMod.DelegationSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53DelegationSetMod.DelegationSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53DelegationSetMod.DelegationSet = js.native
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HealthCheck extends js.Object {
    /**
      * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53HealthCheckMod.HealthCheck = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53HealthCheckMod.HealthCheckState
    ): atPulumiAwsLib.route53HealthCheckMod.HealthCheck = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53HealthCheckMod.HealthCheckState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53HealthCheckMod.HealthCheck = js.native
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object QueryLog extends js.Object {
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53QueryLogMod.QueryLogState
    ): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53QueryLogMod.QueryLogState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Record extends js.Object {
    /**
      * Get an existing Record resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53RecordMod.Record = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53RecordMod.RecordState
    ): atPulumiAwsLib.route53RecordMod.Record = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53RecordMod.RecordState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53RecordMod.Record = js.native
    /**
      * Returns true if the given object is an instance of Record.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ scala.Boolean = js.native
  }
  
  @JSName("RecordTypes")
  @js.native
  object RecordTypesNs extends js.Object {
    val A: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val AAAA: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val CAA: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val CNAME: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val MX: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val NAPTR: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val NS: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val PTR: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val SOA: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val SPF: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val SRV: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
    val TXT: atPulumiAwsLib.route53RecordTypeMod.RecordType = js.native
  }
  
  /* static members */
  @js.native
  object ResolverEndpoint extends js.Object {
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpointState
    ): atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpointState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpoint = js.native
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResolverRule extends js.Object {
    /**
      * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ResolverRuleMod.ResolverRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ResolverRuleMod.ResolverRuleState
    ): atPulumiAwsLib.route53ResolverRuleMod.ResolverRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ResolverRuleMod.ResolverRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53ResolverRuleMod.ResolverRule = js.native
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResolverRuleAssociation extends js.Object {
    /**
      * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ResolverRuleAssociationMod.ResolverRuleAssociationState
    ): atPulumiAwsLib.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ResolverRuleAssociationMod.ResolverRuleAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Zone extends js.Object {
    /**
      * Get an existing Zone resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ZoneMod.Zone = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneMod.ZoneState
    ): atPulumiAwsLib.route53ZoneMod.Zone = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneMod.ZoneState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53ZoneMod.Zone = js.native
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ZoneAssociation extends js.Object {
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationState
    ): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ scala.Boolean = js.native
  }
  
}


package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2")
@js.native
object ec2Ns extends js.Object {
  @js.native
  class Ami protected ()
    extends atPulumiAwsLib.ec2Mod.Ami {
    /**
      * Create a Ami resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiMod.AmiArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiMod.AmiArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class AmiCopy protected ()
    extends atPulumiAwsLib.ec2Mod.AmiCopy {
    /**
      * Create a AmiCopy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiCopyMod.AmiCopyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiCopyMod.AmiCopyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class AmiFromInstance protected ()
    extends atPulumiAwsLib.ec2Mod.AmiFromInstance {
    /**
      * Create a AmiFromInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class AmiLaunchPermission protected ()
    extends atPulumiAwsLib.ec2Mod.AmiLaunchPermission {
    /**
      * Create a AmiLaunchPermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiLaunchPermissionMod.AmiLaunchPermissionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiLaunchPermissionMod.AmiLaunchPermissionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class CapacityReservation protected ()
    extends atPulumiAwsLib.ec2Mod.CapacityReservation {
    /**
      * Create a CapacityReservation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2CapacityReservationMod.CapacityReservationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2CapacityReservationMod.CapacityReservationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class CustomerGateway protected ()
    extends atPulumiAwsLib.ec2Mod.CustomerGateway {
    /**
      * Create a CustomerGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DefaultNetworkAcl protected ()
    extends atPulumiAwsLib.ec2Mod.DefaultNetworkAcl {
    /**
      * Create a DefaultNetworkAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAclArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAclArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DefaultRouteTable protected ()
    extends atPulumiAwsLib.ec2Mod.DefaultRouteTable {
    /**
      * Create a DefaultRouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultRouteTableMod.DefaultRouteTableArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultRouteTableMod.DefaultRouteTableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DefaultSecurityGroup protected ()
    extends atPulumiAwsLib.ec2Mod.DefaultSecurityGroup {
    /**
      * Create a DefaultSecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DefaultSubnet protected ()
    extends atPulumiAwsLib.ec2Mod.DefaultSubnet {
    /**
      * Create a DefaultSubnet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DefaultVpc protected ()
    extends atPulumiAwsLib.ec2Mod.DefaultVpc {
    /**
      * Create a DefaultVpc resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpcArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpcArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DefaultVpcDhcpOptions protected ()
    extends atPulumiAwsLib.ec2Mod.DefaultVpcDhcpOptions {
    /**
      * Create a DefaultVpcDhcpOptions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EgressOnlyInternetGateway protected ()
    extends atPulumiAwsLib.ec2Mod.EgressOnlyInternetGateway {
    /**
      * Create a EgressOnlyInternetGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod.EgressOnlyInternetGatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod.EgressOnlyInternetGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Eip protected ()
    extends atPulumiAwsLib.ec2Mod.Eip {
    /**
      * Create a Eip resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2EipMod.EipArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2EipMod.EipArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EipAssociation protected ()
    extends atPulumiAwsLib.ec2Mod.EipAssociation {
    /**
      * Create a EipAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2EipAssociationMod.EipAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2EipAssociationMod.EipAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Fleet protected ()
    extends atPulumiAwsLib.ec2Mod.Fleet {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2FleetMod.FleetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2FleetMod.FleetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class FlowLog protected ()
    extends atPulumiAwsLib.ec2Mod.FlowLog {
    /**
      * Create a FlowLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2FlowLogMod.FlowLogArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2FlowLogMod.FlowLogArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Instance protected ()
    extends atPulumiAwsLib.ec2Mod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2InstanceMod.InstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2InstanceMod.InstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class InternetGateway protected ()
    extends atPulumiAwsLib.ec2Mod.InternetGateway {
    /**
      * Create a InternetGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2InternetGatewayMod.InternetGatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2InternetGatewayMod.InternetGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class KeyPair protected ()
    extends atPulumiAwsLib.ec2Mod.KeyPair {
    /**
      * Create a KeyPair resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2KeyPairMod.KeyPairArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2KeyPairMod.KeyPairArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LaunchConfiguration protected ()
    extends atPulumiAwsLib.ec2Mod.LaunchConfiguration {
    /**
      * Create a LaunchConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfigurationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LaunchTemplate protected ()
    extends atPulumiAwsLib.ec2Mod.LaunchTemplate {
    /**
      * Create a LaunchTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MainRouteTableAssociation protected ()
    extends atPulumiAwsLib.ec2Mod.MainRouteTableAssociation {
    /**
      * Create a MainRouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2MainRouteTableAssociationMod.MainRouteTableAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2MainRouteTableAssociationMod.MainRouteTableAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NatGateway protected ()
    extends atPulumiAwsLib.ec2Mod.NatGateway {
    /**
      * Create a NatGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NatGatewayMod.NatGatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NatGatewayMod.NatGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkAcl protected ()
    extends atPulumiAwsLib.ec2Mod.NetworkAcl {
    /**
      * Create a NetworkAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkAclMod.NetworkAclArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkAclMod.NetworkAclArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkAclRule protected ()
    extends atPulumiAwsLib.ec2Mod.NetworkAclRule {
    /**
      * Create a NetworkAclRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkAclRuleMod.NetworkAclRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkAclRuleMod.NetworkAclRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkInterface protected ()
    extends atPulumiAwsLib.ec2Mod.NetworkInterface {
    /**
      * Create a NetworkInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterfaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkInterfaceAttachment protected ()
    extends atPulumiAwsLib.ec2Mod.NetworkInterfaceAttachment {
    /**
      * Create a NetworkInterfaceAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod.NetworkInterfaceAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod.NetworkInterfaceAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkInterfaceSecurityGroupAttachment protected ()
    extends atPulumiAwsLib.ec2Mod.NetworkInterfaceSecurityGroupAttachment {
    /**
      * Create a NetworkInterfaceSecurityGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PeeringConnectionOptions protected ()
    extends atPulumiAwsLib.ec2Mod.PeeringConnectionOptions {
    /**
      * Create a PeeringConnectionOptions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptionsArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptionsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PlacementGroup protected ()
    extends atPulumiAwsLib.ec2Mod.PlacementGroup {
    /**
      * Create a PlacementGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ProxyProtocolPolicy protected ()
    extends atPulumiAwsLib.ec2Mod.ProxyProtocolPolicy {
    /**
      * Create a ProxyProtocolPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Route protected ()
    extends atPulumiAwsLib.ec2Mod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2RouteMod.RouteArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2RouteMod.RouteArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTable protected ()
    extends atPulumiAwsLib.ec2Mod.RouteTable {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2RouteTableMod.RouteTableArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2RouteTableMod.RouteTableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTableAssociation protected ()
    extends atPulumiAwsLib.ec2Mod.RouteTableAssociation {
    /**
      * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2RouteTableAssociationMod.RouteTableAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2RouteTableAssociationMod.RouteTableAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityGroup protected ()
    extends atPulumiAwsLib.ec2Mod.SecurityGroup {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SecurityGroupMod.SecurityGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SecurityGroupMod.SecurityGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityGroupRule protected ()
    extends atPulumiAwsLib.ec2Mod.SecurityGroupRule {
    /**
      * Create a SecurityGroupRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotCreateVolumePermission protected ()
    extends atPulumiAwsLib.ec2Mod.SnapshotCreateVolumePermission {
    /**
      * Create a SnapshotCreateVolumePermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod.SnapshotCreateVolumePermissionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod.SnapshotCreateVolumePermissionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SpotDatafeedSubscription protected ()
    extends atPulumiAwsLib.ec2Mod.SpotDatafeedSubscription {
    /**
      * Create a SpotDatafeedSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscriptionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SpotFleetRequest protected ()
    extends atPulumiAwsLib.ec2Mod.SpotFleetRequest {
    /**
      * Create a SpotFleetRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequestArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequestArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SpotInstanceRequest protected ()
    extends atPulumiAwsLib.ec2Mod.SpotInstanceRequest {
    /**
      * Create a SpotInstanceRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SpotInstanceRequestMod.SpotInstanceRequestArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SpotInstanceRequestMod.SpotInstanceRequestArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Subnet protected ()
    extends atPulumiAwsLib.ec2Mod.Subnet {
    /**
      * Create a Subnet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SubnetMod.SubnetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2SubnetMod.SubnetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VolumeAttachment protected ()
    extends atPulumiAwsLib.ec2Mod.VolumeAttachment {
    /**
      * Create a VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VolumeAttachmentMod.VolumeAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VolumeAttachmentMod.VolumeAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Vpc protected ()
    extends atPulumiAwsLib.ec2Mod.Vpc {
    /**
      * Create a Vpc resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcMod.VpcArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcMod.VpcArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcDhcpOptions protected ()
    extends atPulumiAwsLib.ec2Mod.VpcDhcpOptions {
    /**
      * Create a VpcDhcpOptions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcDhcpOptionsMod.VpcDhcpOptionsArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcDhcpOptionsMod.VpcDhcpOptionsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcDhcpOptionsAssociation protected ()
    extends atPulumiAwsLib.ec2Mod.VpcDhcpOptionsAssociation {
    /**
      * Create a VpcDhcpOptionsAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcEndpoint protected ()
    extends atPulumiAwsLib.ec2Mod.VpcEndpoint {
    /**
      * Create a VpcEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointMod.VpcEndpointArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointMod.VpcEndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcEndpointConnectionNotification protected ()
    extends atPulumiAwsLib.ec2Mod.VpcEndpointConnectionNotification {
    /**
      * Create a VpcEndpointConnectionNotification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcEndpointRouteTableAssociation protected ()
    extends atPulumiAwsLib.ec2Mod.VpcEndpointRouteTableAssociation {
    /**
      * Create a VpcEndpointRouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcEndpointService protected ()
    extends atPulumiAwsLib.ec2Mod.VpcEndpointService {
    /**
      * Create a VpcEndpointService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointServiceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointServiceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcEndpointServiceAllowedPrinciple protected ()
    extends atPulumiAwsLib.ec2Mod.VpcEndpointServiceAllowedPrinciple {
    /**
      * Create a VpcEndpointServiceAllowedPrinciple resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrincipleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrincipleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcEndpointSubnetAssociation protected ()
    extends atPulumiAwsLib.ec2Mod.VpcEndpointSubnetAssociation {
    /**
      * Create a VpcEndpointSubnetAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcIpv4CidrBlockAssociation protected ()
    extends atPulumiAwsLib.ec2Mod.VpcIpv4CidrBlockAssociation {
    /**
      * Create a VpcIpv4CidrBlockAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcPeeringConnection protected ()
    extends atPulumiAwsLib.ec2Mod.VpcPeeringConnection {
    /**
      * Create a VpcPeeringConnection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnectionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcPeeringConnectionAccepter protected ()
    extends atPulumiAwsLib.ec2Mod.VpcPeeringConnectionAccepter {
    /**
      * Create a VpcPeeringConnectionAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpnConnection protected ()
    extends atPulumiAwsLib.ec2Mod.VpnConnection {
    /**
      * Create a VpnConnection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnConnectionMod.VpnConnectionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnConnectionMod.VpnConnectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpnConnectionRoute protected ()
    extends atPulumiAwsLib.ec2Mod.VpnConnectionRoute {
    /**
      * Create a VpnConnectionRoute resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRouteArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRouteArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpnGateway protected ()
    extends atPulumiAwsLib.ec2Mod.VpnGateway {
    /**
      * Create a VpnGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnGatewayMod.VpnGatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnGatewayMod.VpnGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpnGatewayAttachment protected ()
    extends atPulumiAwsLib.ec2Mod.VpnGatewayAttachment {
    /**
      * Create a VpnGatewayAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpnGatewayRoutePropagation protected ()
    extends atPulumiAwsLib.ec2Mod.VpnGatewayRoutePropagation {
    /**
      * Create a VpnGatewayRoutePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  val A1Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val A1Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val A1InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val A1InstanceMedium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val A1InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val AllProtocols: atPulumiAwsLib.ec2ProtocolTypeMod.ProtocolType = js.native
  val C3Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C3Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C3Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C3InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C3InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C4Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C4Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C4Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C4InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C4InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5Instance18XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5Instance9XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5dInstance18XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5dInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5dInstance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5dInstance9XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5dInstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5dInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5nInstance18XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5nInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5nInstance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5nInstance9XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5nInstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val C5nInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  var ClusterStrategy: atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy = js.native
  val D2Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val D2Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val D2Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val D2InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val DedicatedTenancy: atPulumiAwsLib.ec2TenancyMod.Tenancy = js.native
  val DefaultTenancy: atPulumiAwsLib.ec2TenancyMod.Tenancy = js.native
  val F1Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val F1Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val G2Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val G2Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val G3Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val G3Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val G3Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val G3sInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val H1Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val H1Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val H1Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val H1Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val Hs1Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val I3Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val I3Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val I3Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val I3Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val I3InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val I3InstanceMetal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val I3InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val ICMPProtocol: atPulumiAwsLib.ec2ProtocolTypeMod.ProtocolType = js.native
  val LinuxUnixPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  val M3Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M3InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M3InstanceMedium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M3InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M4Instance10XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M4Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M4Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M4Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M4InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M4InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5Instance12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5Instance24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5aInstance12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5aInstance24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5aInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5aInstance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5aInstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5aInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5dInstance12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5dInstance24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5dInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5dInstance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5dInstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val M5dInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val P2Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val P2Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val P2InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val P3Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val P3Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val P3Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val P3dnInstance24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R3Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R3Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R3Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R3InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R3InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R4Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R4Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R4Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R4Instance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R4InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R4InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5Instance12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5Instance24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5Instance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5aInstance12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5aInstance24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5aInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5aInstance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5aInstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5aInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5dInstance12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5dInstance24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5dInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5dInstance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5dInstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val R5dInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val RedHatEnterpriseLinuxPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  var SpreadStrategy: atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy = js.native
  val SuseLinuxPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  val T2Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T2InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T2InstanceMedium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T2InstanceMicro: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T2InstanceNano: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T2InstanceSmall: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T2InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T3Instance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T3InstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T3InstanceMedium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T3InstanceMicro: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T3InstanceNano: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T3InstanceSmall: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val T3InstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val TCPProtocol: atPulumiAwsLib.ec2ProtocolTypeMod.ProtocolType = js.native
  val UDPProtocol: atPulumiAwsLib.ec2ProtocolTypeMod.ProtocolType = js.native
  val UInstance12tb1Metal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val UInstance6tb1Metal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val UInstance9tb1Metal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val WindowsPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  val WindowsWithSqlServerEnterprisePlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  val WindowsWithSqlServerPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  val WindowsWithSqlServerStandardPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  val WindowsWithSqlServerWebPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  val X1Instance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val X1Instance32XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val X1eInstance16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val X1eInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val X1eInstance32XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val X1eInstance4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val X1eInstance8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val X1eInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val Z1dInstance12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val Z1dInstance2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val Z1dInstance3XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val Z1dInstance6XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val Z1dInstanceLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  val Z1dInstanceXLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  def getCustomerGateway(): js.Promise[atPulumiAwsLib.ec2GetCustomerGatewayMod.GetCustomerGatewayResult] = js.native
  def getCustomerGateway(args: atPulumiAwsLib.ec2GetCustomerGatewayMod.GetCustomerGatewayArgs): js.Promise[atPulumiAwsLib.ec2GetCustomerGatewayMod.GetCustomerGatewayResult] = js.native
  def getCustomerGateway(
    args: atPulumiAwsLib.ec2GetCustomerGatewayMod.GetCustomerGatewayArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetCustomerGatewayMod.GetCustomerGatewayResult] = js.native
  def getInstance(): js.Promise[atPulumiAwsLib.ec2GetInstanceMod.GetInstanceResult] = js.native
  def getInstance(args: atPulumiAwsLib.ec2GetInstanceMod.GetInstanceArgs): js.Promise[atPulumiAwsLib.ec2GetInstanceMod.GetInstanceResult] = js.native
  def getInstance(
    args: atPulumiAwsLib.ec2GetInstanceMod.GetInstanceArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetInstanceMod.GetInstanceResult] = js.native
  def getInstances(): js.Promise[atPulumiAwsLib.ec2GetInstancesMod.GetInstancesResult] = js.native
  def getInstances(args: atPulumiAwsLib.ec2GetInstancesMod.GetInstancesArgs): js.Promise[atPulumiAwsLib.ec2GetInstancesMod.GetInstancesResult] = js.native
  def getInstances(
    args: atPulumiAwsLib.ec2GetInstancesMod.GetInstancesArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetInstancesMod.GetInstancesResult] = js.native
  def getInternetGateway(): js.Promise[atPulumiAwsLib.ec2GetInternetGatewayMod.GetInternetGatewayResult] = js.native
  def getInternetGateway(args: atPulumiAwsLib.ec2GetInternetGatewayMod.GetInternetGatewayArgs): js.Promise[atPulumiAwsLib.ec2GetInternetGatewayMod.GetInternetGatewayResult] = js.native
  def getInternetGateway(
    args: atPulumiAwsLib.ec2GetInternetGatewayMod.GetInternetGatewayArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetInternetGatewayMod.GetInternetGatewayResult] = js.native
  def getLaunchConfiguration(args: atPulumiAwsLib.ec2GetLaunchConfigurationMod.GetLaunchConfigurationArgs): js.Promise[atPulumiAwsLib.ec2GetLaunchConfigurationMod.GetLaunchConfigurationResult] = js.native
  def getLaunchConfiguration(
    args: atPulumiAwsLib.ec2GetLaunchConfigurationMod.GetLaunchConfigurationArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetLaunchConfigurationMod.GetLaunchConfigurationResult] = js.native
  def getLaunchTemplate(args: atPulumiAwsLib.ec2GetLaunchTemplateMod.GetLaunchTemplateArgs): js.Promise[atPulumiAwsLib.ec2GetLaunchTemplateMod.GetLaunchTemplateResult] = js.native
  def getLaunchTemplate(
    args: atPulumiAwsLib.ec2GetLaunchTemplateMod.GetLaunchTemplateArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetLaunchTemplateMod.GetLaunchTemplateResult] = js.native
  def getNatGateway(): js.Promise[atPulumiAwsLib.ec2GetNatGatewayMod.GetNatGatewayResult] = js.native
  def getNatGateway(args: atPulumiAwsLib.ec2GetNatGatewayMod.GetNatGatewayArgs): js.Promise[atPulumiAwsLib.ec2GetNatGatewayMod.GetNatGatewayResult] = js.native
  def getNatGateway(
    args: atPulumiAwsLib.ec2GetNatGatewayMod.GetNatGatewayArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetNatGatewayMod.GetNatGatewayResult] = js.native
  def getNetworkAcls(): js.Promise[atPulumiAwsLib.ec2GetNetworkAclsMod.GetNetworkAclsResult] = js.native
  def getNetworkAcls(args: atPulumiAwsLib.ec2GetNetworkAclsMod.GetNetworkAclsArgs): js.Promise[atPulumiAwsLib.ec2GetNetworkAclsMod.GetNetworkAclsResult] = js.native
  def getNetworkAcls(
    args: atPulumiAwsLib.ec2GetNetworkAclsMod.GetNetworkAclsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetNetworkAclsMod.GetNetworkAclsResult] = js.native
  def getNetworkInterface(): js.Promise[atPulumiAwsLib.ec2GetNetworkInterfaceMod.GetNetworkInterfaceResult] = js.native
  def getNetworkInterface(args: atPulumiAwsLib.ec2GetNetworkInterfaceMod.GetNetworkInterfaceArgs): js.Promise[atPulumiAwsLib.ec2GetNetworkInterfaceMod.GetNetworkInterfaceResult] = js.native
  def getNetworkInterface(
    args: atPulumiAwsLib.ec2GetNetworkInterfaceMod.GetNetworkInterfaceArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetNetworkInterfaceMod.GetNetworkInterfaceResult] = js.native
  def getNetworkInterfaces(): js.Promise[atPulumiAwsLib.ec2GetNetworkInterfacesMod.GetNetworkInterfacesResult] = js.native
  def getNetworkInterfaces(args: atPulumiAwsLib.ec2GetNetworkInterfacesMod.GetNetworkInterfacesArgs): js.Promise[atPulumiAwsLib.ec2GetNetworkInterfacesMod.GetNetworkInterfacesResult] = js.native
  def getNetworkInterfaces(
    args: atPulumiAwsLib.ec2GetNetworkInterfacesMod.GetNetworkInterfacesArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetNetworkInterfacesMod.GetNetworkInterfacesResult] = js.native
  def getRoute(args: atPulumiAwsLib.ec2GetRouteMod.GetRouteArgs): js.Promise[atPulumiAwsLib.ec2GetRouteMod.GetRouteResult] = js.native
  def getRoute(args: atPulumiAwsLib.ec2GetRouteMod.GetRouteArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.ec2GetRouteMod.GetRouteResult] = js.native
  def getRouteTable(): js.Promise[atPulumiAwsLib.ec2GetRouteTableMod.GetRouteTableResult] = js.native
  def getRouteTable(args: atPulumiAwsLib.ec2GetRouteTableMod.GetRouteTableArgs): js.Promise[atPulumiAwsLib.ec2GetRouteTableMod.GetRouteTableResult] = js.native
  def getRouteTable(
    args: atPulumiAwsLib.ec2GetRouteTableMod.GetRouteTableArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetRouteTableMod.GetRouteTableResult] = js.native
  def getRouteTables(): js.Promise[atPulumiAwsLib.ec2GetRouteTablesMod.GetRouteTablesResult] = js.native
  def getRouteTables(args: atPulumiAwsLib.ec2GetRouteTablesMod.GetRouteTablesArgs): js.Promise[atPulumiAwsLib.ec2GetRouteTablesMod.GetRouteTablesResult] = js.native
  def getRouteTables(
    args: atPulumiAwsLib.ec2GetRouteTablesMod.GetRouteTablesArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetRouteTablesMod.GetRouteTablesResult] = js.native
  def getSecurityGroup(): js.Promise[atPulumiAwsLib.ec2GetSecurityGroupMod.GetSecurityGroupResult] = js.native
  def getSecurityGroup(args: atPulumiAwsLib.ec2GetSecurityGroupMod.GetSecurityGroupArgs): js.Promise[atPulumiAwsLib.ec2GetSecurityGroupMod.GetSecurityGroupResult] = js.native
  def getSecurityGroup(
    args: atPulumiAwsLib.ec2GetSecurityGroupMod.GetSecurityGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetSecurityGroupMod.GetSecurityGroupResult] = js.native
  def getSecurityGroups(): js.Promise[atPulumiAwsLib.ec2GetSecurityGroupsMod.GetSecurityGroupsResult] = js.native
  def getSecurityGroups(args: atPulumiAwsLib.ec2GetSecurityGroupsMod.GetSecurityGroupsArgs): js.Promise[atPulumiAwsLib.ec2GetSecurityGroupsMod.GetSecurityGroupsResult] = js.native
  def getSecurityGroups(
    args: atPulumiAwsLib.ec2GetSecurityGroupsMod.GetSecurityGroupsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetSecurityGroupsMod.GetSecurityGroupsResult] = js.native
  def getSubnet(): js.Promise[atPulumiAwsLib.ec2GetSubnetMod.GetSubnetResult] = js.native
  def getSubnet(args: atPulumiAwsLib.ec2GetSubnetMod.GetSubnetArgs): js.Promise[atPulumiAwsLib.ec2GetSubnetMod.GetSubnetResult] = js.native
  def getSubnet(
    args: atPulumiAwsLib.ec2GetSubnetMod.GetSubnetArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetSubnetMod.GetSubnetResult] = js.native
  def getSubnetIds(args: atPulumiAwsLib.ec2GetSubnetIdsMod.GetSubnetIdsArgs): js.Promise[atPulumiAwsLib.ec2GetSubnetIdsMod.GetSubnetIdsResult] = js.native
  def getSubnetIds(
    args: atPulumiAwsLib.ec2GetSubnetIdsMod.GetSubnetIdsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetSubnetIdsMod.GetSubnetIdsResult] = js.native
  def getVpc(): js.Promise[atPulumiAwsLib.ec2GetVpcMod.GetVpcResult] = js.native
  def getVpc(args: atPulumiAwsLib.ec2GetVpcMod.GetVpcArgs): js.Promise[atPulumiAwsLib.ec2GetVpcMod.GetVpcResult] = js.native
  def getVpc(args: atPulumiAwsLib.ec2GetVpcMod.GetVpcArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.ec2GetVpcMod.GetVpcResult] = js.native
  def getVpcDhcpOptions(): js.Promise[atPulumiAwsLib.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsResult] = js.native
  def getVpcDhcpOptions(args: atPulumiAwsLib.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs): js.Promise[atPulumiAwsLib.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsResult] = js.native
  def getVpcDhcpOptions(
    args: atPulumiAwsLib.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsResult] = js.native
  def getVpcEndpoint(): js.Promise[atPulumiAwsLib.ec2GetVpcEndpointMod.GetVpcEndpointResult] = js.native
  def getVpcEndpoint(args: atPulumiAwsLib.ec2GetVpcEndpointMod.GetVpcEndpointArgs): js.Promise[atPulumiAwsLib.ec2GetVpcEndpointMod.GetVpcEndpointResult] = js.native
  def getVpcEndpoint(
    args: atPulumiAwsLib.ec2GetVpcEndpointMod.GetVpcEndpointArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetVpcEndpointMod.GetVpcEndpointResult] = js.native
  def getVpcEndpointService(): js.Promise[atPulumiAwsLib.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceResult] = js.native
  def getVpcEndpointService(args: atPulumiAwsLib.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceArgs): js.Promise[atPulumiAwsLib.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceResult] = js.native
  def getVpcEndpointService(
    args: atPulumiAwsLib.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceResult] = js.native
  def getVpcPeeringConnection(): js.Promise[atPulumiAwsLib.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionResult] = js.native
  def getVpcPeeringConnection(args: atPulumiAwsLib.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs): js.Promise[atPulumiAwsLib.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionResult] = js.native
  def getVpcPeeringConnection(
    args: atPulumiAwsLib.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionResult] = js.native
  def getVpcs(): js.Promise[atPulumiAwsLib.ec2GetVpcsMod.GetVpcsResult] = js.native
  def getVpcs(args: atPulumiAwsLib.ec2GetVpcsMod.GetVpcsArgs): js.Promise[atPulumiAwsLib.ec2GetVpcsMod.GetVpcsResult] = js.native
  def getVpcs(args: atPulumiAwsLib.ec2GetVpcsMod.GetVpcsArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.ec2GetVpcsMod.GetVpcsResult] = js.native
  def getVpnGateway(): js.Promise[atPulumiAwsLib.ec2GetVpnGatewayMod.GetVpnGatewayResult] = js.native
  def getVpnGateway(args: atPulumiAwsLib.ec2GetVpnGatewayMod.GetVpnGatewayArgs): js.Promise[atPulumiAwsLib.ec2GetVpnGatewayMod.GetVpnGatewayResult] = js.native
  def getVpnGateway(
    args: atPulumiAwsLib.ec2GetVpnGatewayMod.GetVpnGatewayArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2GetVpnGatewayMod.GetVpnGatewayResult] = js.native
  /* static members */
  @js.native
  object Ami extends js.Object {
    /**
      * Get an existing Ami resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2AmiMod.Ami = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiMod.AmiState
    ): atPulumiAwsLib.ec2AmiMod.Ami = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiMod.AmiState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2AmiMod.Ami = js.native
    /**
      * Returns true if the given object is an instance of Ami.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/ami.Ami */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AmiCopy extends js.Object {
    /**
      * Get an existing AmiCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2AmiCopyMod.AmiCopy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiCopyMod.AmiCopyState
    ): atPulumiAwsLib.ec2AmiCopyMod.AmiCopy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiCopyMod.AmiCopyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2AmiCopyMod.AmiCopy = js.native
    /**
      * Returns true if the given object is an instance of AmiCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiCopy.AmiCopy */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AmiFromInstance extends js.Object {
    /**
      * Get an existing AmiFromInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceState
    ): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
    /**
      * Returns true if the given object is an instance of AmiFromInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiFromInstance.AmiFromInstance */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AmiLaunchPermission extends js.Object {
    /**
      * Get an existing AmiLaunchPermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2AmiLaunchPermissionMod.AmiLaunchPermission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiLaunchPermissionMod.AmiLaunchPermissionState
    ): atPulumiAwsLib.ec2AmiLaunchPermissionMod.AmiLaunchPermission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2AmiLaunchPermissionMod.AmiLaunchPermissionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2AmiLaunchPermissionMod.AmiLaunchPermission = js.native
    /**
      * Returns true if the given object is an instance of AmiLaunchPermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiLaunchPermission.AmiLaunchPermission */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CapacityReservation extends js.Object {
    /**
      * Get an existing CapacityReservation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2CapacityReservationMod.CapacityReservation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2CapacityReservationMod.CapacityReservationState
    ): atPulumiAwsLib.ec2CapacityReservationMod.CapacityReservation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2CapacityReservationMod.CapacityReservationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2CapacityReservationMod.CapacityReservation = js.native
    /**
      * Returns true if the given object is an instance of CapacityReservation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/capacityReservation.CapacityReservation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CustomerGateway extends js.Object {
    /**
      * Get an existing CustomerGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGatewayState
    ): atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGateway = js.native
    /**
      * Returns true if the given object is an instance of CustomerGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/customerGateway.CustomerGateway */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DefaultNetworkAcl extends js.Object {
    /**
      * Get an existing DefaultNetworkAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAcl = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAclState
    ): atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAcl = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAclState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAcl = js.native
    /**
      * Returns true if the given object is an instance of DefaultNetworkAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultNetworkAcl.DefaultNetworkAcl */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DefaultRouteTable extends js.Object {
    /**
      * Get an existing DefaultRouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultRouteTableMod.DefaultRouteTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultRouteTableMod.DefaultRouteTableState
    ): atPulumiAwsLib.ec2DefaultRouteTableMod.DefaultRouteTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultRouteTableMod.DefaultRouteTableState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2DefaultRouteTableMod.DefaultRouteTable = js.native
    /**
      * Returns true if the given object is an instance of DefaultRouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultRouteTable.DefaultRouteTable */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DefaultSecurityGroup extends js.Object {
    /**
      * Get an existing DefaultSecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroupState
    ): atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of DefaultSecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSecurityGroup.DefaultSecurityGroup */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DefaultSubnet extends js.Object {
    /**
      * Get an existing DefaultSubnet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnetState
    ): atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnet = js.native
    /**
      * Returns true if the given object is an instance of DefaultSubnet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSubnet.DefaultSubnet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DefaultVpc extends js.Object {
    /**
      * Get an existing DefaultVpc resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpc = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpcState
    ): atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpc = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpcState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpc = js.native
    /**
      * Returns true if the given object is an instance of DefaultVpc.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpc.DefaultVpc */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DefaultVpcDhcpOptions extends js.Object {
    /**
      * Get an existing DefaultVpcDhcpOptions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsState
    ): atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
    /**
      * Returns true if the given object is an instance of DefaultVpcDhcpOptions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpcDhcpOptions.DefaultVpcDhcpOptions */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EgressOnlyInternetGateway extends js.Object {
    /**
      * Get an existing EgressOnlyInternetGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod.EgressOnlyInternetGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod.EgressOnlyInternetGatewayState
    ): atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod.EgressOnlyInternetGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod.EgressOnlyInternetGatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod.EgressOnlyInternetGateway = js.native
    /**
      * Returns true if the given object is an instance of EgressOnlyInternetGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/egressOnlyInternetGateway.EgressOnlyInternetGateway */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Eip extends js.Object {
    /**
      * Get an existing Eip resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2EipMod.Eip = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2EipMod.EipState
    ): atPulumiAwsLib.ec2EipMod.Eip = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2EipMod.EipState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2EipMod.Eip = js.native
    /**
      * Returns true if the given object is an instance of Eip.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eip.Eip */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EipAssociation extends js.Object {
    /**
      * Get an existing EipAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2EipAssociationMod.EipAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2EipAssociationMod.EipAssociationState
    ): atPulumiAwsLib.ec2EipAssociationMod.EipAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2EipAssociationMod.EipAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2EipAssociationMod.EipAssociation = js.native
    /**
      * Returns true if the given object is an instance of EipAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eipAssociation.EipAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Fleet extends js.Object {
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2FleetMod.Fleet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2FleetMod.FleetState
    ): atPulumiAwsLib.ec2FleetMod.Fleet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2FleetMod.FleetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2FleetMod.Fleet = js.native
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/fleet.Fleet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FlowLog extends js.Object {
    /**
      * Get an existing FlowLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2FlowLogMod.FlowLog = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2FlowLogMod.FlowLogState
    ): atPulumiAwsLib.ec2FlowLogMod.FlowLog = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2FlowLogMod.FlowLogState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2FlowLogMod.FlowLog = js.native
    /**
      * Returns true if the given object is an instance of FlowLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/flowLog.FlowLog */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Instance extends js.Object {
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2InstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2InstanceMod.InstanceState
    ): atPulumiAwsLib.ec2InstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2InstanceMod.InstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2InstanceMod.Instance = js.native
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/instance.Instance */ scala.Boolean = js.native
  }
  
  @JSName("InstancePlatforms")
  @js.native
  object InstancePlatformsNs extends js.Object {
    val LinuxUnixPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
    val RedHatEnterpriseLinuxPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
    val SuseLinuxPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
    val WindowsPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
    val WindowsWithSqlServerEnterprisePlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
    val WindowsWithSqlServerPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
    val WindowsWithSqlServerStandardPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
    val WindowsWithSqlServerWebPlatform: atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform = js.native
  }
  
  @JSName("InstanceTypes")
  @js.native
  object InstanceTypesNs extends js.Object {
    val A1_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val A1_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val A1_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val A1_Medium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val A1_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C3_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C3_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C3_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C3_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C3_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C4_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C4_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C4_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C4_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C4_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5_18XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5_9XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5d_18XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5d_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5d_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5d_9XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5d_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5d_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5n_18XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5n_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5n_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5n_9XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5n_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val C5n_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val D2_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val D2_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val D2_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val D2_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val F1_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val F1_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val G2_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val G2_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val G3_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val G3_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val G3_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val G3s_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val H1_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val H1_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val H1_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val H1_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val Hs1_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val I3_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val I3_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val I3_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val I3_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val I3_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val I3_Metal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val I3_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M3_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M3_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M3_Medium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M3_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M4_10XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M4_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M4_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M4_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M4_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M4_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5_12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5_24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5a_12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5a_24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5a_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5a_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5a_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5a_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5d_12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5d_24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5d_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5d_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5d_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val M5d_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val P2_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val P2_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val P2_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val P3_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val P3_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val P3_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val P3dn_24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R3_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R3_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R3_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R3_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R3_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R4_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R4_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R4_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R4_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R4_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R4_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5_12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5_24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5a_12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5a_24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5a_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5a_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5a_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5a_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5d_12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5d_24XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5d_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5d_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5d_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val R5d_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T2_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T2_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T2_Medium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T2_Micro: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T2_Nano: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T2_Small: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T2_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T3_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T3_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T3_Medium: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T3_Micro: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T3_Nano: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T3_Small: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val T3_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val U_12tb1Metal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val U_6tb1Metal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val U_9tb1Metal: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1_32XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1e_16XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1e_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1e_32XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1e_4XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1e_8XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val X1e_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val Z1d_12XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val Z1d_2XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val Z1d_3XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val Z1d_6XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val Z1d_Large: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
    val Z1d_XLarge: atPulumiAwsLib.ec2InstanceTypeMod.InstanceType = js.native
  }
  
  /* static members */
  @js.native
  object InternetGateway extends js.Object {
    /**
      * Get an existing InternetGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2InternetGatewayMod.InternetGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2InternetGatewayMod.InternetGatewayState
    ): atPulumiAwsLib.ec2InternetGatewayMod.InternetGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2InternetGatewayMod.InternetGatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2InternetGatewayMod.InternetGateway = js.native
    /**
      * Returns true if the given object is an instance of InternetGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/internetGateway.InternetGateway */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object KeyPair extends js.Object {
    /**
      * Get an existing KeyPair resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2KeyPairMod.KeyPair = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2KeyPairMod.KeyPairState
    ): atPulumiAwsLib.ec2KeyPairMod.KeyPair = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2KeyPairMod.KeyPairState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2KeyPairMod.KeyPair = js.native
    /**
      * Returns true if the given object is an instance of KeyPair.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/keyPair.KeyPair */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LaunchConfiguration extends js.Object {
    /**
      * Get an existing LaunchConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfigurationState
    ): atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfigurationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration = js.native
    /**
      * Returns true if the given object is an instance of LaunchConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchConfiguration.LaunchConfiguration */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LaunchTemplate extends js.Object {
    /**
      * Get an existing LaunchTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplateState
    ): atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplate = js.native
    /**
      * Returns true if the given object is an instance of LaunchTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchTemplate.LaunchTemplate */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MainRouteTableAssociation extends js.Object {
    /**
      * Get an existing MainRouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2MainRouteTableAssociationMod.MainRouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2MainRouteTableAssociationMod.MainRouteTableAssociationState
    ): atPulumiAwsLib.ec2MainRouteTableAssociationMod.MainRouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2MainRouteTableAssociationMod.MainRouteTableAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2MainRouteTableAssociationMod.MainRouteTableAssociation = js.native
    /**
      * Returns true if the given object is an instance of MainRouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/mainRouteTableAssociation.MainRouteTableAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NatGateway extends js.Object {
    /**
      * Get an existing NatGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NatGatewayMod.NatGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NatGatewayMod.NatGatewayState
    ): atPulumiAwsLib.ec2NatGatewayMod.NatGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NatGatewayMod.NatGatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2NatGatewayMod.NatGateway = js.native
    /**
      * Returns true if the given object is an instance of NatGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/natGateway.NatGateway */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkAcl extends js.Object {
    /**
      * Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NetworkAclMod.NetworkAcl = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkAclMod.NetworkAclState
    ): atPulumiAwsLib.ec2NetworkAclMod.NetworkAcl = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkAclMod.NetworkAclState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2NetworkAclMod.NetworkAcl = js.native
    /**
      * Returns true if the given object is an instance of NetworkAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAcl.NetworkAcl */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkAclRule extends js.Object {
    /**
      * Get an existing NetworkAclRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NetworkAclRuleMod.NetworkAclRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkAclRuleMod.NetworkAclRuleState
    ): atPulumiAwsLib.ec2NetworkAclRuleMod.NetworkAclRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkAclRuleMod.NetworkAclRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2NetworkAclRuleMod.NetworkAclRule = js.native
    /**
      * Returns true if the given object is an instance of NetworkAclRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAclRule.NetworkAclRule */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkInterface extends js.Object {
    /**
      * Get an existing NetworkInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterfaceState
    ): atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterfaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterface = js.native
    /**
      * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkInterfaceAttachment extends js.Object {
    /**
      * Get an existing NetworkInterfaceAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod.NetworkInterfaceAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod.NetworkInterfaceAttachmentState
    ): atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod.NetworkInterfaceAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod.NetworkInterfaceAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod.NetworkInterfaceAttachment = js.native
    /**
      * Returns true if the given object is an instance of NetworkInterfaceAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceAttachment.NetworkInterfaceAttachment */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkInterfaceSecurityGroupAttachment extends js.Object {
    /**
      * Get an existing NetworkInterfaceSecurityGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachmentState
    ): atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachment = js.native
    /**
      * Returns true if the given object is an instance of NetworkInterfaceSecurityGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceSecurityGroupAttachment.NetworkInterfaceSecurityGroupAttachment */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PeeringConnectionOptions extends js.Object {
    /**
      * Get an existing PeeringConnectionOptions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptions = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptionsState
    ): atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptions = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptionsState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptions = js.native
    /**
      * Returns true if the given object is an instance of PeeringConnectionOptions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/peeringConnectionOptions.PeeringConnectionOptions */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PlacementGroup extends js.Object {
    /**
      * Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroupState
    ): atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup = js.native
    /**
      * Returns true if the given object is an instance of PlacementGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/placementGroup.PlacementGroup */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ProxyProtocolPolicy extends js.Object {
    /**
      * Get an existing ProxyProtocolPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyState
    ): atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicy = js.native
    /**
      * Returns true if the given object is an instance of ProxyProtocolPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/proxyProtocolPolicy.ProxyProtocolPolicy */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Route extends js.Object {
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2RouteMod.Route = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2RouteMod.RouteState
    ): atPulumiAwsLib.ec2RouteMod.Route = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2RouteMod.RouteState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2RouteMod.Route = js.native
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/route.Route */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RouteTable extends js.Object {
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2RouteTableMod.RouteTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2RouteTableMod.RouteTableState
    ): atPulumiAwsLib.ec2RouteTableMod.RouteTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2RouteTableMod.RouteTableState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2RouteTableMod.RouteTable = js.native
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/routeTable.RouteTable */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RouteTableAssociation extends js.Object {
    /**
      * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2RouteTableAssociationMod.RouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2RouteTableAssociationMod.RouteTableAssociationState
    ): atPulumiAwsLib.ec2RouteTableAssociationMod.RouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2RouteTableAssociationMod.RouteTableAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2RouteTableAssociationMod.RouteTableAssociation = js.native
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/routeTableAssociation.RouteTableAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityGroup extends js.Object {
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SecurityGroupMod.SecurityGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SecurityGroupMod.SecurityGroupState
    ): atPulumiAwsLib.ec2SecurityGroupMod.SecurityGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SecurityGroupMod.SecurityGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2SecurityGroupMod.SecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/securityGroup.SecurityGroup */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityGroupRule extends js.Object {
    /**
      * Get an existing SecurityGroupRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRuleState
    ): atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRule = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroupRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/securityGroupRule.SecurityGroupRule */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotCreateVolumePermission extends js.Object {
    /**
      * Get an existing SnapshotCreateVolumePermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod.SnapshotCreateVolumePermissionState
    ): atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod.SnapshotCreateVolumePermissionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCreateVolumePermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/snapshotCreateVolumePermission.SnapshotCreateVolumePermission */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SpotDatafeedSubscription extends js.Object {
    /**
      * Get an existing SpotDatafeedSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscription = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscriptionState
    ): atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscription = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscriptionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscription = js.native
    /**
      * Returns true if the given object is an instance of SpotDatafeedSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotDatafeedSubscription.SpotDatafeedSubscription */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SpotFleetRequest extends js.Object {
    /**
      * Get an existing SpotFleetRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequest = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequestState
    ): atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequest = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequestState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequest = js.native
    /**
      * Returns true if the given object is an instance of SpotFleetRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotFleetRequest.SpotFleetRequest */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SpotInstanceRequest extends js.Object {
    /**
      * Get an existing SpotInstanceRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SpotInstanceRequestMod.SpotInstanceRequest = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SpotInstanceRequestMod.SpotInstanceRequestState
    ): atPulumiAwsLib.ec2SpotInstanceRequestMod.SpotInstanceRequest = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SpotInstanceRequestMod.SpotInstanceRequestState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2SpotInstanceRequestMod.SpotInstanceRequest = js.native
    /**
      * Returns true if the given object is an instance of SpotInstanceRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotInstanceRequest.SpotInstanceRequest */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Subnet extends js.Object {
    /**
      * Get an existing Subnet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SubnetMod.Subnet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SubnetMod.SubnetState
    ): atPulumiAwsLib.ec2SubnetMod.Subnet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2SubnetMod.SubnetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2SubnetMod.Subnet = js.native
    /**
      * Returns true if the given object is an instance of Subnet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/subnet.Subnet */ scala.Boolean = js.native
  }
  
  @JSName("Tenancies")
  @js.native
  object TenanciesNs extends js.Object {
    val DedicatedTenancy: atPulumiAwsLib.ec2TenancyMod.Tenancy = js.native
    val DefaultTenancy: atPulumiAwsLib.ec2TenancyMod.Tenancy = js.native
  }
  
  /* static members */
  @js.native
  object VolumeAttachment extends js.Object {
    /**
      * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VolumeAttachmentMod.VolumeAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VolumeAttachmentMod.VolumeAttachmentState
    ): atPulumiAwsLib.ec2VolumeAttachmentMod.VolumeAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VolumeAttachmentMod.VolumeAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VolumeAttachmentMod.VolumeAttachment = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/volumeAttachment.VolumeAttachment */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Vpc extends js.Object {
    /**
      * Get an existing Vpc resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcMod.Vpc = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcMod.VpcState
    ): atPulumiAwsLib.ec2VpcMod.Vpc = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcMod.VpcState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcMod.Vpc = js.native
    /**
      * Returns true if the given object is an instance of Vpc.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpc.Vpc */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcDhcpOptions extends js.Object {
    /**
      * Get an existing VpcDhcpOptions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcDhcpOptionsMod.VpcDhcpOptions = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcDhcpOptionsMod.VpcDhcpOptionsState
    ): atPulumiAwsLib.ec2VpcDhcpOptionsMod.VpcDhcpOptions = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcDhcpOptionsMod.VpcDhcpOptionsState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcDhcpOptionsMod.VpcDhcpOptions = js.native
    /**
      * Returns true if the given object is an instance of VpcDhcpOptions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptions.VpcDhcpOptions */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcDhcpOptionsAssociation extends js.Object {
    /**
      * Get an existing VpcDhcpOptionsAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociationState
    ): atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociation = js.native
    /**
      * Returns true if the given object is an instance of VpcDhcpOptionsAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptionsAssociation.VpcDhcpOptionsAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcEndpoint extends js.Object {
    /**
      * Get an existing VpcEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointMod.VpcEndpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointMod.VpcEndpointState
    ): atPulumiAwsLib.ec2VpcEndpointMod.VpcEndpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointMod.VpcEndpointState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcEndpointMod.VpcEndpoint = js.native
    /**
      * Returns true if the given object is an instance of VpcEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpoint.VpcEndpoint */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcEndpointConnectionNotification extends js.Object {
    /**
      * Get an existing VpcEndpointConnectionNotification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationState
    ): atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
    /**
      * Returns true if the given object is an instance of VpcEndpointConnectionNotification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointConnectionNotification.VpcEndpointConnectionNotification */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcEndpointRouteTableAssociation extends js.Object {
    /**
      * Get an existing VpcEndpointRouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationState
    ): atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
    /**
      * Returns true if the given object is an instance of VpcEndpointRouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointRouteTableAssociation.VpcEndpointRouteTableAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcEndpointService extends js.Object {
    /**
      * Get an existing VpcEndpointService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointService = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointServiceState
    ): atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointService = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointServiceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointService = js.native
    /**
      * Returns true if the given object is an instance of VpcEndpointService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointService.VpcEndpointService */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcEndpointServiceAllowedPrinciple extends js.Object {
    /**
      * Get an existing VpcEndpointServiceAllowedPrinciple resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrinciple = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrincipleState
    ): atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrinciple = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrincipleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrinciple = js.native
    /**
      * Returns true if the given object is an instance of VpcEndpointServiceAllowedPrinciple.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple.VpcEndpointServiceAllowedPrinciple */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcEndpointSubnetAssociation extends js.Object {
    /**
      * Get an existing VpcEndpointSubnetAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociationState
    ): atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod.VpcEndpointSubnetAssociation = js.native
    /**
      * Returns true if the given object is an instance of VpcEndpointSubnetAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointSubnetAssociation.VpcEndpointSubnetAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcIpv4CidrBlockAssociation extends js.Object {
    /**
      * Get an existing VpcIpv4CidrBlockAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationState
    ): atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
    /**
      * Returns true if the given object is an instance of VpcIpv4CidrBlockAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation.VpcIpv4CidrBlockAssociation */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcPeeringConnection extends js.Object {
    /**
      * Get an existing VpcPeeringConnection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnectionState
    ): atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnectionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnection = js.native
    /**
      * Returns true if the given object is an instance of VpcPeeringConnection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnection.VpcPeeringConnection */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcPeeringConnectionAccepter extends js.Object {
    /**
      * Get an existing VpcPeeringConnectionAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterState
    ): atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
    /**
      * Returns true if the given object is an instance of VpcPeeringConnectionAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpnConnection extends js.Object {
    /**
      * Get an existing VpnConnection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnConnectionMod.VpnConnection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnConnectionMod.VpnConnectionState
    ): atPulumiAwsLib.ec2VpnConnectionMod.VpnConnection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnConnectionMod.VpnConnectionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpnConnectionMod.VpnConnection = js.native
    /**
      * Returns true if the given object is an instance of VpnConnection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnection.VpnConnection */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpnConnectionRoute extends js.Object {
    /**
      * Get an existing VpnConnectionRoute resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRoute = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRouteState
    ): atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRoute = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRouteState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRoute = js.native
    /**
      * Returns true if the given object is an instance of VpnConnectionRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnectionRoute.VpnConnectionRoute */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpnGateway extends js.Object {
    /**
      * Get an existing VpnGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnGatewayMod.VpnGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnGatewayMod.VpnGatewayState
    ): atPulumiAwsLib.ec2VpnGatewayMod.VpnGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnGatewayMod.VpnGatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpnGatewayMod.VpnGateway = js.native
    /**
      * Returns true if the given object is an instance of VpnGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGateway.VpnGateway */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpnGatewayAttachment extends js.Object {
    /**
      * Get an existing VpnGatewayAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachmentState
    ): atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachment = js.native
    /**
      * Returns true if the given object is an instance of VpnGatewayAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGatewayAttachment.VpnGatewayAttachment */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpnGatewayRoutePropagation extends js.Object {
    /**
      * Get an existing VpnGatewayRoutePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagationState
    ): atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagation = js.native
    /**
      * Returns true if the given object is an instance of VpnGatewayRoutePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGatewayRoutePropagation.VpnGatewayRoutePropagation */ scala.Boolean = js.native
  }
  
}


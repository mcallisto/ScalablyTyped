package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "docdb")
@js.native
object docdbNs extends js.Object {
  @js.native
  class Cluster protected ()
    extends atPulumiAwsLib.docdbMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterMod.ClusterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterMod.ClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterInstance protected ()
    extends atPulumiAwsLib.docdbMod.ClusterInstance {
    /**
      * Create a ClusterInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterInstanceMod.ClusterInstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterInstanceMod.ClusterInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterParameterGroup protected ()
    extends atPulumiAwsLib.docdbMod.ClusterParameterGroup {
    /**
      * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterParameterGroupMod.ClusterParameterGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterParameterGroupMod.ClusterParameterGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterSnapshot protected ()
    extends atPulumiAwsLib.docdbMod.ClusterSnapshot {
    /**
      * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterSnapshotMod.ClusterSnapshotArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbClusterSnapshotMod.ClusterSnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SubnetGroup protected ()
    extends atPulumiAwsLib.docdbMod.SubnetGroup {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbSubnetGroupMod.SubnetGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.docdbSubnetGroupMod.SubnetGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.docdbClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterMod.ClusterState
    ): atPulumiAwsLib.docdbClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterMod.ClusterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.docdbClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/cluster.Cluster */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterInstance extends js.Object {
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.docdbClusterInstanceMod.ClusterInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterInstanceMod.ClusterInstanceState
    ): atPulumiAwsLib.docdbClusterInstanceMod.ClusterInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterInstanceMod.ClusterInstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.docdbClusterInstanceMod.ClusterInstance = js.native
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterInstance.ClusterInstance */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterParameterGroup extends js.Object {
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.docdbClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterParameterGroupMod.ClusterParameterGroupState
    ): atPulumiAwsLib.docdbClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterParameterGroupMod.ClusterParameterGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.docdbClusterParameterGroupMod.ClusterParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterParameterGroup.ClusterParameterGroup */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterSnapshot extends js.Object {
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.docdbClusterSnapshotMod.ClusterSnapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterSnapshotMod.ClusterSnapshotState
    ): atPulumiAwsLib.docdbClusterSnapshotMod.ClusterSnapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbClusterSnapshotMod.ClusterSnapshotState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.docdbClusterSnapshotMod.ClusterSnapshot = js.native
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterSnapshot.ClusterSnapshot */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SubnetGroup extends js.Object {
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.docdbSubnetGroupMod.SubnetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbSubnetGroupMod.SubnetGroupState
    ): atPulumiAwsLib.docdbSubnetGroupMod.SubnetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.docdbSubnetGroupMod.SubnetGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.docdbSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/subnetGroup.SubnetGroup */ scala.Boolean = js.native
  }
  
}


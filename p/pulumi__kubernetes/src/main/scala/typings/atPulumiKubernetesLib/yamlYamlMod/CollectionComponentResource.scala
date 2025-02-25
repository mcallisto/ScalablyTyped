package typings
package atPulumiKubernetesLib.yamlYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/yaml/yaml", "CollectionComponentResource")
@js.native
abstract class CollectionComponentResource protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.ComponentResource {
  def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any) = this()
  def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  var getResourceImpl: js.Any = js.native
  var resources: atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
  ] = js.native
  /**
    * getCustomResource returns a resource defined by a CRD with the given group/version/kind and name.
    *
    * For example:
    *     getCustomResource("monitoring.coreos.com/v1/ServiceMonitor", "kube-prometheus-exporter-kubernetes")
    */
  def getCustomResource[T /* <: atPulumiPulumiLib.atPulumiPulumiMod.CustomResource */](groupVersionKind: java.lang.String, namespace: java.lang.String): atPulumiPulumiLib.outputMod.Output[T] = js.native
  def getCustomResource[T /* <: atPulumiPulumiLib.atPulumiPulumiMod.CustomResource */](groupVersionKind: java.lang.String, namespace: java.lang.String, name: java.lang.String): atPulumiPulumiLib.outputMod.Output[T] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfigurationList
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfigurationList
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  /**
    * getResourceProperty returns a single property of a resource defined by a built-in Kubernetes group/version/kind and name.
    *
    * For example:
    *     getResourceProperty("v1/Service", "nginx", "spec")
    */
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfiguration] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhook
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfiguration] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhook
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ValidatingWebhookConfigurationList
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ValidatingWebhookConfigurationList
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ValidatingWebhookConfiguration
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhook
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ValidatingWebhookConfiguration
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhook
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinitionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinitionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinition] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinition] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ControllerRevision]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevisionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ControllerRevision]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevisionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevision] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevision] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ControllerRevision]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevisionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ControllerRevision]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevisionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevision] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevision] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ControllerRevision]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevisionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ControllerRevision]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevisionList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevision] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ControllerRevision] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StatefulSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSink]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSinkList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSink]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSinkList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSink] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSinkSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSink] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSinkSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.TokenReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.TokenReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.TokenReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.TokenReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectRulesReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectRulesReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectRulesReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectRulesReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectRulesReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectRulesReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectRulesReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectRulesReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectRulesReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectRulesReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SubjectAccessReview] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.Job]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.JobList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.Job]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.JobList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Job] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Job] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJob]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJob]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJob] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJob] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJob]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJob]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJob] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJob] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CertificateSigningRequestList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
    ]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CertificateSigningRequestList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CertificateSigningRequest] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CertificateSigningRequest] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestSpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1Ns.Lease]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LeaseList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1Ns.Lease]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LeaseList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Lease] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1Ns.LeaseSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Lease] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1Ns.LeaseSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.Lease]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LeaseList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.Lease]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LeaseList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Lease] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.LeaseSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Lease] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.LeaseSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.Event]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.EventList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.Event]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.EventList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_count
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_first_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_last_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_source
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.note
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.regarding
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_controller
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.EventSeries] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_count
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_first_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_last_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_source
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.note
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.regarding
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_controller
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.EventSeries] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Deployment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Ingress]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.IngressList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Ingress]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.IngressList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Ingress] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Ingress] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicy]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicy]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicySpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicySpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicySpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicySpec
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSet]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicy]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicy]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicySpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicySpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.Ingress]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.IngressList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.Ingress]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.IngressList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Ingress] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.IngressSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.IngressStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Ingress] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.IngressSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.IngressStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.nodeNs.v1alpha1Ns.RuntimeClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.nodeNs.v1alpha1Ns.RuntimeClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.nodeNs.v1alpha1Ns.RuntimeClassSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.nodeNs.v1alpha1Ns.RuntimeClassSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.nodeNs.v1beta1Ns.RuntimeClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.nodeNs.v1beta1Ns.RuntimeClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.handler
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.handler
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudget]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudgetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudget]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudgetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudget] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudget] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetStatus
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicy]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicy]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicyList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicySpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicy] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicySpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRole]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRole]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.AggregationRule] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.AggregationRule] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Role]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Role]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRole]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRole]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.AggregationRule] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.AggregationRule] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Role]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Role]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRoleBinding]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRoleBinding]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRole]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRole]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.AggregationRule] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.AggregationRule] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleBinding]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Role]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Role]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1Ns.PriorityClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1Ns.PriorityClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preemption_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preemption_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1alpha1Ns.PriorityClass]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1alpha1Ns.PriorityClass]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preemption_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preemption_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1beta1Ns.PriorityClass]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1beta1Ns.PriorityClass]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preemption_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preemption_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPreset]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodPresetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPreset]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodPresetList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodPreset] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPresetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1`
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodPreset] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPresetSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.StorageClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.StorageClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
  ): atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
  ): atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachment]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachment]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachment]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSIDriver]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSIDriverList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSIDriver]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSIDriverList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSIDriver] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSIDriverSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSIDriver] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSIDriverSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSINode]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINodeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSINode]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINodeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINode] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSINodeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINode] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.CSINodeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.StorageClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.StorageClass]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
  ): atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
  ): atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachment]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachment]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Binding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.target
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Binding] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.target
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentStatus]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ComponentStatusList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentStatus]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ComponentStatusList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.conditions
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentCondition]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ComponentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.conditions
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentCondition]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ComponentStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ConfigMap]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ConfigMapList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ConfigMap]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ConfigMapList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.binary_data
  ): atPulumiPulumiLib.outputMod.Output[js.Object] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ConfigMap] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.binary_data
  ): atPulumiPulumiLib.outputMod.Output[js.Object] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ConfigMap] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Endpoints]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.EndpointsList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Endpoints]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.EndpointsList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Endpoints] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subsets
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EndpointSubset]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Endpoints] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subsets
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EndpointSubset]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Event]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.EventList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Event]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.EventList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.count
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.first_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.involved_object
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.last_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_component
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSeries] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.source
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.count
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.first_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.involved_object
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.last_timestamp
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_component
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSeries] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.source
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRange]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LimitRangeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRange]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LimitRangeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LimitRange] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRangeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LimitRange] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRangeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Namespace]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NamespaceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Namespace]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NamespaceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Namespace] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Namespace] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Node]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NodeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Node]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NodeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Node] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Node] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaim]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolumeClaimList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaim]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolumeClaimList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolumeClaim] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolumeClaim] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolume]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolumeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolume]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolumeList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolume] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PersistentVolume] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Pod]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Pod]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplate]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodTemplateList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplate]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodTemplateList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodTemplate] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.template
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodTemplate] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.template
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Pod] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Pod] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationController]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicationControllerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationController]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicationControllerList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicationController] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicationController] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuota]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ResourceQuotaList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuota]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ResourceQuotaList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ResourceQuota] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ResourceQuota] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Secret]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SecretList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Secret]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SecretList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[js.Object] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Secret] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.string_data
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
  ): atPulumiPulumiLib.outputMod.Output[js.Object] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Secret] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.string_data
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceAccount]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccountList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceAccount]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccountList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.automount_service_account_token
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.image_pull_secrets
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LocalObjectReference]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccount] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.secrets
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.automount_service_account_token
  ): atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.image_pull_secrets
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LocalObjectReference]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccount] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.secrets
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Service]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
  ): atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Service]] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceList] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Service] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Service] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceSpec] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceStatus] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.code
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.details
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.StatusDetails] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Status] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.code
  ): atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.details
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.StatusDetails] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Status] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getResourceProperty(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String,
    property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
  ): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * getResource returns a resource defined by a built-in Kubernetes group/version/kind and name.
    *
    * For example:
    *     getResource("apps/v1/Deployment", "nginx")
    */
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1MutatingWebhookConfiguration(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
  ] = js.native
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1MutatingWebhookConfiguration(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
  ] = js.native
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1MutatingWebhookConfigurationList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList
  ] = js.native
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1MutatingWebhookConfigurationList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList
  ] = js.native
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1ValidatingWebhookConfiguration(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
  ] = js.native
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1ValidatingWebhookConfiguration(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
  ] = js.native
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1ValidatingWebhookConfigurationList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList
  ] = js.native
  @JSName("getResource")
  def getResource_admissionregistrationk8siov1beta1ValidatingWebhookConfigurationList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList
  ] = js.native
  @JSName("getResource")
  def getResource_apiextensionsk8siov1beta1CustomResourceDefinition(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
  ] = js.native
  @JSName("getResource")
  def getResource_apiextensionsk8siov1beta1CustomResourceDefinition(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
  ] = js.native
  @JSName("getResource")
  def getResource_apiextensionsk8siov1beta1CustomResourceDefinitionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList
  ] = js.native
  @JSName("getResource")
  def getResource_apiextensionsk8siov1beta1CustomResourceDefinitionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIService] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIService] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1beta1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIService
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1beta1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIService
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1beta1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationk8siov1beta1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIService] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIService] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1beta1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIService
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1beta1APIService(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIService
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1beta1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_apiregistrationv1beta1APIServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.apiregistrationNs.v1beta1Ns.APIServiceList
  ] = js.native
  @JSName("getResource")
  def getResource_appsv1ControllerRevision(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ControllerRevision] = js.native
  @JSName("getResource")
  def getResource_appsv1ControllerRevision(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ControllerRevision] = js.native
  @JSName("getResource")
  def getResource_appsv1ControllerRevisionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ControllerRevisionList] = js.native
  @JSName("getResource")
  def getResource_appsv1ControllerRevisionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ControllerRevisionList] = js.native
  @JSName("getResource")
  def getResource_appsv1DaemonSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.DaemonSet] = js.native
  @JSName("getResource")
  def getResource_appsv1DaemonSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.DaemonSet] = js.native
  @JSName("getResource")
  def getResource_appsv1DaemonSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.DaemonSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1DaemonSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.DaemonSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_appsv1Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_appsv1DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.DeploymentList] = js.native
  @JSName("getResource")
  def getResource_appsv1DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.DeploymentList] = js.native
  @JSName("getResource")
  def getResource_appsv1ReplicaSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ReplicaSet] = js.native
  @JSName("getResource")
  def getResource_appsv1ReplicaSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ReplicaSet] = js.native
  @JSName("getResource")
  def getResource_appsv1ReplicaSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ReplicaSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1ReplicaSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.ReplicaSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1StatefulSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.StatefulSet] = js.native
  @JSName("getResource")
  def getResource_appsv1StatefulSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.StatefulSet] = js.native
  @JSName("getResource")
  def getResource_appsv1StatefulSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.StatefulSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1StatefulSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1Ns.StatefulSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1ControllerRevision(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.ControllerRevision] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1ControllerRevision(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.ControllerRevision] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1ControllerRevisionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.ControllerRevisionList
  ] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1ControllerRevisionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.ControllerRevisionList
  ] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.DeploymentList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.DeploymentList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1StatefulSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.StatefulSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1StatefulSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.StatefulSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1StatefulSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.StatefulSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta1StatefulSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta1Ns.StatefulSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ControllerRevision(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ControllerRevision] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ControllerRevision(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ControllerRevision] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ControllerRevisionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ControllerRevisionList
  ] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ControllerRevisionList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ControllerRevisionList
  ] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2DaemonSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.DaemonSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2DaemonSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.DaemonSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2DaemonSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.DaemonSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2DaemonSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.DaemonSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.DeploymentList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.DeploymentList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ReplicaSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ReplicaSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ReplicaSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ReplicaSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ReplicaSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ReplicaSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2ReplicaSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.ReplicaSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2StatefulSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.StatefulSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2StatefulSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.StatefulSet] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2StatefulSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.StatefulSetList] = js.native
  @JSName("getResource")
  def getResource_appsv1beta2StatefulSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.appsNs.v1beta2Ns.StatefulSetList] = js.native
  @JSName("getResource")
  def getResource_auditregistrationk8siov1alpha1AuditSink(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.auditregistrationNs.v1alpha1Ns.AuditSink
  ] = js.native
  @JSName("getResource")
  def getResource_auditregistrationk8siov1alpha1AuditSink(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.auditregistrationNs.v1alpha1Ns.AuditSink
  ] = js.native
  @JSName("getResource")
  def getResource_auditregistrationk8siov1alpha1AuditSinkList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.auditregistrationNs.v1alpha1Ns.AuditSinkList
  ] = js.native
  @JSName("getResource")
  def getResource_auditregistrationk8siov1alpha1AuditSinkList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.auditregistrationNs.v1alpha1Ns.AuditSinkList
  ] = js.native
  @JSName("getResource")
  def getResource_authenticationk8siov1TokenReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.authenticationNs.v1Ns.TokenReview] = js.native
  @JSName("getResource")
  def getResource_authenticationk8siov1TokenReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.authenticationNs.v1Ns.TokenReview] = js.native
  @JSName("getResource")
  def getResource_authenticationk8siov1beta1TokenReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authenticationNs.v1beta1Ns.TokenReview
  ] = js.native
  @JSName("getResource")
  def getResource_authenticationk8siov1beta1TokenReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authenticationNs.v1beta1Ns.TokenReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1LocalSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.LocalSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1LocalSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.LocalSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1SelfSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.SelfSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1SelfSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.SelfSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1SelfSubjectRulesReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.SelfSubjectRulesReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1SelfSubjectRulesReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.SelfSubjectRulesReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1SubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.SubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1SubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1Ns.SubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1LocalSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1LocalSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1SelfSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1SelfSubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1SelfSubjectRulesReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1SelfSubjectRulesReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1SubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.SubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_authorizationk8siov1beta1SubjectAccessReview(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.authorizationNs.v1beta1Ns.SubjectAccessReview
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv1HorizontalPodAutoscaler(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv1HorizontalPodAutoscaler(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv1HorizontalPodAutoscalerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv1HorizontalPodAutoscalerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta1HorizontalPodAutoscaler(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta1HorizontalPodAutoscaler(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta1HorizontalPodAutoscalerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta1HorizontalPodAutoscalerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta2HorizontalPodAutoscaler(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta2HorizontalPodAutoscaler(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta2HorizontalPodAutoscalerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList
  ] = js.native
  @JSName("getResource")
  def getResource_autoscalingv2beta2HorizontalPodAutoscalerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList
  ] = js.native
  @JSName("getResource")
  def getResource_batchv1Job(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1Ns.Job] = js.native
  @JSName("getResource")
  def getResource_batchv1Job(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1Ns.Job] = js.native
  @JSName("getResource")
  def getResource_batchv1JobList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1Ns.JobList] = js.native
  @JSName("getResource")
  def getResource_batchv1JobList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1Ns.JobList] = js.native
  @JSName("getResource")
  def getResource_batchv1beta1CronJob(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1beta1Ns.CronJob] = js.native
  @JSName("getResource")
  def getResource_batchv1beta1CronJob(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1beta1Ns.CronJob] = js.native
  @JSName("getResource")
  def getResource_batchv1beta1CronJobList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1beta1Ns.CronJobList] = js.native
  @JSName("getResource")
  def getResource_batchv1beta1CronJobList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v1beta1Ns.CronJobList] = js.native
  @JSName("getResource")
  def getResource_batchv2alpha1CronJob(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v2alpha1Ns.CronJob] = js.native
  @JSName("getResource")
  def getResource_batchv2alpha1CronJob(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v2alpha1Ns.CronJob] = js.native
  @JSName("getResource")
  def getResource_batchv2alpha1CronJobList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v2alpha1Ns.CronJobList] = js.native
  @JSName("getResource")
  def getResource_batchv2alpha1CronJobList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.batchNs.v2alpha1Ns.CronJobList] = js.native
  @JSName("getResource")
  def getResource_certificatesk8siov1beta1CertificateSigningRequest(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
  ] = js.native
  @JSName("getResource")
  def getResource_certificatesk8siov1beta1CertificateSigningRequest(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
  ] = js.native
  @JSName("getResource")
  def getResource_certificatesk8siov1beta1CertificateSigningRequestList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList
  ] = js.native
  @JSName("getResource")
  def getResource_certificatesk8siov1beta1CertificateSigningRequestList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList
  ] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1Lease(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1Ns.Lease] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1Lease(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1Ns.Lease] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1LeaseList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1Ns.LeaseList] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1LeaseList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1Ns.LeaseList] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1beta1Lease(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1beta1Ns.Lease] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1beta1Lease(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1beta1Ns.Lease] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1beta1LeaseList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1beta1Ns.LeaseList] = js.native
  @JSName("getResource")
  def getResource_coordinationk8siov1beta1LeaseList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coordinationNs.v1beta1Ns.LeaseList] = js.native
  @JSName("getResource")
  def getResource_eventsk8siov1beta1Event(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.eventsNs.v1beta1Ns.Event] = js.native
  @JSName("getResource")
  def getResource_eventsk8siov1beta1Event(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.eventsNs.v1beta1Ns.Event] = js.native
  @JSName("getResource")
  def getResource_eventsk8siov1beta1EventList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.eventsNs.v1beta1Ns.EventList] = js.native
  @JSName("getResource")
  def getResource_eventsk8siov1beta1EventList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.eventsNs.v1beta1Ns.EventList] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1DaemonSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.DaemonSet] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1DaemonSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.DaemonSet] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1DaemonSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.DaemonSetList] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1DaemonSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.DaemonSetList] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1Deployment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.Deployment] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.DeploymentList
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1DeploymentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.DeploymentList
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1Ingress(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.Ingress] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1Ingress(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.Ingress] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1IngressList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.IngressList] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1IngressList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.IngressList] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1NetworkPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.NetworkPolicy] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1NetworkPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.NetworkPolicy] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1NetworkPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.NetworkPolicyList
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1NetworkPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.NetworkPolicyList
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1PodSecurityPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.PodSecurityPolicy
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1PodSecurityPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.PodSecurityPolicy
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1PodSecurityPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1PodSecurityPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1ReplicaSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.ReplicaSet] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1ReplicaSet(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.ReplicaSet] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1ReplicaSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.ReplicaSetList
  ] = js.native
  @JSName("getResource")
  def getResource_extensionsv1beta1ReplicaSetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.extensionsNs.v1beta1Ns.ReplicaSetList
  ] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1NetworkPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1Ns.NetworkPolicy] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1NetworkPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1Ns.NetworkPolicy] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1NetworkPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1Ns.NetworkPolicyList] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1NetworkPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1Ns.NetworkPolicyList] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1beta1Ingress(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1beta1Ns.Ingress] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1beta1Ingress(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/Ingress`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1beta1Ns.Ingress] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1beta1IngressList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1beta1Ns.IngressList] = js.native
  @JSName("getResource")
  def getResource_networkingk8siov1beta1IngressList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1/IngressList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.networkingNs.v1beta1Ns.IngressList] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1alpha1RuntimeClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1alpha1Ns.RuntimeClass] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1alpha1RuntimeClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1alpha1Ns.RuntimeClass] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1alpha1RuntimeClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1alpha1Ns.RuntimeClassList] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1alpha1RuntimeClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1alpha1Ns.RuntimeClassList] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1beta1RuntimeClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1beta1Ns.RuntimeClass] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1beta1RuntimeClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClass`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1beta1Ns.RuntimeClass] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1beta1RuntimeClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1beta1Ns.RuntimeClassList] = js.native
  @JSName("getResource")
  def getResource_nodek8siov1beta1RuntimeClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1/RuntimeClassList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.nodeNs.v1beta1Ns.RuntimeClassList] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodDisruptionBudget(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodDisruptionBudget
  ] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodDisruptionBudget(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodDisruptionBudget
  ] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodDisruptionBudgetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodDisruptionBudgetList
  ] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodDisruptionBudgetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodDisruptionBudgetList
  ] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodSecurityPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodSecurityPolicy] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodSecurityPolicy(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodSecurityPolicy] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodSecurityPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodSecurityPolicyList
  ] = js.native
  @JSName("getResource")
  def getResource_policyv1beta1PodSecurityPolicyList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.policyNs.v1beta1Ns.PodSecurityPolicyList
  ] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRole(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRole] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRole(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRole] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1ClusterRoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.ClusterRoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1Role(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.Role] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1Role(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.Role] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1RoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.RoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1RoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.RoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1RoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.RoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1RoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.RoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1RoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.RoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1RoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1Ns.RoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRole(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRole] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRole(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRole] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList
  ] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList
  ] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1ClusterRoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.ClusterRoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1Role(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.Role] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1Role(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.Role] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1RoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.RoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1RoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.RoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1RoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.RoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1RoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.RoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1RoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.RoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1alpha1RoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1alpha1Ns.RoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRole(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRole] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRole(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRole] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRoleBindingList
  ] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRoleBindingList
  ] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1ClusterRoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.ClusterRoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1Role(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.Role] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1Role(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.Role] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1RoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.RoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1RoleBinding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.RoleBinding] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1RoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.RoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1RoleBindingList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.RoleBindingList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1RoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.RoleList] = js.native
  @JSName("getResource")
  def getResource_rbacauthorizationk8siov1beta1RoleList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.rbacNs.v1beta1Ns.RoleList] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1PriorityClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1Ns.PriorityClass] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1PriorityClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1Ns.PriorityClass] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1PriorityClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1Ns.PriorityClassList] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1PriorityClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1Ns.PriorityClassList] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1alpha1PriorityClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1alpha1Ns.PriorityClass
  ] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1alpha1PriorityClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1alpha1Ns.PriorityClass
  ] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1alpha1PriorityClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1alpha1Ns.PriorityClassList
  ] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1alpha1PriorityClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1alpha1Ns.PriorityClassList
  ] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1beta1PriorityClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1beta1Ns.PriorityClass] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1beta1PriorityClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1beta1Ns.PriorityClass] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1beta1PriorityClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1beta1Ns.PriorityClassList
  ] = js.native
  @JSName("getResource")
  def getResource_schedulingk8siov1beta1PriorityClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.schedulingNs.v1beta1Ns.PriorityClassList
  ] = js.native
  @JSName("getResource")
  def getResource_settingsk8siov1alpha1PodPreset(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.settingsNs.v1alpha1Ns.PodPreset] = js.native
  @JSName("getResource")
  def getResource_settingsk8siov1alpha1PodPreset(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.settingsNs.v1alpha1Ns.PodPreset] = js.native
  @JSName("getResource")
  def getResource_settingsk8siov1alpha1PodPresetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.settingsNs.v1alpha1Ns.PodPresetList] = js.native
  @JSName("getResource")
  def getResource_settingsk8siov1alpha1PodPresetList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.settingsNs.v1alpha1Ns.PodPresetList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1StorageClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.StorageClass] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1StorageClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.StorageClass] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1StorageClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.StorageClassList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1StorageClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.StorageClassList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1VolumeAttachment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.VolumeAttachment] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1VolumeAttachment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.VolumeAttachment] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1VolumeAttachmentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.VolumeAttachmentList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1VolumeAttachmentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1Ns.VolumeAttachmentList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1alpha1VolumeAttachment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1alpha1Ns.VolumeAttachment
  ] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1alpha1VolumeAttachment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1alpha1Ns.VolumeAttachment
  ] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1alpha1VolumeAttachmentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1alpha1Ns.VolumeAttachmentList
  ] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1alpha1VolumeAttachmentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1alpha1Ns.VolumeAttachmentList
  ] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSIDriver(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSIDriver] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSIDriver(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriver`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSIDriver] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSIDriverList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSIDriverList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSIDriverList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSIDriverList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSIDriverList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSINode(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSINode] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSINode(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINode`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSINode] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSINodeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSINodeList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1CSINodeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/CSINodeList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.CSINodeList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1StorageClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.StorageClass] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1StorageClass(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.StorageClass] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1StorageClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.StorageClassList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1StorageClassList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.StorageClassList] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1VolumeAttachment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.VolumeAttachment] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1VolumeAttachment(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.VolumeAttachment] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1VolumeAttachmentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.VolumeAttachmentList
  ] = js.native
  @JSName("getResource")
  def getResource_storagek8siov1beta1VolumeAttachmentList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.storageNs.v1beta1Ns.VolumeAttachmentList
  ] = js.native
  @JSName("getResource")
  def getResource_v1Binding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Binding] = js.native
  @JSName("getResource")
  def getResource_v1Binding(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Binding] = js.native
  @JSName("getResource")
  def getResource_v1ComponentStatus(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ComponentStatus] = js.native
  @JSName("getResource")
  def getResource_v1ComponentStatus(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ComponentStatus] = js.native
  @JSName("getResource")
  def getResource_v1ComponentStatusList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ComponentStatusList] = js.native
  @JSName("getResource")
  def getResource_v1ComponentStatusList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ComponentStatusList] = js.native
  @JSName("getResource")
  def getResource_v1ConfigMap(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ConfigMap] = js.native
  @JSName("getResource")
  def getResource_v1ConfigMap(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ConfigMap] = js.native
  @JSName("getResource")
  def getResource_v1ConfigMapList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ConfigMapList] = js.native
  @JSName("getResource")
  def getResource_v1ConfigMapList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ConfigMapList] = js.native
  @JSName("getResource")
  def getResource_v1Endpoints(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Endpoints] = js.native
  @JSName("getResource")
  def getResource_v1Endpoints(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Endpoints] = js.native
  @JSName("getResource")
  def getResource_v1EndpointsList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.EndpointsList] = js.native
  @JSName("getResource")
  def getResource_v1EndpointsList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.EndpointsList] = js.native
  @JSName("getResource")
  def getResource_v1Event(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Event] = js.native
  @JSName("getResource")
  def getResource_v1Event(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Event] = js.native
  @JSName("getResource")
  def getResource_v1EventList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.EventList] = js.native
  @JSName("getResource")
  def getResource_v1EventList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.EventList] = js.native
  @JSName("getResource")
  def getResource_v1LimitRange(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.LimitRange] = js.native
  @JSName("getResource")
  def getResource_v1LimitRange(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.LimitRange] = js.native
  @JSName("getResource")
  def getResource_v1LimitRangeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.LimitRangeList] = js.native
  @JSName("getResource")
  def getResource_v1LimitRangeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.LimitRangeList] = js.native
  @JSName("getResource")
  def getResource_v1Namespace(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Namespace] = js.native
  @JSName("getResource")
  def getResource_v1Namespace(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Namespace] = js.native
  @JSName("getResource")
  def getResource_v1NamespaceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.NamespaceList] = js.native
  @JSName("getResource")
  def getResource_v1NamespaceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.NamespaceList] = js.native
  @JSName("getResource")
  def getResource_v1Node(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Node] = js.native
  @JSName("getResource")
  def getResource_v1Node(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Node] = js.native
  @JSName("getResource")
  def getResource_v1NodeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.NodeList] = js.native
  @JSName("getResource")
  def getResource_v1NodeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.NodeList] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolume(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolume] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolume(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolume] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolumeClaim(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolumeClaim] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolumeClaim(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolumeClaim] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolumeClaimList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolumeClaimList
  ] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolumeClaimList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolumeClaimList
  ] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolumeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolumeList] = js.native
  @JSName("getResource")
  def getResource_v1PersistentVolumeList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PersistentVolumeList] = js.native
  @JSName("getResource")
  def getResource_v1Pod(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Pod] = js.native
  @JSName("getResource")
  def getResource_v1Pod(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Pod] = js.native
  @JSName("getResource")
  def getResource_v1PodList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PodList] = js.native
  @JSName("getResource")
  def getResource_v1PodList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PodList] = js.native
  @JSName("getResource")
  def getResource_v1PodTemplate(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PodTemplate] = js.native
  @JSName("getResource")
  def getResource_v1PodTemplate(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PodTemplate] = js.native
  @JSName("getResource")
  def getResource_v1PodTemplateList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PodTemplateList] = js.native
  @JSName("getResource")
  def getResource_v1PodTemplateList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.PodTemplateList] = js.native
  @JSName("getResource")
  def getResource_v1ReplicationController(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ReplicationController] = js.native
  @JSName("getResource")
  def getResource_v1ReplicationController(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ReplicationController] = js.native
  @JSName("getResource")
  def getResource_v1ReplicationControllerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ReplicationControllerList
  ] = js.native
  @JSName("getResource")
  def getResource_v1ReplicationControllerList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ReplicationControllerList
  ] = js.native
  @JSName("getResource")
  def getResource_v1ResourceQuota(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ResourceQuota] = js.native
  @JSName("getResource")
  def getResource_v1ResourceQuota(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ResourceQuota] = js.native
  @JSName("getResource")
  def getResource_v1ResourceQuotaList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ResourceQuotaList] = js.native
  @JSName("getResource")
  def getResource_v1ResourceQuotaList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ResourceQuotaList] = js.native
  @JSName("getResource")
  def getResource_v1Secret(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Secret] = js.native
  @JSName("getResource")
  def getResource_v1Secret(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Secret] = js.native
  @JSName("getResource")
  def getResource_v1SecretList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.SecretList] = js.native
  @JSName("getResource")
  def getResource_v1SecretList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.SecretList] = js.native
  @JSName("getResource")
  def getResource_v1Service(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Service] = js.native
  @JSName("getResource")
  def getResource_v1Service(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.Service] = js.native
  @JSName("getResource")
  def getResource_v1ServiceAccount(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ServiceAccount] = js.native
  @JSName("getResource")
  def getResource_v1ServiceAccount(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ServiceAccount] = js.native
  @JSName("getResource")
  def getResource_v1ServiceAccountList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ServiceAccountList] = js.native
  @JSName("getResource")
  def getResource_v1ServiceAccountList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ServiceAccountList] = js.native
  @JSName("getResource")
  def getResource_v1ServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ServiceList] = js.native
  @JSName("getResource")
  def getResource_v1ServiceList(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.coreNs.v1Ns.ServiceList] = js.native
  @JSName("getResource")
  def getResource_v1Status(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.metaNs.v1Ns.Status] = js.native
  @JSName("getResource")
  def getResource_v1Status(
    groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
    namespace: java.lang.String,
    name: java.lang.String
  ): atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesMod.metaNs.v1Ns.Status] = js.native
}


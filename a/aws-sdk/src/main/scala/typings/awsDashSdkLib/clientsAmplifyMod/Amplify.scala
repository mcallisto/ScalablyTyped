package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amplify
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Amplify: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    *  Creates a new Amplify App. 
    */
  def createApp(): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a new Amplify App. 
    */
  def createApp(params: CreateAppRequest): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a new Branch for an Amplify App. 
    */
  def createBranch(): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a new Branch for an Amplify App. 
    */
  def createBranch(params: CreateBranchRequest): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBranch(
    params: CreateBranchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def createDeployment(params: CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def createDomainAssociation(): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def createDomainAssociation(params: CreateDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainAssociation(
    params: CreateDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a new webhook on an App. 
    */
  def createWebhook(): awsDashSdkLib.libRequestMod.Request[CreateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a new webhook on an App. 
    */
  def createWebhook(params: CreateWebhookRequest): awsDashSdkLib.libRequestMod.Request[CreateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWebhook(
    params: CreateWebhookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Delete an existing Amplify App by appId. 
    */
  def deleteApp(): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Delete an existing Amplify App by appId. 
    */
  def deleteApp(params: DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a branch for an Amplify App. 
    */
  def deleteBranch(): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a branch for an Amplify App. 
    */
  def deleteBranch(params: DeleteBranchRequest): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBranch(
    params: DeleteBranchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a DomainAssociation. 
    */
  def deleteDomainAssociation(): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a DomainAssociation. 
    */
  def deleteDomainAssociation(params: DeleteDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainAssociation(
    params: DeleteDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Delete a job, for an Amplify branch, part of Amplify App. 
    */
  def deleteJob(): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Delete a job, for an Amplify branch, part of Amplify App. 
    */
  def deleteJob(params: DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a webhook. 
    */
  def deleteWebhook(): awsDashSdkLib.libRequestMod.Request[DeleteWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a webhook. 
    */
  def deleteWebhook(params: DeleteWebhookRequest): awsDashSdkLib.libRequestMod.Request[DeleteWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWebhook(
    params: DeleteWebhookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves an existing Amplify App by appId. 
    */
  def getApp(): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves an existing Amplify App by appId. 
    */
  def getApp(params: GetAppRequest): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    params: GetAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves a branch for an Amplify App. 
    */
  def getBranch(): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBranch(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBranchResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves a branch for an Amplify App. 
    */
  def getBranch(params: GetBranchRequest): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBranch(
    params: GetBranchRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBranchResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves domain info that corresponds to an appId and domainName. 
    */
  def getDomainAssociation(): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves domain info that corresponds to an appId and domainName. 
    */
  def getDomainAssociation(params: GetDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainAssociation(
    params: GetDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Get a job for a branch, part of an Amplify App. 
    */
  def getJob(): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Get a job for a branch, part of an Amplify App. 
    */
  def getJob(params: GetJobRequest): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    params: GetJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves webhook info that corresponds to a webhookId. 
    */
  def getWebhook(): awsDashSdkLib.libRequestMod.Request[GetWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Retrieves webhook info that corresponds to a webhookId. 
    */
  def getWebhook(params: GetWebhookRequest): awsDashSdkLib.libRequestMod.Request[GetWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWebhook(
    params: GetWebhookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists existing Amplify Apps. 
    */
  def listApps(): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApps(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListAppsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists existing Amplify Apps. 
    */
  def listApps(params: ListAppsRequest): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListAppsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists branches for an Amplify App. 
    */
  def listBranches(): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBranches(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBranchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists branches for an Amplify App. 
    */
  def listBranches(params: ListBranchesRequest): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBranches(
    params: ListBranchesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBranchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List domains with an app 
    */
  def listDomainAssociations(): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDomainAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDomainAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List domains with an app 
    */
  def listDomainAssociations(params: ListDomainAssociationsRequest): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDomainAssociations(
    params: ListDomainAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDomainAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List Jobs for a branch, part of an Amplify App. 
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List Jobs for a branch, part of an Amplify App. 
    */
  def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List tags for resource. 
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List tags for resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List webhooks with an app. 
    */
  def listWebhooks(): awsDashSdkLib.libRequestMod.Request[ListWebhooksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWebhooks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWebhooksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWebhooksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List webhooks with an app. 
    */
  def listWebhooks(params: ListWebhooksRequest): awsDashSdkLib.libRequestMod.Request[ListWebhooksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWebhooks(
    params: ListWebhooksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWebhooksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWebhooksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Start a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def startDeployment(): awsDashSdkLib.libRequestMod.Request[StartDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDeploymentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Start a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def startDeployment(params: StartDeploymentRequest): awsDashSdkLib.libRequestMod.Request[StartDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDeployment(
    params: StartDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDeploymentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Starts a new job for a branch, part of an Amplify App. 
    */
  def startJob(): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StartJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Starts a new job for a branch, part of an Amplify App. 
    */
  def startJob(params: StartJobRequest): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startJob(
    params: StartJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StartJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
    */
  def stopJob(): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
    */
  def stopJob(params: StopJobRequest): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopJob(
    params: StopJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Tag resource with tag key and value. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Tag resource with tag key and value. 
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Untag resource with resourceArn. 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Untag resource with resourceArn. 
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Updates an existing Amplify App. 
    */
  def updateApp(): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Updates an existing Amplify App. 
    */
  def updateApp(params: UpdateAppRequest): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApp(
    params: UpdateAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateAppResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Updates a branch for an Amplify App. 
    */
  def updateBranch(): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Updates a branch for an Amplify App. 
    */
  def updateBranch(params: UpdateBranchRequest): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBranch(
    params: UpdateBranchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def updateDomainAssociation(): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def updateDomainAssociation(params: UpdateDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainAssociation(
    params: UpdateDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Update a webhook. 
    */
  def updateWebhook(): awsDashSdkLib.libRequestMod.Request[UpdateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Update a webhook. 
    */
  def updateWebhook(params: UpdateWebhookRequest): awsDashSdkLib.libRequestMod.Request[UpdateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWebhook(
    params: UpdateWebhookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWebhookResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWebhookResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}


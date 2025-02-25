package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Personalize
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Personalize: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a campaign by deploying a solution version. When a client calls the GetRecommendations and GetPersonalizedRanking APIs, a campaign is specified in the request.  Minimum Provisioned TPS and Auto-Scaling  A transaction is a single GetRecommendations or GetPersonalizedRanking call. Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum provisioned TPS (minProvisionedTPS) specifies the baseline throughput provisioned by Amazon Personalize, and thus, the minimum billing charge. If your TPS increases beyond minProvisionedTPS, Amazon Personalize auto-scales the provisioned capacity up and down, but never below minProvisionedTPS, to maintain a 70% utilization. There's a short time delay while the capacity is increased that might cause loss of transactions. It's recommended to start with a low minProvisionedTPS, track your usage using Amazon CloudWatch metrics, and then increase the minProvisionedTPS as necessary.  Status  A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the campaign status, call DescribeCampaign.  Wait until the status of the campaign is ACTIVE before asking the campaign for recommendations.   Related APIs     ListCampaigns     DescribeCampaign     UpdateCampaign     DeleteCampaign   
    */
  def createCampaign(): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a campaign by deploying a solution version. When a client calls the GetRecommendations and GetPersonalizedRanking APIs, a campaign is specified in the request.  Minimum Provisioned TPS and Auto-Scaling  A transaction is a single GetRecommendations or GetPersonalizedRanking call. Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum provisioned TPS (minProvisionedTPS) specifies the baseline throughput provisioned by Amazon Personalize, and thus, the minimum billing charge. If your TPS increases beyond minProvisionedTPS, Amazon Personalize auto-scales the provisioned capacity up and down, but never below minProvisionedTPS, to maintain a 70% utilization. There's a short time delay while the capacity is increased that might cause loss of transactions. It's recommended to start with a low minProvisionedTPS, track your usage using Amazon CloudWatch metrics, and then increase the minProvisionedTPS as necessary.  Status  A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the campaign status, call DescribeCampaign.  Wait until the status of the campaign is ACTIVE before asking the campaign for recommendations.   Related APIs     ListCampaigns     DescribeCampaign     UpdateCampaign     DeleteCampaign   
    */
  def createCampaign(params: CreateCampaignRequest): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCampaign(
    params: CreateCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty dataset and adds it to the specified dataset group. Use CreateDatasetImportJob to import your training data to a dataset. There are three types of datasets:   Interactions   Items   Users   Each dataset type has an associated schema with required field types. Only the Interactions dataset is required in order to train a model (also referred to as creating a solution). A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the dataset, call DescribeDataset.  Related APIs     CreateDatasetGroup     ListDatasets     DescribeDataset     DeleteDataset   
    */
  def createDataset(): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty dataset and adds it to the specified dataset group. Use CreateDatasetImportJob to import your training data to a dataset. There are three types of datasets:   Interactions   Items   Users   Each dataset type has an associated schema with required field types. Only the Interactions dataset is required in order to train a model (also referred to as creating a solution). A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the dataset, call DescribeDataset.  Related APIs     CreateDatasetGroup     ListDatasets     DescribeDataset     DeleteDataset   
    */
  def createDataset(params: CreateDatasetRequest): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty dataset group. A dataset group contains related datasets that supply data for training a model. A dataset group can contain at most three datasets, one for each type of dataset:   Interactions   Items   Users   To train a model (create a solution), a dataset group that contains an Interactions dataset is required. Call CreateDataset to add a dataset to the group. A dataset group can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING   To get the status of the dataset group, call DescribeDatasetGroup. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the creation failed.  You must wait until the status of the dataset group is ACTIVE before adding a dataset to the group.  You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a KMS key, you must also include an AWS Identity and Access Management (IAM) role that has permission to access the key.  APIs that require a dataset group ARN in the request     CreateDataset     CreateEventTracker     CreateSolution     Related APIs     ListDatasetGroups     DescribeDatasetGroup     DeleteDatasetGroup   
    */
  def createDatasetGroup(): awsDashSdkLib.libRequestMod.Request[CreateDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatasetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty dataset group. A dataset group contains related datasets that supply data for training a model. A dataset group can contain at most three datasets, one for each type of dataset:   Interactions   Items   Users   To train a model (create a solution), a dataset group that contains an Interactions dataset is required. Call CreateDataset to add a dataset to the group. A dataset group can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING   To get the status of the dataset group, call DescribeDatasetGroup. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the creation failed.  You must wait until the status of the dataset group is ACTIVE before adding a dataset to the group.  You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a KMS key, you must also include an AWS Identity and Access Management (IAM) role that has permission to access the key.  APIs that require a dataset group ARN in the request     CreateDataset     CreateEventTracker     CreateSolution     Related APIs     ListDatasetGroups     DescribeDatasetGroup     DeleteDatasetGroup   
    */
  def createDatasetGroup(params: CreateDatasetGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatasetGroup(
    params: CreateDatasetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize dataset. To allow Amazon Personalize to import the training data, you must specify an AWS Identity and Access Management (IAM) role that has permission to read from the data source.  The dataset import job replaces any previous data in the dataset.   Status  A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   To get the status of the import job, call DescribeDatasetImportJob, providing the Amazon Resource Name (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.   Related APIs     ListDatasetImportJobs     DescribeDatasetImportJob   
    */
  def createDatasetImportJob(): awsDashSdkLib.libRequestMod.Request[CreateDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatasetImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize dataset. To allow Amazon Personalize to import the training data, you must specify an AWS Identity and Access Management (IAM) role that has permission to read from the data source.  The dataset import job replaces any previous data in the dataset.   Status  A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   To get the status of the import job, call DescribeDatasetImportJob, providing the Amazon Resource Name (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.   Related APIs     ListDatasetImportJobs     DescribeDatasetImportJob   
    */
  def createDatasetImportJob(params: CreateDatasetImportJobRequest): awsDashSdkLib.libRequestMod.Request[CreateDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatasetImportJob(
    params: CreateDatasetImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an event tracker that you use when sending event data to the specified dataset group using the PutEvents API. When Amazon Personalize creates an event tracker, it also creates an event-interactions dataset in the dataset group associated with the event tracker. The event-interactions dataset stores the event data from the PutEvents call. The contents of this dataset are not available to the user.  Only one event tracker can be associated with a dataset group. You will get an error if you call CreateEventTracker using the same dataset group as an existing event tracker.  When you send event data you include your tracking ID. The tracking ID identifies the customer and authorizes the customer to send the data. The event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the event tracker, call DescribeEventTracker.  The event tracker must be in the ACTIVE state before using the tracking ID.   Related APIs     ListEventTrackers     DescribeEventTracker     DeleteEventTracker   
    */
  def createEventTracker(): awsDashSdkLib.libRequestMod.Request[CreateEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEventTracker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEventTrackerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an event tracker that you use when sending event data to the specified dataset group using the PutEvents API. When Amazon Personalize creates an event tracker, it also creates an event-interactions dataset in the dataset group associated with the event tracker. The event-interactions dataset stores the event data from the PutEvents call. The contents of this dataset are not available to the user.  Only one event tracker can be associated with a dataset group. You will get an error if you call CreateEventTracker using the same dataset group as an existing event tracker.  When you send event data you include your tracking ID. The tracking ID identifies the customer and authorizes the customer to send the data. The event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the event tracker, call DescribeEventTracker.  The event tracker must be in the ACTIVE state before using the tracking ID.   Related APIs     ListEventTrackers     DescribeEventTracker     DeleteEventTracker   
    */
  def createEventTracker(params: CreateEventTrackerRequest): awsDashSdkLib.libRequestMod.Request[CreateEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEventTracker(
    params: CreateEventTrackerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEventTrackerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON format. Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set of required field and keywords. You specify a schema when you call CreateDataset.  Related APIs     ListSchemas     DescribeSchema     DeleteSchema   
    */
  def createSchema(): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON format. Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set of required field and keywords. You specify a schema when you call CreateDataset.  Related APIs     ListSchemas     DescribeSchema     DeleteSchema   
    */
  def createSchema(params: CreateSchemaRequest): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSchema(
    params: CreateSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the configuration for training a model. A trained model is known as a solution. After the configuration is created, you train the model (create a solution) by calling the CreateSolutionVersion operation. Every time you call CreateSolutionVersion, a new version of the solution is created. After creating a solution version, you check its accuracy by calling GetSolutionMetrics. When you are satisfied with the version, you deploy it using CreateCampaign. The campaign provides recommendations to a client through the GetRecommendations API. To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the dataset group that you provide in the request. A recipe specifies the training algorithm and a feature transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you can specify performAutoML and Amazon Personalize will analyze your data and select the optimum USER_PERSONALIZATION recipe for you.  Status  A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the solution, call DescribeSolution. Wait until the status shows as ACTIVE before calling CreateSolutionVersion.  Related APIs     ListSolutions     CreateSolutionVersion     DescribeSolution     DeleteSolution       ListSolutionVersions     DescribeSolutionVersion   
    */
  def createSolution(): awsDashSdkLib.libRequestMod.Request[CreateSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSolution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSolutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the configuration for training a model. A trained model is known as a solution. After the configuration is created, you train the model (create a solution) by calling the CreateSolutionVersion operation. Every time you call CreateSolutionVersion, a new version of the solution is created. After creating a solution version, you check its accuracy by calling GetSolutionMetrics. When you are satisfied with the version, you deploy it using CreateCampaign. The campaign provides recommendations to a client through the GetRecommendations API. To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the dataset group that you provide in the request. A recipe specifies the training algorithm and a feature transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you can specify performAutoML and Amazon Personalize will analyze your data and select the optimum USER_PERSONALIZATION recipe for you.  Status  A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the solution, call DescribeSolution. Wait until the status shows as ACTIVE before calling CreateSolutionVersion.  Related APIs     ListSolutions     CreateSolutionVersion     DescribeSolution     DeleteSolution       ListSolutionVersions     DescribeSolutionVersion   
    */
  def createSolution(params: CreateSolutionRequest): awsDashSdkLib.libRequestMod.Request[CreateSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSolution(
    params: CreateSolutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSolutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Trains or retrains an active solution. A solution is created using the CreateSolution operation and must be in the ACTIVE state before calling CreateSolutionVersion. A new version of the solution is created every time you call this operation.  Status  A solution version can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   To get the status of the version, call DescribeSolutionVersion. Wait until the status shows as ACTIVE before calling CreateCampaign. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Related APIs     ListSolutionVersions     DescribeSolutionVersion       ListSolutions     CreateSolution     DescribeSolution     DeleteSolution   
    */
  def createSolutionVersion(): awsDashSdkLib.libRequestMod.Request[CreateSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSolutionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSolutionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Trains or retrains an active solution. A solution is created using the CreateSolution operation and must be in the ACTIVE state before calling CreateSolutionVersion. A new version of the solution is created every time you call this operation.  Status  A solution version can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   To get the status of the version, call DescribeSolutionVersion. Wait until the status shows as ACTIVE before calling CreateCampaign. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Related APIs     ListSolutionVersions     DescribeSolutionVersion       ListSolutions     CreateSolution     DescribeSolution     DeleteSolution   
    */
  def createSolutionVersion(params: CreateSolutionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSolutionVersion(
    params: CreateSolutionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSolutionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted and can be redeployed when needed. A deleted campaign can no longer be specified in a GetRecommendations request. For more information on campaigns, see CreateCampaign.
    */
  def deleteCampaign(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCampaign(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted and can be redeployed when needed. A deleted campaign can no longer be specified in a GetRecommendations request. For more information on campaigns, see CreateCampaign.
    */
  def deleteCampaign(params: DeleteCampaignRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCampaign(
    params: DeleteCampaignRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dataset. You can't delete a dataset if an associated DatasetImportJob or SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see CreateDataset.
    */
  def deleteDataset(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataset(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dataset. You can't delete a dataset if an associated DatasetImportJob or SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see CreateDataset.
    */
  def deleteDataset(params: DeleteDatasetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dataset group. Before you delete a dataset group, you must delete the following:   All associated event trackers.   All associated solutions.   All datasets in the dataset group.  
    */
  def deleteDatasetGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatasetGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dataset group. Before you delete a dataset group, you must delete the following:   All associated event trackers.   All associated solutions.   All datasets in the dataset group.  
    */
  def deleteDatasetGroup(params: DeleteDatasetGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatasetGroup(
    params: DeleteDatasetGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For more information on event trackers, see CreateEventTracker.
    */
  def deleteEventTracker(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventTracker(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For more information on event trackers, see CreateEventTracker.
    */
  def deleteEventTracker(params: DeleteEventTrackerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventTracker(
    params: DeleteEventTrackerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more information on schemas, see CreateSchema.
    */
  def deleteSchema(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSchema(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more information on schemas, see CreateSchema.
    */
  def deleteSchema(params: DeleteSchemaRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSchema(
    params: DeleteSchemaRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all versions of a solution and the Solution object itself. Before deleting a solution, you must delete all campaigns based on the solution. To determine what campaigns are using the solution, call ListCampaigns and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an associated SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on solutions, see CreateSolution.
    */
  def deleteSolution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSolution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all versions of a solution and the Solution object itself. Before deleting a solution, you must delete all campaigns based on the solution. To determine what campaigns are using the solution, call ListCampaigns and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an associated SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on solutions, see CreateSolution.
    */
  def deleteSolution(params: DeleteSolutionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSolution(
    params: DeleteSolutionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given algorithm.
    */
  def describeAlgorithm(): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAlgorithm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAlgorithmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given algorithm.
    */
  def describeAlgorithm(params: DescribeAlgorithmRequest): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAlgorithm(
    params: DescribeAlgorithmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAlgorithmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given campaign, including its status. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   When the status is CREATE FAILED, the response includes the failureReason key, which describes why. For more information on campaigns, see CreateCampaign.
    */
  def describeCampaign(): awsDashSdkLib.libRequestMod.Request[DescribeCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given campaign, including its status. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   When the status is CREATE FAILED, the response includes the failureReason key, which describes why. For more information on campaigns, see CreateCampaign.
    */
  def describeCampaign(params: DescribeCampaignRequest): awsDashSdkLib.libRequestMod.Request[DescribeCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCampaign(
    params: DescribeCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given dataset. For more information on datasets, see CreateDataset.
    */
  def describeDataset(): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given dataset. For more information on datasets, see CreateDataset.
    */
  def describeDataset(params: DescribeDatasetRequest): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given dataset group. For more information on dataset groups, see CreateDatasetGroup.
    */
  def describeDatasetGroup(): awsDashSdkLib.libRequestMod.Request[DescribeDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDatasetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given dataset group. For more information on dataset groups, see CreateDatasetGroup.
    */
  def describeDatasetGroup(params: DescribeDatasetGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDatasetGroup(
    params: DescribeDatasetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the dataset import job created by CreateDatasetImportJob, including the import job status.
    */
  def describeDatasetImportJob(): awsDashSdkLib.libRequestMod.Request[DescribeDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDatasetImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the dataset import job created by CreateDatasetImportJob, including the import job status.
    */
  def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDatasetImportJob(
    params: DescribeDatasetImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an event tracker. The response includes the trackingId and status of the event tracker. For more information on event trackers, see CreateEventTracker.
    */
  def describeEventTracker(): awsDashSdkLib.libRequestMod.Request[DescribeEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventTracker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventTrackerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an event tracker. The response includes the trackingId and status of the event tracker. For more information on event trackers, see CreateEventTracker.
    */
  def describeEventTracker(params: DescribeEventTrackerRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventTracker(
    params: DescribeEventTrackerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventTrackerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventTrackerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given feature transformation.
    */
  def describeFeatureTransformation(): awsDashSdkLib.libRequestMod.Request[DescribeFeatureTransformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFeatureTransformation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFeatureTransformationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFeatureTransformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the given feature transformation.
    */
  def describeFeatureTransformation(params: DescribeFeatureTransformationRequest): awsDashSdkLib.libRequestMod.Request[DescribeFeatureTransformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFeatureTransformation(
    params: DescribeFeatureTransformationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFeatureTransformationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFeatureTransformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a recipe. A recipe contains three items:   An algorithm that trains a model.   Hyperparameters that govern the training.   Feature transformation information for modifying the input data before training.   Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the CreateSolution API. CreateSolution trains a model by using the algorithm in the specified recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the GetRecommendations API.
    */
  def describeRecipe(): awsDashSdkLib.libRequestMod.Request[DescribeRecipeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRecipe(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRecipeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRecipeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a recipe. A recipe contains three items:   An algorithm that trains a model.   Hyperparameters that govern the training.   Feature transformation information for modifying the input data before training.   Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the CreateSolution API. CreateSolution trains a model by using the algorithm in the specified recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the GetRecommendations API.
    */
  def describeRecipe(params: DescribeRecipeRequest): awsDashSdkLib.libRequestMod.Request[DescribeRecipeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRecipe(
    params: DescribeRecipeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRecipeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRecipeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a schema. For more information on schemas, see CreateSchema.
    */
  def describeSchema(): awsDashSdkLib.libRequestMod.Request[DescribeSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a schema. For more information on schemas, see CreateSchema.
    */
  def describeSchema(params: DescribeSchemaRequest): awsDashSdkLib.libRequestMod.Request[DescribeSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSchema(
    params: DescribeSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a solution. For more information on solutions, see CreateSolution.
    */
  def describeSolution(): awsDashSdkLib.libRequestMod.Request[DescribeSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSolution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSolutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a solution. For more information on solutions, see CreateSolution.
    */
  def describeSolution(params: DescribeSolutionRequest): awsDashSdkLib.libRequestMod.Request[DescribeSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSolution(
    params: DescribeSolutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSolutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSolutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a specific version of a solution. For more information on solutions, see CreateSolution.
    */
  def describeSolutionVersion(): awsDashSdkLib.libRequestMod.Request[DescribeSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSolutionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSolutionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a specific version of a solution. For more information on solutions, see CreateSolution.
    */
  def describeSolutionVersion(params: DescribeSolutionVersionRequest): awsDashSdkLib.libRequestMod.Request[DescribeSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSolutionVersion(
    params: DescribeSolutionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSolutionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSolutionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the metrics for the specified solution version.
    */
  def getSolutionMetrics(): awsDashSdkLib.libRequestMod.Request[GetSolutionMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSolutionMetrics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSolutionMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSolutionMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the metrics for the specified solution version.
    */
  def getSolutionMetrics(params: GetSolutionMetricsRequest): awsDashSdkLib.libRequestMod.Request[GetSolutionMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSolutionMetrics(
    params: GetSolutionMetricsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSolutionMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSolutionMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns associated with the account are listed. The response provides the properties for each campaign, including the Amazon Resource Name (ARN). For more information on campaigns, see CreateCampaign.
    */
  def listCampaigns(): awsDashSdkLib.libRequestMod.Request[ListCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCampaigns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCampaignsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns associated with the account are listed. The response provides the properties for each campaign, including the Amazon Resource Name (ARN). For more information on campaigns, see CreateCampaign.
    */
  def listCampaigns(params: ListCampaignsRequest): awsDashSdkLib.libRequestMod.Request[ListCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCampaigns(
    params: ListCampaignsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCampaignsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of dataset groups. The response provides the properties for each dataset group, including the Amazon Resource Name (ARN). For more information on dataset groups, see CreateDatasetGroup.
    */
  def listDatasetGroups(): awsDashSdkLib.libRequestMod.Request[ListDatasetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of dataset groups. The response provides the properties for each dataset group, including the Amazon Resource Name (ARN). For more information on dataset groups, see CreateDatasetGroup.
    */
  def listDatasetGroups(params: ListDatasetGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListDatasetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasetGroups(
    params: ListDatasetGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the dataset import jobs associated with the account are listed. The response provides the properties for each dataset import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see CreateDatasetImportJob. For more information on datasets, see CreateDataset.
    */
  def listDatasetImportJobs(): awsDashSdkLib.libRequestMod.Request[ListDatasetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasetImportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the dataset import jobs associated with the account are listed. The response provides the properties for each dataset import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see CreateDatasetImportJob. For more information on datasets, see CreateDataset.
    */
  def listDatasetImportJobs(params: ListDatasetImportJobsRequest): awsDashSdkLib.libRequestMod.Request[ListDatasetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasetImportJobs(
    params: ListDatasetImportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of datasets contained in the given dataset group. The response provides the properties for each dataset, including the Amazon Resource Name (ARN). For more information on datasets, see CreateDataset.
    */
  def listDatasets(): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of datasets contained in the given dataset group. The response provides the properties for each dataset, including the Amazon Resource Name (ARN). For more information on datasets, see CreateDataset.
    */
  def listDatasets(params: ListDatasetsRequest): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of event trackers associated with the account. The response provides the properties for each event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers, see CreateEventTracker.
    */
  def listEventTrackers(): awsDashSdkLib.libRequestMod.Request[ListEventTrackersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEventTrackers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEventTrackersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEventTrackersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of event trackers associated with the account. The response provides the properties for each event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers, see CreateEventTracker.
    */
  def listEventTrackers(params: ListEventTrackersRequest): awsDashSdkLib.libRequestMod.Request[ListEventTrackersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEventTrackers(
    params: ListEventTrackersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEventTrackersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEventTrackersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's Amazon Resource Name (ARN).
    */
  def listRecipes(): awsDashSdkLib.libRequestMod.Request[ListRecipesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecipes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecipesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecipesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's Amazon Resource Name (ARN).
    */
  def listRecipes(params: ListRecipesRequest): awsDashSdkLib.libRequestMod.Request[ListRecipesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecipes(
    params: ListRecipesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecipesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecipesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of schemas associated with the account. The response provides the properties for each schema, including the Amazon Resource Name (ARN). For more information on schemas, see CreateSchema.
    */
  def listSchemas(): awsDashSdkLib.libRequestMod.Request[ListSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSchemas(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of schemas associated with the account. The response provides the properties for each schema, including the Amazon Resource Name (ARN). For more information on schemas, see CreateSchema.
    */
  def listSchemas(params: ListSchemasRequest): awsDashSdkLib.libRequestMod.Request[ListSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSchemas(
    params: ListSchemasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSchemasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution versions associated with the account are listed. The response provides the properties for each solution version, including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.
    */
  def listSolutionVersions(): awsDashSdkLib.libRequestMod.Request[ListSolutionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSolutionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSolutionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSolutionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution versions associated with the account are listed. The response provides the properties for each solution version, including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.
    */
  def listSolutionVersions(params: ListSolutionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListSolutionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSolutionVersions(
    params: ListSolutionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSolutionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSolutionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the solutions associated with the account are listed. The response provides the properties for each solution, including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.
    */
  def listSolutions(): awsDashSdkLib.libRequestMod.Request[ListSolutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSolutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSolutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSolutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the solutions associated with the account are listed. The response provides the properties for each solution, including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.
    */
  def listSolutions(params: ListSolutionsRequest): awsDashSdkLib.libRequestMod.Request[ListSolutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSolutions(
    params: ListSolutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSolutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSolutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a campaign by either deploying a new solution or changing the value of the campaign's minProvisionedTPS parameter. To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the DescribeCampaign API.  You must wait until the status of the updated campaign is ACTIVE before asking the campaign for recommendations.  For more information on campaigns, see CreateCampaign.
    */
  def updateCampaign(): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a campaign by either deploying a new solution or changing the value of the campaign's minProvisionedTPS parameter. To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the DescribeCampaign API.  You must wait until the status of the updated campaign is ACTIVE before asking the campaign for recommendations.  For more information on campaigns, see CreateCampaign.
    */
  def updateCampaign(params: UpdateCampaignRequest): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCampaign(
    params: UpdateCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}


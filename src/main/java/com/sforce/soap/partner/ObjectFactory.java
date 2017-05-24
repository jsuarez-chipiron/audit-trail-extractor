
package com.sforce.soap.partner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.soap.partner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PerformQuickActionResultTypeContextId_QNAME = new QName("urn:partner.soap.sforce.com", "contextId");
    private final static QName _DescribeFlexiPageResultTypeSobjectType_QNAME = new QName("urn:partner.soap.sforce.com", "sobjectType");
    private final static QName _EmailFileAttachmentTypeContentType_QNAME = new QName("urn:partner.soap.sforce.com", "contentType");
    private final static QName _EmailFileAttachmentTypeBody_QNAME = new QName("urn:partner.soap.sforce.com", "body");
    private final static QName _DescribeLayoutButtonTypeUrl_QNAME = new QName("urn:partner.soap.sforce.com", "url");
    private final static QName _DescribeLayoutButtonTypeEncoding_QNAME = new QName("urn:partner.soap.sforce.com", "encoding");
    private final static QName _DescribeLayoutButtonTypeContentSource_QNAME = new QName("urn:partner.soap.sforce.com", "contentSource");
    private final static QName _DescribeLayoutButtonTypeWidth_QNAME = new QName("urn:partner.soap.sforce.com", "width");
    private final static QName _DescribeLayoutButtonTypeBehavior_QNAME = new QName("urn:partner.soap.sforce.com", "behavior");
    private final static QName _DescribeLayoutButtonTypeContent_QNAME = new QName("urn:partner.soap.sforce.com", "content");
    private final static QName _DescribeLayoutButtonTypeWindowPosition_QNAME = new QName("urn:partner.soap.sforce.com", "windowPosition");
    private final static QName _DescribeLayoutButtonTypeHeight_QNAME = new QName("urn:partner.soap.sforce.com", "height");
    private final static QName _FieldTypeFilteredLookupInfo_QNAME = new QName("urn:partner.soap.sforce.com", "filteredLookupInfo");
    private final static QName _SearchSnippetTypeText_QNAME = new QName("urn:partner.soap.sforce.com", "text");
    private final static QName _SearchRecordTypeSnippet_QNAME = new QName("urn:partner.soap.sforce.com", "snippet");
    private final static QName _RelatedListColumnTypeLookupId_QNAME = new QName("urn:partner.soap.sforce.com", "lookupId");
    private final static QName _SingleEmailMessageTypeOrgWideEmailAddressId_QNAME = new QName("urn:partner.soap.sforce.com", "orgWideEmailAddressId");
    private final static QName _SingleEmailMessageTypeInReplyTo_QNAME = new QName("urn:partner.soap.sforce.com", "inReplyTo");
    private final static QName _SingleEmailMessageTypeReferences_QNAME = new QName("urn:partner.soap.sforce.com", "references");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap.partner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DescribeTheme }
     * 
     */
    public DescribeTheme createDescribeTheme() {
        return new DescribeTheme();
    }

    /**
     * Create an instance of {@link Upsert }
     * 
     */
    public Upsert createUpsert() {
        return new Upsert();
    }

    /**
     * Create an instance of {@link DuplicateRuleHeader }
     * 
     */
    public DuplicateRuleHeader createDuplicateRuleHeader() {
        return new DuplicateRuleHeader();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructuresResponse }
     * 
     */
    public DescribeDataCategoryGroupStructuresResponse createDescribeDataCategoryGroupStructuresResponse() {
        return new DescribeDataCategoryGroupStructuresResponse();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructureResultType }
     * 
     */
    public DescribeDataCategoryGroupStructureResultType createDescribeDataCategoryGroupStructureResultType() {
        return new DescribeDataCategoryGroupStructureResultType();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrder }
     * 
     */
    public DescribeSearchScopeOrder createDescribeSearchScopeOrder() {
        return new DescribeSearchScopeOrder();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroups }
     * 
     */
    public DescribeDataCategoryGroups createDescribeDataCategoryGroups() {
        return new DescribeDataCategoryGroups();
    }

    /**
     * Create an instance of {@link PerformQuickActionsResponse }
     * 
     */
    public PerformQuickActionsResponse createPerformQuickActionsResponse() {
        return new PerformQuickActionsResponse();
    }

    /**
     * Create an instance of {@link PerformQuickActionResultType }
     * 
     */
    public PerformQuickActionResultType createPerformQuickActionResultType() {
        return new PerformQuickActionResultType();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link RetrieveQuickActionTemplates }
     * 
     */
    public RetrieveQuickActionTemplates createRetrieveQuickActionTemplates() {
        return new RetrieveQuickActionTemplates();
    }

    /**
     * Create an instance of {@link DescribeKnowledgeSettingsResponse }
     * 
     */
    public DescribeKnowledgeSettingsResponse createDescribeKnowledgeSettingsResponse() {
        return new DescribeKnowledgeSettingsResponse();
    }

    /**
     * Create an instance of {@link KnowledgeSettingsType }
     * 
     */
    public KnowledgeSettingsType createKnowledgeSettingsType() {
        return new KnowledgeSettingsType();
    }

    /**
     * Create an instance of {@link DescribeSObjectListViewsResponse }
     * 
     */
    public DescribeSObjectListViewsResponse createDescribeSObjectListViewsResponse() {
        return new DescribeSObjectListViewsResponse();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewResultType }
     * 
     */
    public DescribeSoqlListViewResultType createDescribeSoqlListViewResultType() {
        return new DescribeSoqlListViewResultType();
    }

    /**
     * Create an instance of {@link DebuggingHeader }
     * 
     */
    public DebuggingHeader createDebuggingHeader() {
        return new DebuggingHeader();
    }

    /**
     * Create an instance of {@link DebuggingInfo }
     * 
     */
    public DebuggingInfo createDebuggingInfo() {
        return new DebuggingInfo();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResultType }
     * 
     */
    public GetUserInfoResultType createGetUserInfoResultType() {
        return new GetUserInfoResultType();
    }

    /**
     * Create an instance of {@link QueryMoreResponse }
     * 
     */
    public QueryMoreResponse createQueryMoreResponse() {
        return new QueryMoreResponse();
    }

    /**
     * Create an instance of {@link QueryResultType }
     * 
     */
    public QueryResultType createQueryResultType() {
        return new QueryResultType();
    }

    /**
     * Create an instance of {@link DescribeNouns }
     * 
     */
    public DescribeNouns createDescribeNouns() {
        return new DescribeNouns();
    }

    /**
     * Create an instance of {@link DescribeTabsResponse }
     * 
     */
    public DescribeTabsResponse createDescribeTabsResponse() {
        return new DescribeTabsResponse();
    }

    /**
     * Create an instance of {@link DescribeTabSetResultType }
     * 
     */
    public DescribeTabSetResultType createDescribeTabSetResultType() {
        return new DescribeTabSetResultType();
    }

    /**
     * Create an instance of {@link MruHeader }
     * 
     */
    public MruHeader createMruHeader() {
        return new MruHeader();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link AllowFieldTruncationHeader }
     * 
     */
    public AllowFieldTruncationHeader createAllowFieldTruncationHeader() {
        return new AllowFieldTruncationHeader();
    }

    /**
     * Create an instance of {@link GetServerTimestampResponse }
     * 
     */
    public GetServerTimestampResponse createGetServerTimestampResponse() {
        return new GetServerTimestampResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestampResultType }
     * 
     */
    public GetServerTimestampResultType createGetServerTimestampResultType() {
        return new GetServerTimestampResultType();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailResultType }
     * 
     */
    public SendEmailResultType createSendEmailResultType() {
        return new SendEmailResultType();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActions }
     * 
     */
    public DescribeAvailableQuickActions createDescribeAvailableQuickActions() {
        return new DescribeAvailableQuickActions();
    }

    /**
     * Create an instance of {@link AllOrNoneHeader }
     * 
     */
    public AllOrNoneHeader createAllOrNoneHeader() {
        return new AllOrNoneHeader();
    }

    /**
     * Create an instance of {@link DescribeAllTabsResponse }
     * 
     */
    public DescribeAllTabsResponse createDescribeAllTabsResponse() {
        return new DescribeAllTabsResponse();
    }

    /**
     * Create an instance of {@link DescribeTabType }
     * 
     */
    public DescribeTabType createDescribeTabType() {
        return new DescribeTabType();
    }

    /**
     * Create an instance of {@link DescribeFlexiPagesResponse }
     * 
     */
    public DescribeFlexiPagesResponse createDescribeFlexiPagesResponse() {
        return new DescribeFlexiPagesResponse();
    }

    /**
     * Create an instance of {@link DescribeFlexiPageResultType }
     * 
     */
    public DescribeFlexiPageResultType createDescribeFlexiPageResultType() {
        return new DescribeFlexiPageResultType();
    }

    /**
     * Create an instance of {@link DescribeGlobalTheme }
     * 
     */
    public DescribeGlobalTheme createDescribeGlobalTheme() {
        return new DescribeGlobalTheme();
    }

    /**
     * Create an instance of {@link UserTerritoryDeleteHeader }
     * 
     */
    public UserTerritoryDeleteHeader createUserTerritoryDeleteHeader() {
        return new UserTerritoryDeleteHeader();
    }

    /**
     * Create an instance of {@link DescribeQuickActionsResponse }
     * 
     */
    public DescribeQuickActionsResponse createDescribeQuickActionsResponse() {
        return new DescribeQuickActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeQuickActionResultType }
     * 
     */
    public DescribeQuickActionResultType createDescribeQuickActionResultType() {
        return new DescribeQuickActionResultType();
    }

    /**
     * Create an instance of {@link Undelete }
     * 
     */
    public Undelete createUndelete() {
        return new Undelete();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResponse }
     * 
     */
    public InvalidateSessionsResponse createInvalidateSessionsResponse() {
        return new InvalidateSessionsResponse();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResultType }
     * 
     */
    public InvalidateSessionsResultType createInvalidateSessionsResultType() {
        return new InvalidateSessionsResultType();
    }

    /**
     * Create an instance of {@link MergeResponse }
     * 
     */
    public MergeResponse createMergeResponse() {
        return new MergeResponse();
    }

    /**
     * Create an instance of {@link MergeResultType }
     * 
     */
    public MergeResultType createMergeResultType() {
        return new MergeResultType();
    }

    /**
     * Create an instance of {@link ConvertLeadResponse }
     * 
     */
    public ConvertLeadResponse createConvertLeadResponse() {
        return new ConvertLeadResponse();
    }

    /**
     * Create an instance of {@link LeadConvertResultType }
     * 
     */
    public LeadConvertResultType createLeadConvertResultType() {
        return new LeadConvertResultType();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayout }
     * 
     */
    public DescribeApprovalLayout createDescribeApprovalLayout() {
        return new DescribeApprovalLayout();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link Merge }
     * 
     */
    public Merge createMerge() {
        return new Merge();
    }

    /**
     * Create an instance of {@link MergeRequestType }
     * 
     */
    public MergeRequestType createMergeRequestType() {
        return new MergeRequestType();
    }

    /**
     * Create an instance of {@link DescribeAppMenuResponse }
     * 
     */
    public DescribeAppMenuResponse createDescribeAppMenuResponse() {
        return new DescribeAppMenuResponse();
    }

    /**
     * Create an instance of {@link DescribeAppMenuResultType }
     * 
     */
    public DescribeAppMenuResultType createDescribeAppMenuResultType() {
        return new DescribeAppMenuResultType();
    }

    /**
     * Create an instance of {@link QueryAll }
     * 
     */
    public QueryAll createQueryAll() {
        return new QueryAll();
    }

    /**
     * Create an instance of {@link DescribeSObjects }
     * 
     */
    public DescribeSObjects createDescribeSObjects() {
        return new DescribeSObjects();
    }

    /**
     * Create an instance of {@link ExecuteListView }
     * 
     */
    public ExecuteListView createExecuteListView() {
        return new ExecuteListView();
    }

    /**
     * Create an instance of {@link ExecuteListViewRequestType }
     * 
     */
    public ExecuteListViewRequestType createExecuteListViewRequestType() {
        return new ExecuteListViewRequestType();
    }

    /**
     * Create an instance of {@link DescribeSObject }
     * 
     */
    public DescribeSObject createDescribeSObject() {
        return new DescribeSObject();
    }

    /**
     * Create an instance of {@link StreamingEnabledHeader }
     * 
     */
    public StreamingEnabledHeader createStreamingEnabledHeader() {
        return new StreamingEnabledHeader();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DescribeTabs }
     * 
     */
    public DescribeTabs createDescribeTabs() {
        return new DescribeTabs();
    }

    /**
     * Create an instance of {@link SetPassword }
     * 
     */
    public SetPassword createSetPassword() {
        return new SetPassword();
    }

    /**
     * Create an instance of {@link EmailHeader }
     * 
     */
    public EmailHeader createEmailHeader() {
        return new EmailHeader();
    }

    /**
     * Create an instance of {@link DescribeLayoutResponse }
     * 
     */
    public DescribeLayoutResponse createDescribeLayoutResponse() {
        return new DescribeLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeLayoutResultType }
     * 
     */
    public DescribeLayoutResultType createDescribeLayoutResultType() {
        return new DescribeLayoutResultType();
    }

    /**
     * Create an instance of {@link RetrieveQuickActionTemplatesResponse }
     * 
     */
    public RetrieveQuickActionTemplatesResponse createRetrieveQuickActionTemplatesResponse() {
        return new RetrieveQuickActionTemplatesResponse();
    }

    /**
     * Create an instance of {@link QuickActionTemplateResultType }
     * 
     */
    public QuickActionTemplateResultType createQuickActionTemplateResultType() {
        return new QuickActionTemplateResultType();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginResultType }
     * 
     */
    public LoginResultType createLoginResultType() {
        return new LoginResultType();
    }

    /**
     * Create an instance of {@link DescribePrimaryCompactLayouts }
     * 
     */
    public DescribePrimaryCompactLayouts createDescribePrimaryCompactLayouts() {
        return new DescribePrimaryCompactLayouts();
    }

    /**
     * Create an instance of {@link LimitInfoHeader }
     * 
     */
    public LimitInfoHeader createLimitInfoHeader() {
        return new LimitInfoHeader();
    }

    /**
     * Create an instance of {@link LimitInfoType }
     * 
     */
    public LimitInfoType createLimitInfoType() {
        return new LimitInfoType();
    }

    /**
     * Create an instance of {@link DescribeKnowledgeSettings }
     * 
     */
    public DescribeKnowledgeSettings createDescribeKnowledgeSettings() {
        return new DescribeKnowledgeSettings();
    }

    /**
     * Create an instance of {@link DescribeSearchLayoutsResponse }
     * 
     */
    public DescribeSearchLayoutsResponse createDescribeSearchLayoutsResponse() {
        return new DescribeSearchLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchLayoutResultType }
     * 
     */
    public DescribeSearchLayoutResultType createDescribeSearchLayoutResultType() {
        return new DescribeSearchLayoutResultType();
    }

    /**
     * Create an instance of {@link InvalidateSessions }
     * 
     */
    public InvalidateSessions createInvalidateSessions() {
        return new InvalidateSessions();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ProcessRequestType }
     * 
     */
    public ProcessRequestType createProcessRequestType() {
        return new ProcessRequestType();
    }

    /**
     * Create an instance of {@link DescribeAllTabs }
     * 
     */
    public DescribeAllTabs createDescribeAllTabs() {
        return new DescribeAllTabs();
    }

    /**
     * Create an instance of {@link EmptyRecycleBin }
     * 
     */
    public EmptyRecycleBin createEmptyRecycleBin() {
        return new EmptyRecycleBin();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link SetPasswordResponse }
     * 
     */
    public SetPasswordResponse createSetPasswordResponse() {
        return new SetPasswordResponse();
    }

    /**
     * Create an instance of {@link SetPasswordResultType }
     * 
     */
    public SetPasswordResultType createSetPasswordResultType() {
        return new SetPasswordResultType();
    }

    /**
     * Create an instance of {@link GetDeletedResponse }
     * 
     */
    public GetDeletedResponse createGetDeletedResponse() {
        return new GetDeletedResponse();
    }

    /**
     * Create an instance of {@link GetDeletedResultType }
     * 
     */
    public GetDeletedResultType createGetDeletedResultType() {
        return new GetDeletedResultType();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViews }
     * 
     */
    public DescribeSoqlListViews createDescribeSoqlListViews() {
        return new DescribeSoqlListViews();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewsRequestType }
     * 
     */
    public DescribeSoqlListViewsRequestType createDescribeSoqlListViewsRequestType() {
        return new DescribeSoqlListViewsRequestType();
    }

    /**
     * Create an instance of {@link DescribeSObjectsResponse }
     * 
     */
    public DescribeSObjectsResponse createDescribeSObjectsResponse() {
        return new DescribeSObjectsResponse();
    }

    /**
     * Create an instance of {@link DescribeSObjectResultType }
     * 
     */
    public DescribeSObjectResultType createDescribeSObjectResultType() {
        return new DescribeSObjectResultType();
    }

    /**
     * Create an instance of {@link DescribeSObjectListViews }
     * 
     */
    public DescribeSObjectListViews createDescribeSObjectListViews() {
        return new DescribeSObjectListViews();
    }

    /**
     * Create an instance of {@link UpsertResponse }
     * 
     */
    public UpsertResponse createUpsertResponse() {
        return new UpsertResponse();
    }

    /**
     * Create an instance of {@link UpsertResultType }
     * 
     */
    public UpsertResultType createUpsertResultType() {
        return new UpsertResultType();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrderResponse }
     * 
     */
    public DescribeSearchScopeOrderResponse createDescribeSearchScopeOrderResponse() {
        return new DescribeSearchScopeOrderResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrderResultType }
     * 
     */
    public DescribeSearchScopeOrderResultType createDescribeSearchScopeOrderResultType() {
        return new DescribeSearchScopeOrderResultType();
    }

    /**
     * Create an instance of {@link AssignmentRuleHeader }
     * 
     */
    public AssignmentRuleHeader createAssignmentRuleHeader() {
        return new AssignmentRuleHeader();
    }

    /**
     * Create an instance of {@link QueryOptions }
     * 
     */
    public QueryOptions createQueryOptions() {
        return new QueryOptions();
    }

    /**
     * Create an instance of {@link DescribeSObjectResponse }
     * 
     */
    public DescribeSObjectResponse createDescribeSObjectResponse() {
        return new DescribeSObjectResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedResponse }
     * 
     */
    public GetUpdatedResponse createGetUpdatedResponse() {
        return new GetUpdatedResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedResultType }
     * 
     */
    public GetUpdatedResultType createGetUpdatedResultType() {
        return new GetUpdatedResultType();
    }

    /**
     * Create an instance of {@link QueryAllResponse }
     * 
     */
    public QueryAllResponse createQueryAllResponse() {
        return new QueryAllResponse();
    }

    /**
     * Create an instance of {@link QueryMore }
     * 
     */
    public QueryMore createQueryMore() {
        return new QueryMore();
    }

    /**
     * Create an instance of {@link ResetPasswordResponse }
     * 
     */
    public ResetPasswordResponse createResetPasswordResponse() {
        return new ResetPasswordResponse();
    }

    /**
     * Create an instance of {@link ResetPasswordResultType }
     * 
     */
    public ResetPasswordResultType createResetPasswordResultType() {
        return new ResetPasswordResultType();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link SaveResultType }
     * 
     */
    public SaveResultType createSaveResultType() {
        return new SaveResultType();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link PerformQuickActions }
     * 
     */
    public PerformQuickActions createPerformQuickActions() {
        return new PerformQuickActions();
    }

    /**
     * Create an instance of {@link PerformQuickActionRequestType }
     * 
     */
    public PerformQuickActionRequestType createPerformQuickActionRequestType() {
        return new PerformQuickActionRequestType();
    }

    /**
     * Create an instance of {@link PackageVersionHeader }
     * 
     */
    public PackageVersionHeader createPackageVersionHeader() {
        return new PackageVersionHeader();
    }

    /**
     * Create an instance of {@link PackageVersionType }
     * 
     */
    public PackageVersionType createPackageVersionType() {
        return new PackageVersionType();
    }

    /**
     * Create an instance of {@link DescribeGlobalResponse }
     * 
     */
    public DescribeGlobalResponse createDescribeGlobalResponse() {
        return new DescribeGlobalResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalResultType }
     * 
     */
    public DescribeGlobalResultType createDescribeGlobalResultType() {
        return new DescribeGlobalResultType();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayoutResponse }
     * 
     */
    public DescribeApprovalLayoutResponse createDescribeApprovalLayoutResponse() {
        return new DescribeApprovalLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayoutResultType }
     * 
     */
    public DescribeApprovalLayoutResultType createDescribeApprovalLayoutResultType() {
        return new DescribeApprovalLayoutResultType();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link DescribeQuickActions }
     * 
     */
    public DescribeQuickActions createDescribeQuickActions() {
        return new DescribeQuickActions();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupsResponse }
     * 
     */
    public DescribeDataCategoryGroupsResponse createDescribeDataCategoryGroupsResponse() {
        return new DescribeDataCategoryGroupsResponse();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupResultType }
     * 
     */
    public DescribeDataCategoryGroupResultType createDescribeDataCategoryGroupResultType() {
        return new DescribeDataCategoryGroupResultType();
    }

    /**
     * Create an instance of {@link GetDeleted }
     * 
     */
    public GetDeleted createGetDeleted() {
        return new GetDeleted();
    }

    /**
     * Create an instance of {@link SendEmailMessageResponse }
     * 
     */
    public SendEmailMessageResponse createSendEmailMessageResponse() {
        return new SendEmailMessageResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalThemeResponse }
     * 
     */
    public DescribeGlobalThemeResponse createDescribeGlobalThemeResponse() {
        return new DescribeGlobalThemeResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalThemeType }
     * 
     */
    public DescribeGlobalThemeType createDescribeGlobalThemeType() {
        return new DescribeGlobalThemeType();
    }

    /**
     * Create an instance of {@link DisableFeedTrackingHeader }
     * 
     */
    public DisableFeedTrackingHeader createDisableFeedTrackingHeader() {
        return new DisableFeedTrackingHeader();
    }

    /**
     * Create an instance of {@link DescribePrimaryCompactLayoutsResponse }
     * 
     */
    public DescribePrimaryCompactLayoutsResponse createDescribePrimaryCompactLayoutsResponse() {
        return new DescribePrimaryCompactLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeCompactLayoutType }
     * 
     */
    public DescribeCompactLayoutType createDescribeCompactLayoutType() {
        return new DescribeCompactLayoutType();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link ProcessResultType }
     * 
     */
    public ProcessResultType createProcessResultType() {
        return new ProcessResultType();
    }

    /**
     * Create an instance of {@link ConvertLead }
     * 
     */
    public ConvertLead createConvertLead() {
        return new ConvertLead();
    }

    /**
     * Create an instance of {@link LeadConvertType }
     * 
     */
    public LeadConvertType createLeadConvertType() {
        return new LeadConvertType();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link ExecuteListViewResponse }
     * 
     */
    public ExecuteListViewResponse createExecuteListViewResponse() {
        return new ExecuteListViewResponse();
    }

    /**
     * Create an instance of {@link ExecuteListViewResultType }
     * 
     */
    public ExecuteListViewResultType createExecuteListViewResultType() {
        return new ExecuteListViewResultType();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructures }
     * 
     */
    public DescribeDataCategoryGroupStructures createDescribeDataCategoryGroupStructures() {
        return new DescribeDataCategoryGroupStructures();
    }

    /**
     * Create an instance of {@link DataCategoryGroupSobjectTypePairType }
     * 
     */
    public DataCategoryGroupSobjectTypePairType createDataCategoryGroupSobjectTypePairType() {
        return new DataCategoryGroupSobjectTypePairType();
    }

    /**
     * Create an instance of {@link UndeleteResponse }
     * 
     */
    public UndeleteResponse createUndeleteResponse() {
        return new UndeleteResponse();
    }

    /**
     * Create an instance of {@link UndeleteResultType }
     * 
     */
    public UndeleteResultType createUndeleteResultType() {
        return new UndeleteResultType();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link ResetPassword }
     * 
     */
    public ResetPassword createResetPassword() {
        return new ResetPassword();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewsResponse }
     * 
     */
    public DescribeSoqlListViewsResponse createDescribeSoqlListViewsResponse() {
        return new DescribeSoqlListViewsResponse();
    }

    /**
     * Create an instance of {@link GetUpdated }
     * 
     */
    public GetUpdated createGetUpdated() {
        return new GetUpdated();
    }

    /**
     * Create an instance of {@link DescribeNounsResponse }
     * 
     */
    public DescribeNounsResponse createDescribeNounsResponse() {
        return new DescribeNounsResponse();
    }

    /**
     * Create an instance of {@link DescribeNounResultType }
     * 
     */
    public DescribeNounResultType createDescribeNounResultType() {
        return new DescribeNounResultType();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActionsResponse }
     * 
     */
    public DescribeAvailableQuickActionsResponse createDescribeAvailableQuickActionsResponse() {
        return new DescribeAvailableQuickActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActionResultType }
     * 
     */
    public DescribeAvailableQuickActionResultType createDescribeAvailableQuickActionResultType() {
        return new DescribeAvailableQuickActionResultType();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayout }
     * 
     */
    public DescribeSoftphoneLayout createDescribeSoftphoneLayout() {
        return new DescribeSoftphoneLayout();
    }

    /**
     * Create an instance of {@link DescribeThemeResponse }
     * 
     */
    public DescribeThemeResponse createDescribeThemeResponse() {
        return new DescribeThemeResponse();
    }

    /**
     * Create an instance of {@link DescribeThemeResultType }
     * 
     */
    public DescribeThemeResultType createDescribeThemeResultType() {
        return new DescribeThemeResultType();
    }

    /**
     * Create an instance of {@link CallOptions }
     * 
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link SendEmailMessage }
     * 
     */
    public SendEmailMessage createSendEmailMessage() {
        return new SendEmailMessage();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutResponse }
     * 
     */
    public DescribeSoftphoneLayoutResponse createDescribeSoftphoneLayoutResponse() {
        return new DescribeSoftphoneLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutResultType }
     * 
     */
    public DescribeSoftphoneLayoutResultType createDescribeSoftphoneLayoutResultType() {
        return new DescribeSoftphoneLayoutResultType();
    }

    /**
     * Create an instance of {@link OwnerChangeOptions }
     * 
     */
    public OwnerChangeOptions createOwnerChangeOptions() {
        return new OwnerChangeOptions();
    }

    /**
     * Create an instance of {@link DescribeCompactLayoutsResponse }
     * 
     */
    public DescribeCompactLayoutsResponse createDescribeCompactLayoutsResponse() {
        return new DescribeCompactLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeCompactLayoutsResultType }
     * 
     */
    public DescribeCompactLayoutsResultType createDescribeCompactLayoutsResultType() {
        return new DescribeCompactLayoutsResultType();
    }

    /**
     * Create an instance of {@link DescribeFlexiPages }
     * 
     */
    public DescribeFlexiPages createDescribeFlexiPages() {
        return new DescribeFlexiPages();
    }

    /**
     * Create an instance of {@link LoginScopeHeader }
     * 
     */
    public LoginScopeHeader createLoginScopeHeader() {
        return new LoginScopeHeader();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchResultType }
     * 
     */
    public SearchResultType createSearchResultType() {
        return new SearchResultType();
    }

    /**
     * Create an instance of {@link DescribeSearchLayouts }
     * 
     */
    public DescribeSearchLayouts createDescribeSearchLayouts() {
        return new DescribeSearchLayouts();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link EmptyRecycleBinResponse }
     * 
     */
    public EmptyRecycleBinResponse createEmptyRecycleBinResponse() {
        return new EmptyRecycleBinResponse();
    }

    /**
     * Create an instance of {@link EmptyRecycleBinResultType }
     * 
     */
    public EmptyRecycleBinResultType createEmptyRecycleBinResultType() {
        return new EmptyRecycleBinResultType();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestamp }
     * 
     */
    public GetServerTimestamp createGetServerTimestamp() {
        return new GetServerTimestamp();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link LocaleOptions }
     * 
     */
    public LocaleOptions createLocaleOptions() {
        return new LocaleOptions();
    }

    /**
     * Create an instance of {@link DescribeAppMenu }
     * 
     */
    public DescribeAppMenu createDescribeAppMenu() {
        return new DescribeAppMenu();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteResultType }
     * 
     */
    public DeleteResultType createDeleteResultType() {
        return new DeleteResultType();
    }

    /**
     * Create an instance of {@link DescribeLayout }
     * 
     */
    public DescribeLayout createDescribeLayout() {
        return new DescribeLayout();
    }

    /**
     * Create an instance of {@link DescribeCompactLayouts }
     * 
     */
    public DescribeCompactLayouts createDescribeCompactLayouts() {
        return new DescribeCompactLayouts();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link DescribeGlobal }
     * 
     */
    public DescribeGlobal createDescribeGlobal() {
        return new DescribeGlobal();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayoutType }
     * 
     */
    public DescribeApprovalLayoutType createDescribeApprovalLayoutType() {
        return new DescribeApprovalLayoutType();
    }

    /**
     * Create an instance of {@link NameCaseValueType }
     * 
     */
    public NameCaseValueType createNameCaseValueType() {
        return new NameCaseValueType();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutItemType }
     * 
     */
    public DescribeSoftphoneLayoutItemType createDescribeSoftphoneLayoutItemType() {
        return new DescribeSoftphoneLayoutItemType();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutSectionType }
     * 
     */
    public DescribeSoftphoneLayoutSectionType createDescribeSoftphoneLayoutSectionType() {
        return new DescribeSoftphoneLayoutSectionType();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewParamsType }
     * 
     */
    public DescribeSoqlListViewParamsType createDescribeSoqlListViewParamsType() {
        return new DescribeSoqlListViewParamsType();
    }

    /**
     * Create an instance of {@link AnalyticsCloudComponentType }
     * 
     */
    public AnalyticsCloudComponentType createAnalyticsCloudComponentType() {
        return new AnalyticsCloudComponentType();
    }

    /**
     * Create an instance of {@link MatchRecordType }
     * 
     */
    public MatchRecordType createMatchRecordType() {
        return new MatchRecordType();
    }

    /**
     * Create an instance of {@link DescribeColorType }
     * 
     */
    public DescribeColorType createDescribeColorType() {
        return new DescribeColorType();
    }

    /**
     * Create an instance of {@link SearchSnippetType }
     * 
     */
    public SearchSnippetType createSearchSnippetType() {
        return new SearchSnippetType();
    }

    /**
     * Create an instance of {@link CustomLinkComponentType }
     * 
     */
    public CustomLinkComponentType createCustomLinkComponentType() {
        return new CustomLinkComponentType();
    }

    /**
     * Create an instance of {@link ReportChartComponentType }
     * 
     */
    public ReportChartComponentType createReportChartComponentType() {
        return new ReportChartComponentType();
    }

    /**
     * Create an instance of {@link RecordTypeInfoType }
     * 
     */
    public RecordTypeInfoType createRecordTypeInfoType() {
        return new RecordTypeInfoType();
    }

    /**
     * Create an instance of {@link KnowledgeLanguageItemType }
     * 
     */
    public KnowledgeLanguageItemType createKnowledgeLanguageItemType() {
        return new KnowledgeLanguageItemType();
    }

    /**
     * Create an instance of {@link DescribeColumnType }
     * 
     */
    public DescribeColumnType createDescribeColumnType() {
        return new DescribeColumnType();
    }

    /**
     * Create an instance of {@link RelatedContentType }
     * 
     */
    public RelatedContentType createRelatedContentType() {
        return new RelatedContentType();
    }

    /**
     * Create an instance of {@link DescribeComponentInstanceType }
     * 
     */
    public DescribeComponentInstanceType createDescribeComponentInstanceType() {
        return new DescribeComponentInstanceType();
    }

    /**
     * Create an instance of {@link DescribeRelatedContentItemType }
     * 
     */
    public DescribeRelatedContentItemType createDescribeRelatedContentItemType() {
        return new DescribeRelatedContentItemType();
    }

    /**
     * Create an instance of {@link ChildRelationshipType }
     * 
     */
    public ChildRelationshipType createChildRelationshipType() {
        return new ChildRelationshipType();
    }

    /**
     * Create an instance of {@link DescribeLayoutComponentType }
     * 
     */
    public DescribeLayoutComponentType createDescribeLayoutComponentType() {
        return new DescribeLayoutComponentType();
    }

    /**
     * Create an instance of {@link SoqlSubQueryConditionType }
     * 
     */
    public SoqlSubQueryConditionType createSoqlSubQueryConditionType() {
        return new SoqlSubQueryConditionType();
    }

    /**
     * Create an instance of {@link FieldLayoutComponentType }
     * 
     */
    public FieldLayoutComponentType createFieldLayoutComponentType() {
        return new FieldLayoutComponentType();
    }

    /**
     * Create an instance of {@link DescribeLayoutFeedViewType }
     * 
     */
    public DescribeLayoutFeedViewType createDescribeLayoutFeedViewType() {
        return new DescribeLayoutFeedViewType();
    }

    /**
     * Create an instance of {@link SoqlConditionType }
     * 
     */
    public SoqlConditionType createSoqlConditionType() {
        return new SoqlConditionType();
    }

    /**
     * Create an instance of {@link ProcessWorkitemRequestType }
     * 
     */
    public ProcessWorkitemRequestType createProcessWorkitemRequestType() {
        return new ProcessWorkitemRequestType();
    }

    /**
     * Create an instance of {@link SoqlWhereConditionType }
     * 
     */
    public SoqlWhereConditionType createSoqlWhereConditionType() {
        return new SoqlWhereConditionType();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutInfoFieldType }
     * 
     */
    public DescribeSoftphoneLayoutInfoFieldType createDescribeSoftphoneLayoutInfoFieldType() {
        return new DescribeSoftphoneLayoutInfoFieldType();
    }

    /**
     * Create an instance of {@link DescribeLayoutFeedFilterType }
     * 
     */
    public DescribeLayoutFeedFilterType createDescribeLayoutFeedFilterType() {
        return new DescribeLayoutFeedFilterType();
    }

    /**
     * Create an instance of {@link ListViewOrderByType }
     * 
     */
    public ListViewOrderByType createListViewOrderByType() {
        return new ListViewOrderByType();
    }

    /**
     * Create an instance of {@link DescribeLayoutButtonType }
     * 
     */
    public DescribeLayoutButtonType createDescribeLayoutButtonType() {
        return new DescribeLayoutButtonType();
    }

    /**
     * Create an instance of {@link SendEmailErrorType }
     * 
     */
    public SendEmailErrorType createSendEmailErrorType() {
        return new SendEmailErrorType();
    }

    /**
     * Create an instance of {@link ListViewColumnType }
     * 
     */
    public ListViewColumnType createListViewColumnType() {
        return new ListViewColumnType();
    }

    /**
     * Create an instance of {@link DescribeLayoutItemType }
     * 
     */
    public DescribeLayoutItemType createDescribeLayoutItemType() {
        return new DescribeLayoutItemType();
    }

    /**
     * Create an instance of {@link ActionOverrideType }
     * 
     */
    public ActionOverrideType createActionOverrideType() {
        return new ActionOverrideType();
    }

    /**
     * Create an instance of {@link RecordTypeCompactLayoutMappingType }
     * 
     */
    public RecordTypeCompactLayoutMappingType createRecordTypeCompactLayoutMappingType() {
        return new RecordTypeCompactLayoutMappingType();
    }

    /**
     * Create an instance of {@link MatchResultType }
     * 
     */
    public MatchResultType createMatchResultType() {
        return new MatchResultType();
    }

    /**
     * Create an instance of {@link FieldComponentType }
     * 
     */
    public FieldComponentType createFieldComponentType() {
        return new FieldComponentType();
    }

    /**
     * Create an instance of {@link RelatedListSortType }
     * 
     */
    public RelatedListSortType createRelatedListSortType() {
        return new RelatedListSortType();
    }

    /**
     * Create an instance of {@link SoqlConditionGroupType }
     * 
     */
    public SoqlConditionGroupType createSoqlConditionGroupType() {
        return new SoqlConditionGroupType();
    }

    /**
     * Create an instance of {@link EmailFileAttachmentType }
     * 
     */
    public EmailFileAttachmentType createEmailFileAttachmentType() {
        return new EmailFileAttachmentType();
    }

    /**
     * Create an instance of {@link DescribeQuickActionListResultType }
     * 
     */
    public DescribeQuickActionListResultType createDescribeQuickActionListResultType() {
        return new DescribeQuickActionListResultType();
    }

    /**
     * Create an instance of {@link DescribeLayoutButtonSectionType }
     * 
     */
    public DescribeLayoutButtonSectionType createDescribeLayoutButtonSectionType() {
        return new DescribeLayoutButtonSectionType();
    }

    /**
     * Create an instance of {@link DescribeComponentInstancePropertyType }
     * 
     */
    public DescribeComponentInstancePropertyType createDescribeComponentInstancePropertyType() {
        return new DescribeComponentInstancePropertyType();
    }

    /**
     * Create an instance of {@link RelatedListType }
     * 
     */
    public RelatedListType createRelatedListType() {
        return new RelatedListType();
    }

    /**
     * Create an instance of {@link DescribeThemeItemType }
     * 
     */
    public DescribeThemeItemType createDescribeThemeItemType() {
        return new DescribeThemeItemType();
    }

    /**
     * Create an instance of {@link ProcessSubmitRequestType }
     * 
     */
    public ProcessSubmitRequestType createProcessSubmitRequestType() {
        return new ProcessSubmitRequestType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link DuplicateErrorType }
     * 
     */
    public DuplicateErrorType createDuplicateErrorType() {
        return new DuplicateErrorType();
    }

    /**
     * Create an instance of {@link DescribeFlexiPageRegionType }
     * 
     */
    public DescribeFlexiPageRegionType createDescribeFlexiPageRegionType() {
        return new DescribeFlexiPageRegionType();
    }

    /**
     * Create an instance of {@link AdditionalInformationMapType }
     * 
     */
    public AdditionalInformationMapType createAdditionalInformationMapType() {
        return new AdditionalInformationMapType();
    }

    /**
     * Create an instance of {@link SoqlNotConditionType }
     * 
     */
    public SoqlNotConditionType createSoqlNotConditionType() {
        return new SoqlNotConditionType();
    }

    /**
     * Create an instance of {@link RelationshipReferenceToType }
     * 
     */
    public RelationshipReferenceToType createRelationshipReferenceToType() {
        return new RelationshipReferenceToType();
    }

    /**
     * Create an instance of {@link DescribeQuickActionListItemResultType }
     * 
     */
    public DescribeQuickActionListItemResultType createDescribeQuickActionListItemResultType() {
        return new DescribeQuickActionListItemResultType();
    }

    /**
     * Create an instance of {@link DescribeIconType }
     * 
     */
    public DescribeIconType createDescribeIconType() {
        return new DescribeIconType();
    }

    /**
     * Create an instance of {@link DeletedRecordType }
     * 
     */
    public DeletedRecordType createDeletedRecordType() {
        return new DeletedRecordType();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneScreenPopOptionType }
     * 
     */
    public DescribeSoftphoneScreenPopOptionType createDescribeSoftphoneScreenPopOptionType() {
        return new DescribeSoftphoneScreenPopOptionType();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewType }
     * 
     */
    public DescribeSoqlListViewType createDescribeSoqlListViewType() {
        return new DescribeSoqlListViewType();
    }

    /**
     * Create an instance of {@link FieldDiffType }
     * 
     */
    public FieldDiffType createFieldDiffType() {
        return new FieldDiffType();
    }

    /**
     * Create an instance of {@link FilteredLookupInfoType }
     * 
     */
    public FilteredLookupInfoType createFilteredLookupInfoType() {
        return new FilteredLookupInfoType();
    }

    /**
     * Create an instance of {@link DataCategoryType }
     * 
     */
    public DataCategoryType createDataCategoryType() {
        return new DataCategoryType();
    }

    /**
     * Create an instance of {@link DescribeLayoutSectionType }
     * 
     */
    public DescribeLayoutSectionType createDescribeLayoutSectionType() {
        return new DescribeLayoutSectionType();
    }

    /**
     * Create an instance of {@link ListViewRecordColumnType }
     * 
     */
    public ListViewRecordColumnType createListViewRecordColumnType() {
        return new ListViewRecordColumnType();
    }

    /**
     * Create an instance of {@link SingleEmailMessageType }
     * 
     */
    public SingleEmailMessageType createSingleEmailMessageType() {
        return new SingleEmailMessageType();
    }

    /**
     * Create an instance of {@link MassEmailMessageType }
     * 
     */
    public MassEmailMessageType createMassEmailMessageType() {
        return new MassEmailMessageType();
    }

    /**
     * Create an instance of {@link PicklistForRecordTypeType }
     * 
     */
    public PicklistForRecordTypeType createPicklistForRecordTypeType() {
        return new PicklistForRecordTypeType();
    }

    /**
     * Create an instance of {@link DescribeAppMenuItemType }
     * 
     */
    public DescribeAppMenuItemType createDescribeAppMenuItemType() {
        return new DescribeAppMenuItemType();
    }

    /**
     * Create an instance of {@link FieldType }
     * 
     */
    public FieldType createFieldType() {
        return new FieldType();
    }

    /**
     * Create an instance of {@link DuplicateResultType }
     * 
     */
    public DuplicateResultType createDuplicateResultType() {
        return new DuplicateResultType();
    }

    /**
     * Create an instance of {@link ListViewRecordType }
     * 
     */
    public ListViewRecordType createListViewRecordType() {
        return new ListViewRecordType();
    }

    /**
     * Create an instance of {@link DescribeLayoutType }
     * 
     */
    public DescribeLayoutType createDescribeLayoutType() {
        return new DescribeLayoutType();
    }

    /**
     * Create an instance of {@link RecordTypeMappingType }
     * 
     */
    public RecordTypeMappingType createRecordTypeMappingType() {
        return new RecordTypeMappingType();
    }

    /**
     * Create an instance of {@link DescribeGlobalSObjectResultType }
     * 
     */
    public DescribeGlobalSObjectResultType createDescribeGlobalSObjectResultType() {
        return new DescribeGlobalSObjectResultType();
    }

    /**
     * Create an instance of {@link PicklistEntryType }
     * 
     */
    public PicklistEntryType createPicklistEntryType() {
        return new PicklistEntryType();
    }

    /**
     * Create an instance of {@link SearchRecordType }
     * 
     */
    public SearchRecordType createSearchRecordType() {
        return new SearchRecordType();
    }

    /**
     * Create an instance of {@link NamedLayoutInfoType }
     * 
     */
    public NamedLayoutInfoType createNamedLayoutInfoType() {
        return new NamedLayoutInfoType();
    }

    /**
     * Create an instance of {@link RelatedListColumnType }
     * 
     */
    public RelatedListColumnType createRelatedListColumnType() {
        return new RelatedListColumnType();
    }

    /**
     * Create an instance of {@link DescribeQuickActionDefaultValueType }
     * 
     */
    public DescribeQuickActionDefaultValueType createDescribeQuickActionDefaultValueType() {
        return new DescribeQuickActionDefaultValueType();
    }

    /**
     * Create an instance of {@link DescribeLayoutRowType }
     * 
     */
    public DescribeLayoutRowType createDescribeLayoutRowType() {
        return new DescribeLayoutRowType();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutCallTypeType }
     * 
     */
    public DescribeSoftphoneLayoutCallTypeType createDescribeSoftphoneLayoutCallTypeType() {
        return new DescribeSoftphoneLayoutCallTypeType();
    }

    /**
     * Create an instance of {@link NameValuePairType }
     * 
     */
    public NameValuePairType createNameValuePairType() {
        return new NameValuePairType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "contextId", scope = PerformQuickActionResultType.class)
    public JAXBElement<String> createPerformQuickActionResultTypeContextId(String value) {
        return new JAXBElement<String>(_PerformQuickActionResultTypeContextId_QNAME, String.class, PerformQuickActionResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "sobjectType", scope = DescribeFlexiPageResultType.class)
    public JAXBElement<String> createDescribeFlexiPageResultTypeSobjectType(String value) {
        return new JAXBElement<String>(_DescribeFlexiPageResultTypeSobjectType_QNAME, String.class, DescribeFlexiPageResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "contentType", scope = EmailFileAttachmentType.class)
    public JAXBElement<String> createEmailFileAttachmentTypeContentType(String value) {
        return new JAXBElement<String>(_EmailFileAttachmentTypeContentType_QNAME, String.class, EmailFileAttachmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "body", scope = EmailFileAttachmentType.class)
    public JAXBElement<byte[]> createEmailFileAttachmentTypeBody(byte[] value) {
        return new JAXBElement<byte[]>(_EmailFileAttachmentTypeBody_QNAME, byte[].class, EmailFileAttachmentType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "url", scope = DescribeLayoutButtonType.class)
    public JAXBElement<String> createDescribeLayoutButtonTypeUrl(String value) {
        return new JAXBElement<String>(_DescribeLayoutButtonTypeUrl_QNAME, String.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "encoding", scope = DescribeLayoutButtonType.class)
    public JAXBElement<String> createDescribeLayoutButtonTypeEncoding(String value) {
        return new JAXBElement<String>(_DescribeLayoutButtonTypeEncoding_QNAME, String.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebLinkTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "contentSource", scope = DescribeLayoutButtonType.class)
    public JAXBElement<WebLinkTypeType> createDescribeLayoutButtonTypeContentSource(WebLinkTypeType value) {
        return new JAXBElement<WebLinkTypeType>(_DescribeLayoutButtonTypeContentSource_QNAME, WebLinkTypeType.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "width", scope = DescribeLayoutButtonType.class)
    public JAXBElement<Integer> createDescribeLayoutButtonTypeWidth(Integer value) {
        return new JAXBElement<Integer>(_DescribeLayoutButtonTypeWidth_QNAME, Integer.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebLinkWindowTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "behavior", scope = DescribeLayoutButtonType.class)
    public JAXBElement<WebLinkWindowTypeType> createDescribeLayoutButtonTypeBehavior(WebLinkWindowTypeType value) {
        return new JAXBElement<WebLinkWindowTypeType>(_DescribeLayoutButtonTypeBehavior_QNAME, WebLinkWindowTypeType.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "content", scope = DescribeLayoutButtonType.class)
    public JAXBElement<String> createDescribeLayoutButtonTypeContent(String value) {
        return new JAXBElement<String>(_DescribeLayoutButtonTypeContent_QNAME, String.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebLinkPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "windowPosition", scope = DescribeLayoutButtonType.class)
    public JAXBElement<WebLinkPositionType> createDescribeLayoutButtonTypeWindowPosition(WebLinkPositionType value) {
        return new JAXBElement<WebLinkPositionType>(_DescribeLayoutButtonTypeWindowPosition_QNAME, WebLinkPositionType.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "height", scope = DescribeLayoutButtonType.class)
    public JAXBElement<Integer> createDescribeLayoutButtonTypeHeight(Integer value) {
        return new JAXBElement<Integer>(_DescribeLayoutButtonTypeHeight_QNAME, Integer.class, DescribeLayoutButtonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilteredLookupInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "filteredLookupInfo", scope = FieldType.class)
    public JAXBElement<FilteredLookupInfoType> createFieldTypeFilteredLookupInfo(FilteredLookupInfoType value) {
        return new JAXBElement<FilteredLookupInfoType>(_FieldTypeFilteredLookupInfo_QNAME, FilteredLookupInfoType.class, FieldType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "text", scope = SearchSnippetType.class)
    public JAXBElement<String> createSearchSnippetTypeText(String value) {
        return new JAXBElement<String>(_SearchSnippetTypeText_QNAME, String.class, SearchSnippetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSnippetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "snippet", scope = SearchRecordType.class)
    public JAXBElement<SearchSnippetType> createSearchRecordTypeSnippet(SearchSnippetType value) {
        return new JAXBElement<SearchSnippetType>(_SearchRecordTypeSnippet_QNAME, SearchSnippetType.class, SearchRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "lookupId", scope = RelatedListColumnType.class)
    public JAXBElement<String> createRelatedListColumnTypeLookupId(String value) {
        return new JAXBElement<String>(_RelatedListColumnTypeLookupId_QNAME, String.class, RelatedListColumnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "orgWideEmailAddressId", scope = SingleEmailMessageType.class)
    public JAXBElement<String> createSingleEmailMessageTypeOrgWideEmailAddressId(String value) {
        return new JAXBElement<String>(_SingleEmailMessageTypeOrgWideEmailAddressId_QNAME, String.class, SingleEmailMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "inReplyTo", scope = SingleEmailMessageType.class)
    public JAXBElement<String> createSingleEmailMessageTypeInReplyTo(String value) {
        return new JAXBElement<String>(_SingleEmailMessageTypeInReplyTo_QNAME, String.class, SingleEmailMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "references", scope = SingleEmailMessageType.class)
    public JAXBElement<String> createSingleEmailMessageTypeReferences(String value) {
        return new JAXBElement<String>(_SingleEmailMessageTypeReferences_QNAME, String.class, SingleEmailMessageType.class, value);
    }

}

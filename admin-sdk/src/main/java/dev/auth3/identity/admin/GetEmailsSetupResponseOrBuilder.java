// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface GetEmailsSetupResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate welcome = 1[json_name = "welcome"];</code>
   * @return Whether the welcome field is set.
   */
  boolean hasWelcome();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate welcome = 1[json_name = "welcome"];</code>
   * @return The welcome.
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplate getWelcome();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate welcome = 1[json_name = "welcome"];</code>
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplateOrBuilder getWelcomeOrBuilder();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_verification = 2[json_name = "accountVerification"];</code>
   * @return Whether the accountVerification field is set.
   */
  boolean hasAccountVerification();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_verification = 2[json_name = "accountVerification"];</code>
   * @return The accountVerification.
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplate getAccountVerification();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_verification = 2[json_name = "accountVerification"];</code>
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplateOrBuilder getAccountVerificationOrBuilder();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_recovery = 3[json_name = "accountRecovery"];</code>
   * @return Whether the accountRecovery field is set.
   */
  boolean hasAccountRecovery();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_recovery = 3[json_name = "accountRecovery"];</code>
   * @return The accountRecovery.
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplate getAccountRecovery();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_recovery = 3[json_name = "accountRecovery"];</code>
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplateOrBuilder getAccountRecoveryOrBuilder();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_recovered = 4[json_name = "accountRecovered"];</code>
   * @return Whether the accountRecovered field is set.
   */
  boolean hasAccountRecovered();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_recovered = 4[json_name = "accountRecovered"];</code>
   * @return The accountRecovered.
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplate getAccountRecovered();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate account_recovered = 4[json_name = "accountRecovered"];</code>
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplateOrBuilder getAccountRecoveredOrBuilder();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate otp = 5[json_name = "otp"];</code>
   * @return Whether the otp field is set.
   */
  boolean hasOtp();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate otp = 5[json_name = "otp"];</code>
   * @return The otp.
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplate getOtp();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailTemplate otp = 5[json_name = "otp"];</code>
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailTemplateOrBuilder getOtpOrBuilder();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailSender smtp = 6[json_name = "smtp"];</code>
   * @return Whether the smtp field is set.
   */
  boolean hasSmtp();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailSender smtp = 6[json_name = "smtp"];</code>
   * @return The smtp.
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailSender getSmtp();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetEmailsSetupResponse.EmailSender smtp = 6[json_name = "smtp"];</code>
   */
  dev.auth3.identity.admin.GetEmailsSetupResponse.EmailSenderOrBuilder getSmtpOrBuilder();

  /**
   * <code>string project_id = 7[json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 7[json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface GetUserBaseStatisticsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.GetUserBaseStatisticsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 total_users = 1[json_name = "totalUsers"];</code>
   * @return The totalUsers.
   */
  int getTotalUsers();

  /**
   * <code>map&lt;string, int32&gt; users_per_day = 2[json_name = "usersPerDay"];</code>
   */
  int getUsersPerDayCount();
  /**
   * <code>map&lt;string, int32&gt; users_per_day = 2[json_name = "usersPerDay"];</code>
   */
  boolean containsUsersPerDay(
      java.lang.String key);
  /**
   * Use {@link #getUsersPerDayMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getUsersPerDay();
  /**
   * <code>map&lt;string, int32&gt; users_per_day = 2[json_name = "usersPerDay"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getUsersPerDayMap();
  /**
   * <code>map&lt;string, int32&gt; users_per_day = 2[json_name = "usersPerDay"];</code>
   */

  int getUsersPerDayOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, int32&gt; users_per_day = 2[json_name = "usersPerDay"];</code>
   */

  int getUsersPerDayOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, int32&gt; sessions_per_day = 3[json_name = "sessionsPerDay"];</code>
   */
  int getSessionsPerDayCount();
  /**
   * <code>map&lt;string, int32&gt; sessions_per_day = 3[json_name = "sessionsPerDay"];</code>
   */
  boolean containsSessionsPerDay(
      java.lang.String key);
  /**
   * Use {@link #getSessionsPerDayMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getSessionsPerDay();
  /**
   * <code>map&lt;string, int32&gt; sessions_per_day = 3[json_name = "sessionsPerDay"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getSessionsPerDayMap();
  /**
   * <code>map&lt;string, int32&gt; sessions_per_day = 3[json_name = "sessionsPerDay"];</code>
   */

  int getSessionsPerDayOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, int32&gt; sessions_per_day = 3[json_name = "sessionsPerDay"];</code>
   */

  int getSessionsPerDayOrThrow(
      java.lang.String key);

  /**
   * <code>int32 total_active_users = 4[json_name = "totalActiveUsers"];</code>
   * @return The totalActiveUsers.
   */
  int getTotalActiveUsers();

  /**
   * <code>double total_lifetime_used = 5[json_name = "totalLifetimeUsed"];</code>
   * @return The totalLifetimeUsed.
   */
  double getTotalLifetimeUsed();
}

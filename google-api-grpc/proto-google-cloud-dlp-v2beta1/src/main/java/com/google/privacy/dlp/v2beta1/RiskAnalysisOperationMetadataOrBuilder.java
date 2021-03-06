// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface RiskAnalysisOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.RiskAnalysisOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time which this request was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time which this request was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time which this request was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrivacyMetric requested_privacy_metric = 2;</code>
   */
  boolean hasRequestedPrivacyMetric();
  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrivacyMetric requested_privacy_metric = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.PrivacyMetric getRequestedPrivacyMetric();
  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrivacyMetric requested_privacy_metric = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.PrivacyMetricOrBuilder getRequestedPrivacyMetricOrBuilder();

  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.BigQueryTable requested_source_table = 3;</code>
   */
  boolean hasRequestedSourceTable();
  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.BigQueryTable requested_source_table = 3;</code>
   */
  com.google.privacy.dlp.v2beta1.BigQueryTable getRequestedSourceTable();
  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.BigQueryTable requested_source_table = 3;</code>
   */
  com.google.privacy.dlp.v2beta1.BigQueryTableOrBuilder getRequestedSourceTableOrBuilder();
}

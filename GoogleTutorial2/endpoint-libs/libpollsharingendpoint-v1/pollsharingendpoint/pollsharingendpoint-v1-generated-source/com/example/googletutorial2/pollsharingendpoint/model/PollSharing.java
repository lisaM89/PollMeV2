/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-12-19 23:55:21 UTC)
 * on 2013-12-28 at 17:39:44 UTC 
 * Modify at your own risk.
 */

package com.example.googletutorial2.pollsharingendpoint.model;

/**
 * Model definition for PollSharing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the pollsharingendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PollSharing extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime dataInv;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destInvito;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key keyPS;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String letto;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mittInvito;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key poll;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDataInv() {
    return dataInv;
  }

  /**
   * @param dataInv dataInv or {@code null} for none
   */
  public PollSharing setDataInv(com.google.api.client.util.DateTime dataInv) {
    this.dataInv = dataInv;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDestInvito() {
    return destInvito;
  }

  /**
   * @param destInvito destInvito or {@code null} for none
   */
  public PollSharing setDestInvito(java.lang.String destInvito) {
    this.destInvito = destInvito;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getKeyPS() {
    return keyPS;
  }

  /**
   * @param keyPS keyPS or {@code null} for none
   */
  public PollSharing setKeyPS(Key keyPS) {
    this.keyPS = keyPS;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLetto() {
    return letto;
  }

  /**
   * @param letto letto or {@code null} for none
   */
  public PollSharing setLetto(java.lang.String letto) {
    this.letto = letto;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMittInvito() {
    return mittInvito;
  }

  /**
   * @param mittInvito mittInvito or {@code null} for none
   */
  public PollSharing setMittInvito(java.lang.String mittInvito) {
    this.mittInvito = mittInvito;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getPoll() {
    return poll;
  }

  /**
   * @param poll poll or {@code null} for none
   */
  public PollSharing setPoll(Key poll) {
    this.poll = poll;
    return this;
  }

  @Override
  public PollSharing set(String fieldName, Object value) {
    return (PollSharing) super.set(fieldName, value);
  }

  @Override
  public PollSharing clone() {
    return (PollSharing) super.clone();
  }

}
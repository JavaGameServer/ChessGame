// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrFightMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.fight;

public interface FireRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FireRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  int getMsgIdValue();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  info.xiaomo.server.shared.protocol.msg.MsgId getMsgId();

  /**
   * <pre>
   *目标鱼
   * </pre>
   *
   * <code>int64 targetFishId = 2;</code>
   * @return The targetFishId.
   */
  long getTargetFishId();

  /**
   * <pre>
   *开炮金币
   * </pre>
   *
   * <code>int32 gold = 3;</code>
   * @return The gold.
   */
  int getGold();

  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>float angleX = 4;</code>
   * @return The angleX.
   */
  float getAngleX();

  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>float angleY = 5;</code>
   * @return The angleY.
   */
  float getAngleY();
}
package com.github.nicholasmoser.gecko.codes;

import com.github.nicholasmoser.utils.ByteUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Unlock Everything
 * https://github.com/NicholasMoser/Naruto-GNT-Modding/blob/master/gnt4/docs/guides/gecko_codes.md#unlock-everything-nick-1
 */
public class UnlockEverything implements GeckoInjectionCode {

  public final static byte[] CODE = new byte[]{0x38, 0x60, (byte) 0xFF, (byte) 0xFF,
      0x3F, (byte) 0xC0, (byte) 0x80, 0x22, (byte) 0x90, 0x7E, 0x32, 0x58, (byte) 0x90, 0x7E, 0x32,
      0x5C, (byte) 0x90, 0x7E, 0x32, 0x60, (byte) 0x90, 0x7E, 0x32, 0x64, (byte) 0x90, 0x7E, 0x32,
      0x68, (byte) 0x90, 0x7E, 0x32, 0x6C, (byte) 0x90, 0x7E, 0x32, 0x70, (byte) 0x90, 0x7E, 0x32,
      0x74, (byte) 0x90, 0x7E, 0x32, 0x78, (byte) 0x90, 0x7E, 0x32, 0x7C, (byte) 0x90, 0x7E, 0x32,
      (byte) 0x80, (byte) 0x90, 0x7E, 0x32, (byte) 0x84, (byte) 0x90, 0x7E, 0x32, (byte) 0xFC,
      (byte) 0x90, 0x7E, 0x33, 0x00, (byte) 0x90, 0x7E, 0x33, 0x04, (byte) 0x90, 0x7E, 0x33, 0x08,
      (byte) 0x90, 0x7E, 0x33, 0x0C, (byte) 0x90, 0x7E, 0x33, 0x10, (byte) 0x90, 0x7E, 0x33, 0x14,
      (byte) 0x90, 0x7E, 0x33, 0x18, (byte) 0x90, 0x7E, 0x33, 0x1C, (byte) 0x90, 0x7E, 0x33, 0x20,
      (byte) 0x90, 0x7E, 0x33, 0x24, (byte) 0x90, 0x7E, 0x33, 0x28, (byte) 0x90, 0x7E, 0x33, 0x2C,
      (byte) 0x90, 0x7E, 0x33, 0x30, (byte) 0x90, 0x7E, 0x33, 0x34, (byte) 0x90, 0x7E, 0x33, 0x38,
      (byte) 0x90, 0x7E, 0x33, 0x3C, 0x3F, (byte) 0xE0, 0x00, 0x02, 0x38, 0x7F, (byte) 0xFF, 0x03,
      (byte) 0x90, 0x7E, 0x32, (byte) 0xE8, 0x38, 0x60, 0x00, 0x00};

  @Override
  public byte[] getCode() {
    return CODE;
  }

  @Override
  public JSONObject getJSONObject(long hijackedAddress, byte[] hijackedBytes) {
    JSONObject codeGroup = new JSONObject();
    codeGroup.put("name", "Unlock Everything [Nick]");
    JSONArray codes = new JSONArray();
    JSONObject code = new JSONObject();
    code.put("hijackedAddress", ByteUtils.fromLong(hijackedAddress));
    code.put("bytes", ByteUtils.bytesToHexString(CODE) + "00000000");
    code.put("targetAddress", "8008956C");
    code.put("hijackedBytes", ByteUtils.bytesToHexString(hijackedBytes));
    code.put("replacedBytes", "38600000");
    code.put("type", "C2");
    codes.put(code);
    codeGroup.put("codes", codes);
    return codeGroup;
  }
}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkEcc {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected CkEcc(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public CkEcc() {
        this(chilkatJNI.new_CkEcc(), true);
    }

    protected static long getCPtr(CkEcc obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                chilkatJNI.delete_CkEcc(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public void LastErrorXml(CkString str) {
        chilkatJNI.CkEcc_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public void LastErrorHtml(CkString str) {
        chilkatJNI.CkEcc_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public void LastErrorText(CkString str) {
        chilkatJNI.CkEcc_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public void get_DebugLogFilePath(CkString str) {
        chilkatJNI.CkEcc_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public String debugLogFilePath() {
        return chilkatJNI.CkEcc_debugLogFilePath(swigCPtr, this);
    }

    public void put_DebugLogFilePath(String newVal) {
        chilkatJNI.CkEcc_put_DebugLogFilePath(swigCPtr, this, newVal);
    }

    public void get_LastErrorHtml(CkString str) {
        chilkatJNI.CkEcc_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public String lastErrorHtml() {
        return chilkatJNI.CkEcc_lastErrorHtml(swigCPtr, this);
    }

    public void get_LastErrorText(CkString str) {
        chilkatJNI.CkEcc_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public String lastErrorText() {
        return chilkatJNI.CkEcc_lastErrorText(swigCPtr, this);
    }

    public void get_LastErrorXml(CkString str) {
        chilkatJNI.CkEcc_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public String lastErrorXml() {
        return chilkatJNI.CkEcc_lastErrorXml(swigCPtr, this);
    }

    public boolean get_LastMethodSuccess() {
        return chilkatJNI.CkEcc_get_LastMethodSuccess(swigCPtr, this);
    }

    public void put_LastMethodSuccess(boolean newVal) {
        chilkatJNI.CkEcc_put_LastMethodSuccess(swigCPtr, this, newVal);
    }

    public boolean get_VerboseLogging() {
        return chilkatJNI.CkEcc_get_VerboseLogging(swigCPtr, this);
    }

    public void put_VerboseLogging(boolean newVal) {
        chilkatJNI.CkEcc_put_VerboseLogging(swigCPtr, this, newVal);
    }

    public void get_Version(CkString str) {
        chilkatJNI.CkEcc_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
    }

    public String version() {
        return chilkatJNI.CkEcc_version(swigCPtr, this);
    }

    public CkPrivateKey GenEccKey(String curveName, CkPrng prng) {
        long cPtr = chilkatJNI.CkEcc_GenEccKey(swigCPtr, this, curveName, CkPrng.getCPtr(prng), prng);
        return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
    }

    public CkPrivateKey GenEccKey2(String curveName, String encodedK, String encoding) {
        long cPtr = chilkatJNI.CkEcc_GenEccKey2(swigCPtr, this, curveName, encodedK, encoding);
        return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
    }

    public boolean SaveLastError(String path) {
        return chilkatJNI.CkEcc_SaveLastError(swigCPtr, this, path);
    }

    public boolean SharedSecretENC(CkPrivateKey privKey, CkPublicKey pubKey, String encoding, CkString outStr) {
        return chilkatJNI.CkEcc_SharedSecretENC(swigCPtr, this, CkPrivateKey.getCPtr(privKey), privKey, CkPublicKey.getCPtr(pubKey), pubKey, encoding, CkString.getCPtr(outStr), outStr);
    }

    public String sharedSecretENC(CkPrivateKey privKey, CkPublicKey pubKey, String encoding) {
        return chilkatJNI.CkEcc_sharedSecretENC(swigCPtr, this, CkPrivateKey.getCPtr(privKey), privKey, CkPublicKey.getCPtr(pubKey), pubKey, encoding);
    }

    public boolean SignHashENC(String encodedHash, String encoding, CkPrivateKey privkey, CkPrng prng, CkString outStr) {
        return chilkatJNI.CkEcc_SignHashENC(swigCPtr, this, encodedHash, encoding, CkPrivateKey.getCPtr(privkey), privkey, CkPrng.getCPtr(prng), prng, CkString.getCPtr(outStr), outStr);
    }

    public String signHashENC(String encodedHash, String encoding, CkPrivateKey privkey, CkPrng prng) {
        return chilkatJNI.CkEcc_signHashENC(swigCPtr, this, encodedHash, encoding, CkPrivateKey.getCPtr(privkey), privkey, CkPrng.getCPtr(prng), prng);
    }

    public int VerifyHashENC(String encodedHash, String encodedSig, String encoding, CkPublicKey pubkey) {
        return chilkatJNI.CkEcc_VerifyHashENC(swigCPtr, this, encodedHash, encodedSig, encoding, CkPublicKey.getCPtr(pubkey), pubkey);
    }

}

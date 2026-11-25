package com.oplus.wrapper.hardware.camera2;

import com.oplus.wrapper.hardware.camera2.impl.CameraMetadataNative;

/** Used by the OCS camera SDK (ApsUtils.getMetadataPtrForJni) on OplusOS SDK >= 34. */
public class CaptureResult {
    private final android.hardware.camera2.CaptureResult mCaptureResult;

    public CaptureResult(android.hardware.camera2.CaptureResult captureResult) {
        mCaptureResult = captureResult;
    }

    public CameraMetadataNative getNativeMetadata() {
        return new CameraMetadataNative(mCaptureResult);
    }
}

package com.oplus.wrapper.hardware.camera2;

import com.oplus.wrapper.hardware.camera2.impl.CameraMetadataNative;

/** Looked up reflectively by the OCS camera SDK (ApsUtils.getMetadataPtrForJni). */
public class CameraCharacteristics {
    private final android.hardware.camera2.CameraCharacteristics mCharacteristics;

    public CameraCharacteristics(android.hardware.camera2.CameraCharacteristics characteristics) {
        mCharacteristics = characteristics;
    }

    public CameraMetadataNative getNativeMetadata() {
        return new CameraMetadataNative(mCharacteristics);
    }
}

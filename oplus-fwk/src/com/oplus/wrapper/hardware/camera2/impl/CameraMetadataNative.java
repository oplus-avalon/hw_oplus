package com.oplus.wrapper.hardware.camera2.impl;

import com.oplus.inner.hardware.camera2.impl.CameraMetadataNativeWrapper;

/**
 * Wrapper handed out by {@link com.oplus.wrapper.hardware.camera2.CaptureResult} and
 * {@link com.oplus.wrapper.hardware.camera2.CameraCharacteristics#getNativeMetadata()}.
 *
 * It holds a strong reference to the source camera2 object and resolves the pointer of that
 * object's OWN native metadata buffer (never a getNativeCopy() throwaway, which GC frees while
 * APS still uses the raw pointer). See CameraMetadataNativeWrapper for the lifetime rationale.
 */
public class CameraMetadataNative {
    private final Object mSource;

    public CameraMetadataNative(Object source) {
        mSource = source;
    }

    public long getMetadataPtr() {
        return CameraMetadataNativeWrapper.getMetadataPtr(mSource);
    }
}

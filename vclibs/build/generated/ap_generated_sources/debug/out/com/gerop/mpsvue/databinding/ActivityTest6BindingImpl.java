package com.gerop.mpsvue.databinding;
import com.gerop.mpsvue.R;
import com.gerop.mpsvue.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTest6BindingImpl extends ActivityTest6Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.surface_view2, 5);
        sViewsWithIds.put(R.id.tv_report, 6);
        sViewsWithIds.put(R.id.surface_view, 7);
        sViewsWithIds.put(R.id.camera_preview, 8);
        sViewsWithIds.put(R.id.iv_cancel, 9);
        sViewsWithIds.put(R.id.bottom, 10);
        sViewsWithIds.put(R.id.iv_camera, 11);
        sViewsWithIds.put(R.id.audio_mute, 12);
        sViewsWithIds.put(R.id.audio_speaker, 13);
        sViewsWithIds.put(R.id.cancel_connect, 14);
        sViewsWithIds.put(R.id.anim_text, 15);
        sViewsWithIds.put(R.id.cntr_down, 16);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @Nullable
    private final com.gerop.mpsvue.databinding.AllOurBannerBinding mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final com.gerop.mpsvue.databinding.AllOurNativeBinding mboundView21;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTest6BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityTest6BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[9]
            , (org.webrtc.SurfaceViewRenderer) bindings[7]
            , (org.webrtc.SurfaceViewRenderer) bindings[5]
            , (android.widget.ImageView) bindings[6]
            );
        this.connectionMask.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (bindings[4] != null) ? com.gerop.mpsvue.databinding.AllOurBannerBinding.bind((android.view.View) bindings[4]) : null;
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (bindings[3] != null) ? com.gerop.mpsvue.databinding.AllOurNativeBinding.bind((android.view.View) bindings[3]) : null;
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}
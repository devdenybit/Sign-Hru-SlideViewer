package com.gerop.mpsvue;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gerop.mpsvue.databinding.ActivityTest10BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest1BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest2BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest3BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest4BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest5BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest6BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest7BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest8BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTest9BindingImpl;
import com.gerop.mpsvue.databinding.ActivityTestBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYTEST = 1;

  private static final int LAYOUT_ACTIVITYTEST1 = 2;

  private static final int LAYOUT_ACTIVITYTEST10 = 3;

  private static final int LAYOUT_ACTIVITYTEST2 = 4;

  private static final int LAYOUT_ACTIVITYTEST3 = 5;

  private static final int LAYOUT_ACTIVITYTEST4 = 6;

  private static final int LAYOUT_ACTIVITYTEST5 = 7;

  private static final int LAYOUT_ACTIVITYTEST6 = 8;

  private static final int LAYOUT_ACTIVITYTEST7 = 9;

  private static final int LAYOUT_ACTIVITYTEST8 = 10;

  private static final int LAYOUT_ACTIVITYTEST9 = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test, LAYOUT_ACTIVITYTEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_1, LAYOUT_ACTIVITYTEST1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_10, LAYOUT_ACTIVITYTEST10);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_2, LAYOUT_ACTIVITYTEST2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_3, LAYOUT_ACTIVITYTEST3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_4, LAYOUT_ACTIVITYTEST4);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_5, LAYOUT_ACTIVITYTEST5);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_6, LAYOUT_ACTIVITYTEST6);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_7, LAYOUT_ACTIVITYTEST7);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_8, LAYOUT_ACTIVITYTEST8);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gerop.mpsvue.R.layout.activity_test_9, LAYOUT_ACTIVITYTEST9);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYTEST: {
          if ("layout/activity_test_0".equals(tag)) {
            return new ActivityTestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST1: {
          if ("layout/activity_test_1_0".equals(tag)) {
            return new ActivityTest1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST10: {
          if ("layout/activity_test_10_0".equals(tag)) {
            return new ActivityTest10BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_10 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST2: {
          if ("layout/activity_test_2_0".equals(tag)) {
            return new ActivityTest2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST3: {
          if ("layout/activity_test_3_0".equals(tag)) {
            return new ActivityTest3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST4: {
          if ("layout/activity_test_4_0".equals(tag)) {
            return new ActivityTest4BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_4 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST5: {
          if ("layout/activity_test_5_0".equals(tag)) {
            return new ActivityTest5BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_5 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST6: {
          if ("layout/activity_test_6_0".equals(tag)) {
            return new ActivityTest6BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_6 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST7: {
          if ("layout/activity_test_7_0".equals(tag)) {
            return new ActivityTest7BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_7 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST8: {
          if ("layout/activity_test_8_0".equals(tag)) {
            return new ActivityTest8BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_8 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEST9: {
          if ("layout/activity_test_9_0".equals(tag)) {
            return new ActivityTest9BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_test_9 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_test_0", com.gerop.mpsvue.R.layout.activity_test);
      sKeys.put("layout/activity_test_1_0", com.gerop.mpsvue.R.layout.activity_test_1);
      sKeys.put("layout/activity_test_10_0", com.gerop.mpsvue.R.layout.activity_test_10);
      sKeys.put("layout/activity_test_2_0", com.gerop.mpsvue.R.layout.activity_test_2);
      sKeys.put("layout/activity_test_3_0", com.gerop.mpsvue.R.layout.activity_test_3);
      sKeys.put("layout/activity_test_4_0", com.gerop.mpsvue.R.layout.activity_test_4);
      sKeys.put("layout/activity_test_5_0", com.gerop.mpsvue.R.layout.activity_test_5);
      sKeys.put("layout/activity_test_6_0", com.gerop.mpsvue.R.layout.activity_test_6);
      sKeys.put("layout/activity_test_7_0", com.gerop.mpsvue.R.layout.activity_test_7);
      sKeys.put("layout/activity_test_8_0", com.gerop.mpsvue.R.layout.activity_test_8);
      sKeys.put("layout/activity_test_9_0", com.gerop.mpsvue.R.layout.activity_test_9);
    }
  }
}

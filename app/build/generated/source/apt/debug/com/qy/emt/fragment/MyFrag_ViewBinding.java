// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyFrag_ViewBinding implements Unbinder {
  private MyFrag target;

  private View view2131296645;

  private View view2131296923;

  private View view2131296381;

  private View view2131296927;

  private View view2131296302;

  private View view2131296409;

  private View view2131296533;

  @UiThread
  public MyFrag_ViewBinding(final MyFrag target, View source) {
    this.target = target;

    View view;
    target.wallet_name_id = Utils.findRequiredViewAsType(source, R.id.wallet_name_id, "field 'wallet_name_id'", TextView.class);
    view = Utils.findRequiredView(source, R.id.notice_center_id, "field 'notice_center_id' and method 'onClick'");
    target.notice_center_id = Utils.castView(view, R.id.notice_center_id, "field 'notice_center_id'", LinearLayout.class);
    view2131296645 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.user_fallback_id, "field 'user_fallback_id' and method 'onClick'");
    target.user_fallback_id = Utils.castView(view, R.id.user_fallback_id, "field 'user_fallback_id'", LinearLayout.class);
    view2131296923 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.change_pass_id, "field 'change_pass_id' and method 'onClick'");
    target.change_pass_id = Utils.castView(view, R.id.change_pass_id, "field 'change_pass_id'", LinearLayout.class);
    view2131296381 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.user_protel_id, "field 'user_protel_id' and method 'onClick'");
    target.user_protel_id = Utils.castView(view, R.id.user_protel_id, "field 'user_protel_id'", LinearLayout.class);
    view2131296927 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.about_us_id, "field 'about_us_id' and method 'onClick'");
    target.about_us_id = Utils.castView(view, R.id.about_us_id, "field 'about_us_id'", LinearLayout.class);
    view2131296302 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.curr_version_id, "field 'curr_version_id' and method 'onClick'");
    target.curr_version_id = Utils.castView(view, R.id.curr_version_id, "field 'curr_version_id'", LinearLayout.class);
    view2131296409 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.notice_num_id = Utils.findRequiredViewAsType(source, R.id.notice_num_id, "field 'notice_num_id'", TextView.class);
    view = Utils.findRequiredView(source, R.id.layout_out, "method 'onClick'");
    view2131296533 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MyFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.wallet_name_id = null;
    target.notice_center_id = null;
    target.user_fallback_id = null;
    target.change_pass_id = null;
    target.user_protel_id = null;
    target.about_us_id = null;
    target.curr_version_id = null;
    target.notice_num_id = null;

    view2131296645.setOnClickListener(null);
    view2131296645 = null;
    view2131296923.setOnClickListener(null);
    view2131296923 = null;
    view2131296381.setOnClickListener(null);
    view2131296381 = null;
    view2131296927.setOnClickListener(null);
    view2131296927 = null;
    view2131296302.setOnClickListener(null);
    view2131296302 = null;
    view2131296409.setOnClickListener(null);
    view2131296409 = null;
    view2131296533.setOnClickListener(null);
    view2131296533 = null;
  }
}

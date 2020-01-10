// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import com.qy.emt.view.group.banner.BannerLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ApplicationFrag_ViewBinding implements Unbinder {
  private ApplicationFrag target;

  private View view2131296970;

  private View view2131296752;

  @UiThread
  public ApplicationFrag_ViewBinding(final ApplicationFrag target, View source) {
    this.target = target;

    View view;
    target.nllMain = Utils.findRequiredViewAsType(source, R.id.nll_main, "field 'nllMain'", NavigationLucencyLayout.class);
    target.blIncludeMain = Utils.findRequiredViewAsType(source, R.id.bl_include_main, "field 'blIncludeMain'", BannerLayout.class);
    target.ll_id_root = Utils.findRequiredViewAsType(source, R.id.ll_id_root, "field 'll_id_root'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.zhongchu_app_id, "method 'onClick'");
    view2131296970 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.shengtai_app, "method 'onClick'");
    view2131296752 = view;
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
    ApplicationFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllMain = null;
    target.blIncludeMain = null;
    target.ll_id_root = null;

    view2131296970.setOnClickListener(null);
    view2131296970 = null;
    view2131296752.setOnClickListener(null);
    view2131296752 = null;
  }
}

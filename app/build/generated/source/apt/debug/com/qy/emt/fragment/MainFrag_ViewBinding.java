// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import com.qy.emt.view.group.banner.BannerLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainFrag_ViewBinding implements Unbinder {
  private MainFrag target;

  @UiThread
  public MainFrag_ViewBinding(MainFrag target, View source) {
    this.target = target;

    target.nllMain = Utils.findRequiredViewAsType(source, R.id.nll_main, "field 'nllMain'", NavigationLucencyLayout.class);
    target.vpRecyclerView = Utils.findRequiredViewAsType(source, R.id.vp_wallet, "field 'vpRecyclerView'", LRecyclerView.class);
    target.blIncludeMain = Utils.findRequiredViewAsType(source, R.id.bl_include_main, "field 'blIncludeMain'", BannerLayout.class);
    target.tv_testbtn = Utils.findRequiredViewAsType(source, R.id.tv_testbtn, "field 'tv_testbtn'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllMain = null;
    target.vpRecyclerView = null;
    target.blIncludeMain = null;
    target.tv_testbtn = null;
  }
}

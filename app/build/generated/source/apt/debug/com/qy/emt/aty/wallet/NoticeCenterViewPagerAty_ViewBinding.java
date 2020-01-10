// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.TabPageIndicator;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NoticeCenterViewPagerAty_ViewBinding implements Unbinder {
  private NoticeCenterViewPagerAty target;

  @UiThread
  public NoticeCenterViewPagerAty_ViewBinding(NoticeCenterViewPagerAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NoticeCenterViewPagerAty_ViewBinding(NoticeCenterViewPagerAty target, View source) {
    this.target = target;

    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    target.viewpager_indic = Utils.findRequiredViewAsType(source, R.id.viewpager_indic, "field 'viewpager_indic'", TabPageIndicator.class);
    target.viewpager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'viewpager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoticeCenterViewPagerAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
    target.viewpager_indic = null;
    target.viewpager = null;
  }
}

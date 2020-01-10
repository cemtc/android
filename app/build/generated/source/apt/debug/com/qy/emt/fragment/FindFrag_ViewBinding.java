// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.banner.BannerLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FindFrag_ViewBinding implements Unbinder {
  private FindFrag target;

  private View view2131296454;

  private View view2131296740;

  private View view2131296721;

  private View view2131296363;

  private View view2131296375;

  private View view2131296482;

  private View view2131296595;

  private View view2131296651;

  @UiThread
  public FindFrag_ViewBinding(final FindFrag target, View source) {
    this.target = target;

    View view;
    target.blIncludeMain = Utils.findRequiredViewAsType(source, R.id.bl_include_main, "field 'blIncludeMain'", BannerLayout.class);
    view = Utils.findRequiredView(source, R.id.etherscan_id, "field 'etherscan_id' and method 'onClick'");
    target.etherscan_id = Utils.castView(view, R.id.etherscan_id, "field 'etherscan_id'", LinearLayout.class);
    view2131296454 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.search_img, "field 'search_img' and method 'onClick'");
    target.search_img = Utils.castView(view, R.id.search_img, "field 'search_img'", ImageView.class);
    view2131296740 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.search_text = Utils.findRequiredViewAsType(source, R.id.search_text, "field 'search_text'", EditText.class);
    view = Utils.findRequiredView(source, R.id.sar_id, "method 'onClick'");
    view2131296721 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btc_id, "method 'onClick'");
    view2131296363 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ccm_id, "method 'onClick'");
    view2131296375 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ht_id, "method 'onClick'");
    view2131296482 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.lsk_id, "method 'onClick'");
    view2131296595 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.okb_id, "method 'onClick'");
    view2131296651 = view;
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
    FindFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.blIncludeMain = null;
    target.etherscan_id = null;
    target.search_img = null;
    target.search_text = null;

    view2131296454.setOnClickListener(null);
    view2131296454 = null;
    view2131296740.setOnClickListener(null);
    view2131296740 = null;
    view2131296721.setOnClickListener(null);
    view2131296721 = null;
    view2131296363.setOnClickListener(null);
    view2131296363 = null;
    view2131296375.setOnClickListener(null);
    view2131296375 = null;
    view2131296482.setOnClickListener(null);
    view2131296482 = null;
    view2131296595.setOnClickListener(null);
    view2131296595 = null;
    view2131296651.setOnClickListener(null);
    view2131296651 = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class InviteCodeAty_ViewBinding implements Unbinder {
  private InviteCodeAty target;

  private View view2131296506;

  private View view2131296431;

  private View view2131296507;

  @UiThread
  public InviteCodeAty_ViewBinding(InviteCodeAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public InviteCodeAty_ViewBinding(final InviteCodeAty target, View source) {
    this.target = target;

    View view;
    target.nllWalletMarket = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nllWalletMarket'", NavigationLucencyLayout.class);
    target.ll_id = Utils.findRequiredViewAsType(source, R.id.ll_id, "field 'll_id'", LinearLayout.class);
    target.invite_code = Utils.findRequiredViewAsType(source, R.id.invite_code, "field 'invite_code'", TextView.class);
    target.img_core = Utils.findRequiredViewAsType(source, R.id.img_core, "field 'img_core'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.invite_code_copy, "method 'onClick'");
    view2131296506 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.download_link, "method 'onClick'");
    view2131296431 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.invite_paper, "method 'onClick'");
    view2131296507 = view;
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
    InviteCodeAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletMarket = null;
    target.ll_id = null;
    target.invite_code = null;
    target.img_core = null;

    view2131296506.setOnClickListener(null);
    view2131296506 = null;
    view2131296431.setOnClickListener(null);
    view2131296431 = null;
    view2131296507.setOnClickListener(null);
    view2131296507 = null;
  }
}

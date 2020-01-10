// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.account;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginAty_ViewBinding implements Unbinder {
  private LoginAty target;

  private View view2131296854;

  private View view2131296851;

  private View view2131296853;

  @UiThread
  public LoginAty_ViewBinding(LoginAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginAty_ViewBinding(final LoginAty target, View source) {
    this.target = target;

    View view;
    target.nllLogin = Utils.findRequiredViewAsType(source, R.id.nll_login, "field 'nllLogin'", NavigationLucencyLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_login_show, "field 'tvLoginShow' and method 'onClick'");
    target.tvLoginShow = Utils.castView(view, R.id.tv_login_show, "field 'tvLoginShow'", ImageView.class);
    view2131296854 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.etLogin = Utils.findRequiredViewAsType(source, R.id.et_login, "field 'etLogin'", EditText.class);
    view = Utils.findRequiredView(source, R.id.tv_login_create, "method 'onClick'");
    view2131296851 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_login_into, "method 'onClick'");
    view2131296853 = view;
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
    LoginAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllLogin = null;
    target.tvLoginShow = null;
    target.etLogin = null;

    view2131296854.setOnClickListener(null);
    view2131296854 = null;
    view2131296851.setOnClickListener(null);
    view2131296851 = null;
    view2131296853.setOnClickListener(null);
    view2131296853 = null;
  }
}

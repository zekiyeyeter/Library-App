// Generated by view binder compiler. Do not edit!
package com.example.kutsis.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kutsis.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResetpasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextInputLayout resetEmail;

  @NonNull
  public final TextInputEditText resetEmailEditText;

  @NonNull
  public final MaterialButton resetPasswordBtn;

  private ActivityResetpasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView, @NonNull TextInputLayout resetEmail,
      @NonNull TextInputEditText resetEmailEditText, @NonNull MaterialButton resetPasswordBtn) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.resetEmail = resetEmail;
    this.resetEmailEditText = resetEmailEditText;
    this.resetPasswordBtn = resetPasswordBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResetpasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResetpasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_resetpassword, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResetpasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.resetEmail;
      TextInputLayout resetEmail = ViewBindings.findChildViewById(rootView, id);
      if (resetEmail == null) {
        break missingId;
      }

      id = R.id.resetEmailEditText;
      TextInputEditText resetEmailEditText = ViewBindings.findChildViewById(rootView, id);
      if (resetEmailEditText == null) {
        break missingId;
      }

      id = R.id.resetPasswordBtn;
      MaterialButton resetPasswordBtn = ViewBindings.findChildViewById(rootView, id);
      if (resetPasswordBtn == null) {
        break missingId;
      }

      return new ActivityResetpasswordBinding((ConstraintLayout) rootView, imageView, resetEmail,
          resetEmailEditText, resetPasswordBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

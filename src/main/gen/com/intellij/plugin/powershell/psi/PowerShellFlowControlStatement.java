// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PowerShellFlowControlStatement extends PowerShellPsiElement {

  @Nullable
  PowerShellExpression getExpression();

  @Nullable
  PowerShellPipelineTail getPipelineTail();

  @NotNull
  List<PowerShellRedirection> getRedirectionList();

  @Nullable
  PowerShellVerbatimCommandArgument getVerbatimCommandArgument();

}
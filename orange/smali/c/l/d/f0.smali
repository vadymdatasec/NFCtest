.class public abstract Lc/l/d/f0;
.super Landroidx/activity/ComponentActivity;
.source "SourceFile"

# interfaces
.implements Lc/h/e/c;
.implements Lc/h/e/e;


# instance fields
.field public final j:Lc/l/d/p0;

.field public final k:Lc/n/l;

.field public l:Z

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    new-instance v0, Lc/l/d/e0;

    invoke-direct {v0, p0}, Lc/l/d/e0;-><init>(Lc/l/d/f0;)V

    invoke-static {v0}, Lc/l/d/p0;->a(Lc/l/d/r0;)Lc/l/d/p0;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    .line 3
    new-instance v0, Lc/n/l;

    invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V

    iput-object v0, p0, Lc/l/d/f0;->k:Lc/n/l;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lc/l/d/f0;->n:Z

    .line 5
    invoke-virtual {p0}, Lc/l/d/f0;->k()V

    return-void
.end method

.method public static a(Lc/l/d/o1;Lc/n/g$b;)Z
    .locals 5

    .line 3
    invoke-virtual {p0}, Lc/l/d/o1;->z()Ljava/util/List;

    move-result-object p0

    .line 4
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-nez v1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->v()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;

    move-result-object v2

    .line 7
    invoke-static {v2, p1}, Lc/l/d/f0;->a(Lc/l/d/o1;Lc/n/g$b;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 8
    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->T:Lc/l/d/y2;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v2}, Lc/l/d/y2;->g()Lc/n/g;

    move-result-object v2

    invoke-virtual {v2}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object v2

    sget-object v4, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {v2, v4}, Lc/n/g$b;->a(Lc/n/g$b;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 10
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->T:Lc/l/d/y2;

    invoke-virtual {v0, p1}, Lc/l/d/y2;->a(Lc/n/g$b;)V

    const/4 v0, 0x1

    .line 11
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->S:Lc/n/l;

    invoke-virtual {v2}, Lc/n/l;->a()Lc/n/g$b;

    move-result-object v2

    sget-object v4, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {v2, v4}, Lc/n/g$b;->a(Lc/n/g$b;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 12
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->S:Lc/n/l;

    invoke-virtual {v0, p1}, Lc/n/l;->d(Lc/n/g$b;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/l/d/p0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final a(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public a(Landroidx/fragment/app/Fragment;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-super {p0, v0, p1, p2}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    .line 4
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 7
    iget-boolean v1, p0, Lc/l/d/f0;->l:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 8
    iget-boolean v1, p0, Lc/l/d/f0;->m:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 9
    iget-boolean v1, p0, Lc/l/d/f0;->n:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    invoke-static {p0}, Lc/o/a/a;->a(Lc/n/j;)Lc/o/a/a;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Lc/o/a/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 12
    :cond_0
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->j()Lc/l/d/o1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/l/d/o1;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public j()Lc/l/d/o1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->j()Lc/l/d/o1;

    move-result-object v0

    return-object v0
.end method

.method public final k()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->c()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    new-instance v1, Lc/l/d/c0;

    invoke-direct {v1, p0}, Lc/l/d/c0;-><init>(Lc/l/d/f0;)V

    const-string v2, "android:support:fragments"

    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$b;)V

    .line 2
    new-instance v0, Lc/l/d/d0;

    invoke-direct {v0, p0}, Lc/l/d/d0;-><init>(Lc/l/d/f0;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->a(Lc/a/j/b;)V

    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0}, Lc/l/d/f0;->j()Lc/l/d/o1;

    move-result-object v0

    sget-object v1, Lc/n/g$b;->d:Lc/n/g$b;

    invoke-static {v0, v1}, Lc/l/d/f0;->a(Lc/l/d/o1;Lc/n/g$b;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->k:Lc/n/l;

    sget-object v1, Lc/n/g$a;->ON_RESUME:Lc/n/g$a;

    invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V

    .line 2
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->f()V

    return-void
.end method

.method public abstract n()V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->k()V

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->k()V

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 3
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0, p1}, Lc/l/d/p0;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lc/l/d/f0;->k:Lc/n/l;

    sget-object v0, Lc/n/g$a;->ON_CREATE:Lc/n/g$a;

    invoke-virtual {p1, v0}, Lc/n/l;->a(Lc/n/g$a;)V

    .line 3
    iget-object p1, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {p1}, Lc/l/d/p0;->b()V

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 2

    if-nez p1, :cond_0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    .line 2
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lc/l/d/p0;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lc/l/d/f0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Lc/l/d/f0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->c()V

    .line 3
    iget-object v0, p0, Lc/l/d/f0;->k:Lc/n/l;

    sget-object v1, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 2
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->d()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    iget-object p1, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {p1, p2}, Lc/l/d/p0;->a(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 3
    :cond_2
    iget-object p1, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {p1, p2}, Lc/l/d/p0;->b(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0, p1}, Lc/l/d/p0;->a(Z)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->k()V

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0, p2}, Lc/l/d/p0;->a(Landroid/view/Menu;)V

    .line 2
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/l/d/f0;->m:Z

    .line 3
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->e()V

    .line 4
    iget-object v0, p0, Lc/l/d/f0;->k:Lc/n/l;

    sget-object v1, Lc/n/g$a;->ON_PAUSE:Lc/n/g$a;

    invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0, p1}, Lc/l/d/p0;->b(Z)V

    return-void
.end method

.method public onPostResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    invoke-virtual {p0}, Lc/l/d/f0;->m()V

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0, p2, p3}, Lc/l/d/f0;->a(Landroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    .line 2
    iget-object p2, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {p2, p3}, Lc/l/d/p0;->b(Landroid/view/Menu;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->k()V

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->k()V

    .line 2
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/l/d/f0;->m:Z

    .line 4
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->i()Z

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->k()V

    .line 2
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lc/l/d/f0;->n:Z

    .line 4
    iget-boolean v0, p0, Lc/l/d/f0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lc/l/d/f0;->l:Z

    .line 6
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->a()V

    .line 7
    :cond_0
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->i()Z

    .line 8
    iget-object v0, p0, Lc/l/d/f0;->k:Lc/n/l;

    sget-object v1, Lc/n/g$a;->ON_START:Lc/n/g$a;

    invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V

    .line 9
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->g()V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->k()V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc/l/d/f0;->n:Z

    .line 3
    invoke-virtual {p0}, Lc/l/d/f0;->l()V

    .line 4
    iget-object v0, p0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0}, Lc/l/d/p0;->h()V

    .line 5
    iget-object v0, p0, Lc/l/d/f0;->k:Lc/n/l;

    sget-object v1, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V

    return-void
.end method

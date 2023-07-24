.class public abstract Landroidx/activity/ComponentActivity;
.super Lc/h/e/p;
.source "SourceFile"

# interfaces
.implements Lc/n/j;
.implements Lc/n/y;
.implements Lc/s/c;
.implements Lc/a/i;
.implements Lc/a/k/h;


# instance fields
.field public final c:Lc/a/j/a;

.field public final d:Lc/n/l;

.field public final e:Lc/s/b;

.field public f:Lc/n/x;

.field public final g:Landroidx/activity/OnBackPressedDispatcher;

.field public h:I

.field public final i:Lc/a/k/f;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc/h/e/p;-><init>()V

    .line 2
    new-instance v0, Lc/a/j/a;

    invoke-direct {v0}, Lc/a/j/a;-><init>()V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lc/a/j/a;

    .line 3
    new-instance v0, Lc/n/l;

    invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lc/n/l;

    .line 4
    invoke-static {p0}, Lc/s/b;->a(Lc/s/c;)Lc/s/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lc/s/b;

    .line 5
    new-instance v0, Landroidx/activity/OnBackPressedDispatcher;

    new-instance v1, Lc/a/b;

    invoke-direct {v1, p0}, Lc/a/b;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-direct {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->g:Landroidx/activity/OnBackPressedDispatcher;

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 7
    new-instance v0, Lc/a/c;

    invoke-direct {v0, p0}, Lc/a/c;-><init>(Landroidx/activity/ComponentActivity;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->i:Lc/a/k/f;

    .line 8
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 10
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;

    move-result-object v0

    new-instance v2, Landroidx/activity/ComponentActivity$3;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$3;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v2}, Lc/n/g;->a(Lc/n/i;)V

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;

    move-result-object v0

    new-instance v2, Landroidx/activity/ComponentActivity$4;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$4;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v2}, Lc/n/g;->a(Lc/n/i;)V

    .line 12
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;

    move-result-object v0

    new-instance v2, Landroidx/activity/ComponentActivity$5;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$5;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v2}, Lc/n/g;->a(Lc/n/i;)V

    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v1, v0, :cond_1

    const/16 v1, 0x17

    if-gt v0, v1, :cond_1

    .line 14
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;

    move-result-object v0

    new-instance v1, Landroidx/activity/ImmLeaksCleaner;

    invoke-direct {v1, p0}, Landroidx/activity/ImmLeaksCleaner;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lc/n/g;->a(Lc/n/i;)V

    .line 15
    :cond_1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->c()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    new-instance v1, Lc/a/d;

    invoke-direct {v1, p0}, Lc/a/d;-><init>(Landroidx/activity/ComponentActivity;)V

    const-string v2, "android:support:activity-result"

    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$b;)V

    .line 16
    new-instance v0, Lc/a/e;

    invoke-direct {v0, p0}, Lc/a/e;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->a(Lc/a/j/b;)V

    return-void

    .line 17
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic a(Landroidx/activity/ComponentActivity;)V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method public static synthetic b(Landroidx/activity/ComponentActivity;)Lc/a/k/f;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->i:Lc/a/k/f;

    return-object p0
.end method


# virtual methods
.method public final a(Lc/a/j/b;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lc/a/j/a;

    invoke-virtual {v0, p1}, Lc/a/j/a;->a(Lc/a/j/b;)V

    return-void
.end method

.method public final b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->g:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public final c()Landroidx/savedstate/SavedStateRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lc/s/b;

    invoke-virtual {v0}, Lc/s/b;->a()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lc/a/k/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->i:Lc/a/k/f;

    return-object v0
.end method

.method public f()Lc/n/x;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->h()V

    .line 3
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->f:Lc/n/x;

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Lc/n/g;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lc/n/l;

    return-object v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->f:Lc/n/x;

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/f;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, v0, Lc/a/f;->b:Lc/n/x;

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->f:Lc/n/x;

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->f:Lc/n/x;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lc/n/x;

    invoke-direct {v0}, Lc/n/x;-><init>()V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->f:Lc/n/x;

    :cond_1
    return-void
.end method

.method public i()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->i:Lc/a/k/f;

    invoke-virtual {v0, p1, p2, p3}, Lc/a/k/f;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->g:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->a()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lc/s/b;

    invoke-virtual {v0, p1}, Lc/s/b;->a(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lc/a/j/a;

    invoke-virtual {v0, p0}, Lc/a/j/a;->a(Landroid/content/Context;)V

    .line 3
    invoke-super {p0, p1}, Lc/h/e/p;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {p0}, Lc/n/t;->a(Landroid/app/Activity;)V

    .line 5
    iget p1, p0, Landroidx/activity/ComponentActivity;->h:I

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V

    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->i:Lc/a/k/f;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 2
    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 3
    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, -0x1

    .line 4
    invoke-virtual {v0, p1, v2, v1}, Lc/a/k/f;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->i()Ljava/lang/Object;

    move-result-object v0

    .line 2
    iget-object v1, p0, Landroidx/activity/ComponentActivity;->f:Lc/n/x;

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/f;

    if-eqz v2, :cond_0

    .line 4
    iget-object v1, v2, Lc/a/f;->b:Lc/n/x;

    :cond_0
    if-nez v1, :cond_1

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 5
    :cond_1
    new-instance v2, Lc/a/f;

    invoke-direct {v2}, Lc/a/f;-><init>()V

    .line 6
    iput-object v0, v2, Lc/a/f;->a:Ljava/lang/Object;

    .line 7
    iput-object v1, v2, Lc/a/f;->b:Lc/n/x;

    return-object v2
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lc/n/l;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lc/n/l;

    sget-object v1, Lc/n/g$b;->d:Lc/n/g$b;

    invoke-virtual {v0, v1}, Lc/n/l;->d(Lc/n/g$b;)V

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lc/h/e/p;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 5
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lc/s/b;

    invoke-virtual {v0, p1}, Lc/s/b;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public reportFullyDrawn()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lc/u/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportFullyDrawn() for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/u/a;->a(Ljava/lang/String;)V

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-le v0, v1, :cond_1

    .line 4
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    goto :goto_0

    .line 5
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v0, v1, :cond_2

    const-string v0, "android.permission.UPDATE_DEVICE_STATS"

    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    .line 6
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :cond_2
    :goto_0
    invoke-static {}, Lc/u/a;->a()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {}, Lc/u/a;->a()V

    .line 8
    throw v0
.end method

.method public abstract setContentView(I)V
.end method

.method public abstract setContentView(Landroid/view/View;)V
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 0
    .param p1    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

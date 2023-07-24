.class public Lc/n/t;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/n/t$a;
    }
.end annotation


# instance fields
.field public b:Lc/n/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 2
    invoke-static {p0}, Lc/n/t$a;->registerIn(Landroid/app/Activity;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Lc/n/t;

    invoke-direct {v2}, Lc/n/t;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 6
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1
    return-void
.end method

.method public static a(Landroid/app/Activity;Lc/n/g$a;)V
    .locals 1

    .line 7
    instance-of v0, p0, Lc/n/j;

    if-eqz v0, :cond_0

    .line 8
    check-cast p0, Lc/n/j;

    invoke-interface {p0}, Lc/n/j;->g()Lc/n/g;

    move-result-object p0

    .line 9
    instance-of v0, p0, Lc/n/l;

    if-eqz v0, :cond_0

    .line 10
    check-cast p0, Lc/n/l;

    invoke-virtual {p0, p1}, Lc/n/l;->a(Lc/n/g$a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lc/n/g$a;)V
    .locals 2

    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    .line 13
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p1}, Lc/n/t;->a(Landroid/app/Activity;Lc/n/g$a;)V

    :cond_0
    return-void
.end method

.method public final a(Lc/n/s;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 11
    invoke-interface {p1}, Lc/n/s;->onCreate()V

    :cond_0
    return-void
.end method

.method public final b(Lc/n/s;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Lc/n/s;->b()V

    :cond_0
    return-void
.end method

.method public final c(Lc/n/s;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Lc/n/s;->a()V

    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lc/n/t;->b:Lc/n/s;

    invoke-virtual {p0, p1}, Lc/n/t;->a(Lc/n/s;)V

    .line 3
    sget-object p1, Lc/n/g$a;->ON_CREATE:Lc/n/g$a;

    invoke-virtual {p0, p1}, Lc/n/t;->a(Lc/n/g$a;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 2
    sget-object v0, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lc/n/t;->b:Lc/n/s;

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 2
    sget-object v0, Lc/n/g$a;->ON_PAUSE:Lc/n/g$a;

    invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 2
    iget-object v0, p0, Lc/n/t;->b:Lc/n/s;

    invoke-virtual {p0, v0}, Lc/n/t;->b(Lc/n/s;)V

    .line 3
    sget-object v0, Lc/n/g$a;->ON_RESUME:Lc/n/g$a;

    invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 2
    iget-object v0, p0, Lc/n/t;->b:Lc/n/s;

    invoke-virtual {p0, v0}, Lc/n/t;->c(Lc/n/s;)V

    .line 3
    sget-object v0, Lc/n/g$a;->ON_START:Lc/n/g$a;

    invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 2
    sget-object v0, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V

    return-void
.end method

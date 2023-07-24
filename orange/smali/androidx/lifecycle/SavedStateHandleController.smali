.class public final Landroidx/lifecycle/SavedStateHandleController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/n/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/SavedStateHandleController$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public final c:Lc/n/u;


# direct methods
.method public static a(Lc/n/v;Landroidx/savedstate/SavedStateRegistry;Lc/n/g;)V
    .locals 1

    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    .line 10
    invoke-virtual {p0, v0}, Lc/n/v;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/SavedStateHandleController;

    if-eqz p0, :cond_0

    .line 11
    invoke-virtual {p0}, Landroidx/lifecycle/SavedStateHandleController;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/SavedStateHandleController;->a(Landroidx/savedstate/SavedStateRegistry;Lc/n/g;)V

    .line 13
    invoke-static {p1, p2}, Landroidx/lifecycle/SavedStateHandleController;->b(Landroidx/savedstate/SavedStateRegistry;Lc/n/g;)V

    :cond_0
    return-void
.end method

.method public static b(Landroidx/savedstate/SavedStateRegistry;Lc/n/g;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object v0

    .line 2
    sget-object v1, Lc/n/g$b;->c:Lc/n/g$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {v0, v1}, Lc/n/g$b;->a(Lc/n/g$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Landroidx/lifecycle/SavedStateHandleController$1;

    invoke-direct {v0, p1, p0}, Landroidx/lifecycle/SavedStateHandleController$1;-><init>(Lc/n/g;Landroidx/savedstate/SavedStateRegistry;)V

    invoke-virtual {p1, v0}, Lc/n/g;->a(Lc/n/i;)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    const-class p1, Landroidx/lifecycle/SavedStateHandleController$a;

    invoke-virtual {p0, p1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/Class;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Landroidx/savedstate/SavedStateRegistry;Lc/n/g;)V
    .locals 1

    .line 2
    iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z

    .line 4
    invoke-virtual {p2, p0}, Lc/n/g;->a(Lc/n/i;)V

    .line 5
    iget-object p2, p0, Landroidx/lifecycle/SavedStateHandleController;->a:Ljava/lang/String;

    iget-object v0, p0, Landroidx/lifecycle/SavedStateHandleController;->c:Lc/n/u;

    invoke-virtual {v0}, Lc/n/u;->a()Landroidx/savedstate/SavedStateRegistry$b;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$b;)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached to lifecycleOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lc/n/j;Lc/n/g$a;)V
    .locals 1

    .line 7
    sget-object v0, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    .line 8
    iput-boolean p2, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z

    .line 9
    invoke-interface {p1}, Lc/n/j;->g()Lc/n/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V

    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z

    return v0
.end method

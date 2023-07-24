.class public Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/n/h;
.implements Lc/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/OnBackPressedDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LifecycleOnBackPressedCancellable"
.end annotation


# instance fields
.field public final a:Lc/n/g;

.field public final b:Lc/a/g;

.field public c:Lc/a/a;

.field public final synthetic d:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;Lc/n/g;Lc/a/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->d:Landroidx/activity/OnBackPressedDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->a:Lc/n/g;

    .line 3
    iput-object p3, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Lc/a/g;

    .line 4
    invoke-virtual {p2, p0}, Lc/n/g;->a(Lc/n/i;)V

    return-void
.end method


# virtual methods
.method public a(Lc/n/j;Lc/n/g$a;)V
    .locals 0

    .line 1
    sget-object p1, Lc/n/g$a;->ON_START:Lc/n/g$a;

    if-ne p2, p1, :cond_0

    .line 2
    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->d:Landroidx/activity/OnBackPressedDispatcher;

    iget-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Lc/a/g;

    invoke-virtual {p1, p2}, Landroidx/activity/OnBackPressedDispatcher;->a(Lc/a/g;)Lc/a/a;

    move-result-object p1

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lc/a/a;

    goto :goto_0

    .line 3
    :cond_0
    sget-object p1, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    if-ne p2, p1, :cond_1

    .line 4
    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lc/a/a;

    if-eqz p1, :cond_2

    .line 5
    invoke-interface {p1}, Lc/a/a;->cancel()V

    goto :goto_0

    .line 6
    :cond_1
    sget-object p1, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    if-ne p2, p1, :cond_2

    .line 7
    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->cancel()V

    :cond_2
    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->a:Lc/n/g;

    invoke-virtual {v0, p0}, Lc/n/g;->b(Lc/n/i;)V

    .line 2
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Lc/a/g;

    invoke-virtual {v0, p0}, Lc/a/g;->b(Lc/a/a;)V

    .line 3
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lc/a/a;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lc/a/a;->cancel()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lc/a/a;

    :cond_0
    return-void
.end method

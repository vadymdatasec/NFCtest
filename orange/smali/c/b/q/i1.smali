.class public Lc/b/q/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/q/p1;


# direct methods
.method public constructor <init>(Lc/b/q/p1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/i1;->b:Lc/b/q/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/i1;->b:Lc/b/q/p1;

    invoke-virtual {v0}, Lc/b/q/p1;->j()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/b/q/i1;->b:Lc/b/q/p1;

    invoke-virtual {v0}, Lc/b/q/p1;->a()V

    :cond_0
    return-void
.end method

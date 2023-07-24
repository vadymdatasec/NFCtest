.class public Le/b/a/z/c0;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le/b/a/z/d0;


# direct methods
.method public constructor <init>(Le/b/a/z/d0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/z/c0;->a:Le/b/a/z/d0;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 1
    invoke-static {}, Le/b/a/e0/t;->b()V

    .line 2
    iget-object v0, p0, Le/b/a/z/c0;->a:Le/b/a/z/d0;

    iget-boolean v1, v0, Le/b/a/z/d0;->a:Z

    .line 3
    iput-boolean p1, v0, Le/b/a/z/d0;->a:Z

    if-eq v1, p1, :cond_0

    .line 4
    iget-object v0, v0, Le/b/a/z/d0;->b:Le/b/a/z/c;

    invoke-interface {v0, p1}, Le/b/a/z/c;->a(Z)V

    :cond_0
    return-void
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/z/b0;

    invoke-direct {v0, p0, p1}, Le/b/a/z/b0;-><init>(Le/b/a/z/c0;Z)V

    invoke-static {v0}, Le/b/a/e0/t;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAvailable(Landroid/net/Network;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/z/c0;->b(Z)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/z/c0;->b(Z)V

    return-void
.end method

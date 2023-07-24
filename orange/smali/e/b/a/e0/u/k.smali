.class public Le/b/a/e0/u/k;
.super Le/b/a/e0/u/l;
.source "SourceFile"


# instance fields
.field public volatile a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Le/b/a/e0/u/l;-><init>(Le/b/a/e0/u/j;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/b/a/e0/u/k;->a:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already released"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Le/b/a/e0/u/k;->a:Z

    return-void
.end method

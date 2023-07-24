.class public Lb/a/a/b/e;
.super Lb/a/a/b/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lb/a/a/b/g;


# direct methods
.method public constructor <init>(Lb/a/a/b/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb/a/a/b/e;->a:Lb/a/a/b/g;

    invoke-direct {p0}, Lb/a/a/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb/a/a/b/e;->a:Lb/a/a/b/g;

    iget-object v1, v0, Lb/a/a/b/g;->b:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 2
    new-instance v2, Lb/a/a/b/f;

    invoke-direct {v2, v0, p1, p2}, Lb/a/a/b/f;-><init>(Lb/a/a/b/g;ILandroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1, p2}, Lb/a/a/b/g;->a(ILandroid/os/Bundle;)V

    :goto_0
    return-void
.end method

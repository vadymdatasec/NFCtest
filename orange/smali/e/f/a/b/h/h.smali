.class public Le/f/a/b/h/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/b/h/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/f0<",
            "TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    iput-object v0, p0, Le/f/a/b/h/h;->a:Le/f/a/b/h/f0;

    return-void
.end method


# virtual methods
.method public a()Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/f/a/b/h/h;->a:Le/f/a/b/h/f0;

    return-object v0
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/a/b/h/h;->a:Le/f/a/b/h/f0;

    invoke-virtual {v0, p1}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/b/h/h;->a:Le/f/a/b/h/f0;

    invoke-virtual {v0, p1}, Le/f/a/b/h/f0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/Exception;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/a/b/h/h;->a:Le/f/a/b/h/f0;

    invoke-virtual {v0, p1}, Le/f/a/b/h/f0;->b(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/b/h/h;->a:Le/f/a/b/h/f0;

    invoke-virtual {v0, p1}, Le/f/a/b/h/f0;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

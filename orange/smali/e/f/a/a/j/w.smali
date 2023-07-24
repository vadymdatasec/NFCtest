.class public abstract Le/f/a/a/j/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g()Le/f/a/a/j/v;
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/j/e;

    invoke-direct {v0}, Le/f/a/a/j/e;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a()Le/f/a/a/b;
.end method

.method public abstract b()Le/f/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/a/c<",
            "*>;"
        }
    .end annotation
.end method

.method public c()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/w;->d()Le/f/a/a/e;

    move-result-object v0

    invoke-virtual {p0}, Le/f/a/a/j/w;->b()Le/f/a/a/c;

    move-result-object v1

    invoke-virtual {v1}, Le/f/a/a/c;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Le/f/a/a/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public abstract d()Le/f/a/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/a/e<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract e()Le/f/a/a/j/x;
.end method

.method public abstract f()Ljava/lang/String;
.end method

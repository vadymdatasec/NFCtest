.class public abstract Lm/b/k/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lm/b/k/q0;Lm/b/i/l;)Lm/b/k/f;
    .locals 3

    .line 1
    new-instance v0, Lm/b/k/f;

    invoke-direct {v0}, Lm/b/k/f;-><init>()V

    .line 2
    new-instance v1, Lm/b/k/r0;

    new-instance v2, Lm/b/k/a;

    invoke-direct {v2, p1, v0, p0}, Lm/b/k/a;-><init>(Lm/b/i/l;Lm/b/k/f;Lm/b/k/q0;)V

    invoke-direct {v1, v2}, Lm/b/k/r0;-><init>(Lm/b/k/s0;)V

    invoke-virtual {v1, p1}, Lm/b/k/r0;->a(Lm/b/i/t;)V

    return-object v0
.end method

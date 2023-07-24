.class public Lm/b/k/a1;
.super Lm/b/k/q0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/k/q0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/l;Lm/b/i/l;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

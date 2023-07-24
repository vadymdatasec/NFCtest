.class public final Lm/b/k/j0;
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

    .line 1
    invoke-virtual {p2}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    instance-of p1, p1, Lm/b/i/i;

    if-nez p1, :cond_0

    invoke-virtual {p2}, Lm/b/i/l;->A()Lm/b/k/f;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":only-child"

    return-object v0
.end method

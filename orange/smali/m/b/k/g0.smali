.class public final Lm/b/k/g0;
.super Lm/b/k/u;
.source "SourceFile"


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lm/b/k/u;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "nth-last-child"

    return-object v0
.end method

.method public b(Lm/b/i/l;Lm/b/i/l;)I
    .locals 0

    .line 1
    invoke-virtual {p2}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->r()Lm/b/k/f;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p2}, Lm/b/i/l;->t()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

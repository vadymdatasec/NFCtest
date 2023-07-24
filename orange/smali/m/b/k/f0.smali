.class public final Lm/b/k/f0;
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

    const-string v0, "nth-child"

    return-object v0
.end method

.method public b(Lm/b/i/l;Lm/b/i/l;)I
    .locals 0

    .line 1
    invoke-virtual {p2}, Lm/b/i/l;->t()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

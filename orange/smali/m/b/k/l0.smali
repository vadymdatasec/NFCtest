.class public final Lm/b/k/l0;
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
    .locals 2

    .line 1
    instance-of v0, p1, Lm/b/i/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lm/b/i/l;->d(I)Lm/b/i/l;

    move-result-object p1

    :cond_0
    if-ne p2, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":root"

    return-object v0
.end method

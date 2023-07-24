.class public final enum Lm/b/j/d1;
.super Lm/b/j/i3;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lm/b/j/i3;-><init>(Ljava/lang/String;ILm/b/j/d1;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/s0;Lm/b/j/a;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lm/b/j/a;->j()C

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x26

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p2}, Lm/b/j/a;->c()Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-virtual {p1, p2}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p2, Lm/b/j/l0;

    invoke-direct {p2}, Lm/b/j/l0;-><init>()V

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/q0;)V

    goto :goto_0

    .line 5
    :cond_1
    sget-object p2, Lm/b/j/i3;->i:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    .line 6
    :cond_2
    sget-object p2, Lm/b/j/i3;->c:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    .line 7
    :cond_3
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 8
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result p2

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(C)V

    :goto_0
    return-void
.end method

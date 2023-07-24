.class public final enum Lm/b/j/q1;
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
    .locals 1

    .line 1
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result p2

    if-eqz p2, :cond_4

    const/16 v0, 0x2d

    if-eq p2, v0, :cond_3

    const/16 v0, 0x3c

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(C)V

    .line 3
    sget-object p2, Lm/b/j/i3;->D:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 5
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(C)V

    .line 7
    sget-object p2, Lm/b/j/i3;->g:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(C)V

    .line 9
    sget-object p2, Lm/b/j/i3;->G:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(C)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    const p2, 0xfffd

    .line 12
    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(C)V

    .line 13
    sget-object p2, Lm/b/j/i3;->D:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    :goto_0
    return-void
.end method

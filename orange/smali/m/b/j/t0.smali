.class public final enum Lm/b/j/t0;
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
    invoke-virtual {p2}, Lm/b/j/a;->h()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v1, v0}, Lm/b/j/o0;->c(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result p2

    if-eqz p2, :cond_4

    const/16 v0, 0x20

    if-eq p2, v0, :cond_3

    const/16 v0, 0x2f

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    const/16 v0, 0x9

    if-eq p2, v0, :cond_3

    const/16 v0, 0xa

    if-eq p2, v0, :cond_3

    const/16 v0, 0xc

    if-eq p2, v0, :cond_3

    const/16 v0, 0xd

    if-eq p2, v0, :cond_3

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
    invoke-virtual {p1}, Lm/b/j/s0;->h()V

    .line 7
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 8
    :cond_2
    sget-object p2, Lm/b/j/i3;->Q:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 9
    :cond_3
    sget-object p2, Lm/b/j/i3;->I:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 10
    :cond_4
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-static {}, Lm/b/j/i3;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm/b/j/o0;->c(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
